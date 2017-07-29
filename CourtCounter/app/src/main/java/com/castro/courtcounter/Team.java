package com.castro.courtcounter;

/**
 * Created by Joao Paulo de Castro Bento Pereira on 29/07/2017.
 */

public class Team {

    private String name;
    private int score;

    public Team ( ) {
    }

    public Team (String name){
        this.name = name;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore (int score){
        this.score += score;
    }

    public void resetScore (){
        this.score = 0;
    }
}
