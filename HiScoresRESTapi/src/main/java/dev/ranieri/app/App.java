package dev.ranieri.app;

import dev.ranieri.entities.Score;
import dev.ranieri.handlers.CreateScoreHandler;
import dev.ranieri.handlers.GetAllScoresHandler;
import dev.ranieri.handlers.GetSpecificScoreHandler;
import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<Score> scores = new ArrayList();// hold the scores on my server

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        CreateScoreHandler createScoreHandler = new CreateScoreHandler();
        GetAllScoresHandler getAllScoresHandler = new GetAllScoresHandler();
        GetSpecificScoreHandler getSpecificScoreHandler = new GetSpecificScoreHandler();

        app.get("/scores",getAllScoresHandler);// should return ALL scores
        app.get("/scores/{id}", getSpecificScoreHandler);
        app.post("/scores", createScoreHandler); // should ADD a new score to my scores

        app.start();
    }
}
