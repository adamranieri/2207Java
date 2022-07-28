package dev.ranieri.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

// The handler interface is provided by Javalin
// A handler is an object that can respond to HTTP requests
// A handler has a single method me must implement called handle
// handle method has a Context object as a parameter.
// The object you will use for reading the HTTP request and handling the HTTP response
public class HelloHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        ctx.result("Hello Everyone!!!!");// ctx.result will send an http response with the string as the response body
    }
}
