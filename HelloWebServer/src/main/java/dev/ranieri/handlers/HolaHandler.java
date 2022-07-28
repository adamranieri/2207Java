package dev.ranieri.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class HolaHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        ctx.result("Hola todos!!");
    }
}
