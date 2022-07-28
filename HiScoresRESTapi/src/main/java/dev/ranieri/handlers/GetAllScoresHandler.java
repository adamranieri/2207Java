package dev.ranieri.handlers;

import com.google.gson.Gson;
import dev.ranieri.app.App;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class GetAllScoresHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        Gson gson = new Gson();
        String json = gson.toJson(App.scores);
        ctx.result(json);
    }
}
