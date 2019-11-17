package com.myspringboot.demo.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal
import java.time.DayOfWeek
import java.time.LocalDateTime

@RestController
@RequestMapping("/api")
class MyRestController {

    @GetMapping("/greeting")
    fun  getGreeting():String {
       return  "Hello World"
    }

    @PostMapping(path = ["/ordersAnalyzer"],consumes = ["application/json"],produces = ["application/json"])
    fun ordersAnalyzer(@RequestBody orders: List<Order>):Map<DayOfWeek,Int> {
        return totalDailySales(orders)
    }


    companion object OrdersAnalyzer {
        private val logger = LoggerFactory.getLogger(javaClass)
        data class Order(val orderId: Int, val creationDate: LocalDateTime, val orderLines: List<OrderLine>)

        data class OrderLine(val productId: Int, val name: String, val quantity: Int, val unitPrice: BigDecimal)

        fun totalDailySales(orders: List<Order>): Map<DayOfWeek, Int> {
            logger.info("input is: $orders")
            val totalDailySales =  orders.groupingBy { it.creationDate.dayOfWeek}
                    .fold(0) { acc, (_, _, matchCount) ->  acc+ matchCount
                    .sumBy { orderLine -> orderLine.quantity } }
            logger.info("output is: $totalDailySales")
            return totalDailySales;
        }
    }
}
