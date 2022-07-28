package dev.ranieri.handlers;

import com.google.gson.Gson;
import dev.ranieri.app.App;
import dev.ranieri.entities.Score;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class CreateScoreHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        String body = ctx.body(); // read in the body
        Gson gson = new Gson(); // get a Gson object
        Score score = gson.fromJson(body,Score.class); // create a Java Score Object from the JSON String

        App.scores.add(score);// add the sent score to my list
        ctx.status(201);
        ctx.result("Created new score");

        System.out.println(App.scores);

    }
}
