# kotlin_with_springBoot
Spring boot with rest api controller.<br>
Please view Kotlin exercise on com.myspringboot.demo.controller.MyRestController

<b>how to run?</b><br>
go to the project folder in the Terminal
1. mvn clean install
2. java -jar target/demo-0.0.1-SNAPSHOT.jar

<b>or simply run in from Intelij</b>

send http post request via postman to :<br>
http://localhost:8080/api/ordersAnalyzer
with example request body json:
```
[
    {
        "orderId": 554,
        "creationDate": "2017-03-25T10:35:20",
        "orderLines": [
            {
                "productId": 9872,
                "name": "Pencil",
                "quantity": 3,
                "unitPrice": 3
            }
        ]
    },
    {
        "orderId": 555,
        "creationDate": "2017-03-25T11:24:20",
        "orderLines": [
            {
                "productId": 9872,
                "name": "Pencil",
                "quantity": 2,
                "unitPrice": 3
            },
            {
                "productId": 1746,
                "name": "Eraser",
                "quantity": 1,
                "unitPrice": 1
            }
        ]
    },
    {
        "orderId": 453,
        "creationDate": "2017-03-27T14:53:12",
        "orderLines": [
            {
                "productId": 5723,
                "name": "Pencil",
                "quantity": 4,
                "unitPrice": 4.22
            },
            {
                "productId": 9872,
                "name": "Pencil",
                "quantity": 3,
                "unitPrice": 3.12
            },
            {
                "productId": 3433,
                "name": "Pencil",
                "quantity": 1,
                "unitPrice": 6.15
            }
        ]
    },
    {
        "orderId": 431,
        "creationDate": "2017-03-20T12:15:02",
        "orderLines": [
            {
                "productId": 5723,
                "name": "Pencil",
                "quantity": 7,
                "unitPrice": 4.22
            },
            {
                "productId": 3433,
                "name": "Pencil",
                "quantity": 2,
                "unitPrice": 6.15
            }
        ]
    },
    {
        "orderId": 690,
        "creationDate": "2017-03-26T11:14:00",
        "orderLines": [
            {
                "productId": 9872,
                "name": "Pencil",
                "quantity": 4,
                "unitPrice": 3.12
            },
            {
                "productId": 4098,
                "name": "Pencil",
                "quantity": 5,
                "unitPrice": 4.5
            }
        ]
    }
]
```

