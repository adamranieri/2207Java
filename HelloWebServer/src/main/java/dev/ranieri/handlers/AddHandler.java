package dev.ranieri.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class AddHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        String num1 = ctx.pathParam("num1");
        String num2 = ctx.pathParam("num2");

        try{
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);
            ctx.result("The sum is " + (n1 + n2));
        }catch (NumberFormatException e){
            ctx.status(422);
            ctx.result("unable to add numbers");
        }

    }
}
