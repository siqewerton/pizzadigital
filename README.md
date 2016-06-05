# pizzadigital
 
 PizzaDigital Inc.  | RESTful Web Service: Java + Spark + MongoDB
 
 Esta é a dependência do framework Spark:
 ```
 <dependency>
    <groupId>com.sparkjava</groupId>
    <artifactId>spark-core</artifactId>
    <version>2.5</version>
</dependency>
 ```
 
 Exemplo do código:
 ```
 import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
```
