package dev.ranieri.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class GreetingsHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        String name = ctx.pathParam("name"); // will get a path param
        ctx.result("Greetings " + name);
    }
}
