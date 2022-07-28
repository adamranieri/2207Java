package dev.ranieri.app;

import dev.ranieri.handlers.AddHandler;
import dev.ranieri.handlers.GreetingsHandler;
import dev.ranieri.handlers.HelloHandler;
import dev.ranieri.handlers.HolaHandler;
import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {

        Javalin app = Javalin.create();
        HelloHandler helloHandler = new HelloHandler();// make an instance of my handler object
        HolaHandler holaHandler = new HolaHandler();
        GreetingsHandler greetingsHandler = new GreetingsHandler();
        AddHandler addHandler = new AddHandler();

        // define the routes of our web server
        app.get("/hello",helloHandler);
        app.get("/hola",holaHandler);
        app.get("/greetings/{name}", greetingsHandler);
        app.get("/add/{num1}/{num2}", addHandler);


        app.start();
    }
}
