package dev.ranieri.handlers;

import com.google.gson.Gson;
import dev.ranieri.app.App;
import dev.ranieri.entities.Score;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class GetSpecificScoreHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        int id = Integer.parseInt(ctx.pathParam("id"));

        for(Score s : App.scores){
            if(s.getId() == id){
                Score score = s;
                Gson gson = new Gson();
                String json = gson.toJson(score);
                ctx.result(json);
                return;
            }
        }

        ctx.status(404);
        ctx.result("Could not find");

    }
}
