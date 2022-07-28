package dev.ranieri.entities;

// An entity is a class that usually contains minimal logic.
// Is usually just some fields. And eventually saved in a database.
// beans: are classes that have private fields, but public getters and setters. Have a no args constructor
public class Score {

    private int id; // Always have one field that is an id for an entity
    private String initials;
    private int points;

    public Score(){

    }

    public Score(int id, String initials, int points) {
        this.id = id;
        this.initials = initials;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", initials='" + initials + '\'' +
                ", points=" + points +
                '}';
    }
}
