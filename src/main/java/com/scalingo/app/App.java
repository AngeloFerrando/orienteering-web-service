package com.scalingo.app;

/**
 * @author Angelo Ferrando
 * @version 2018/02/08
 */

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        int port = 4567;
        if(System.getenv("PORT") != null) {
            port = Integer.parseInt(System.getenv("PORT"));
        }
        setPort(port);
        get("/hello", (req, res) -> "Hello World");
        //test
    }
}
