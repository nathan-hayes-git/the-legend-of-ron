package com.ron.tlor;

public abstract class Monster {
    private String monsterName;
    
    public String gameOver() {
        return "You've been eaten by a monster!";
    }
    public abstract String makeNoise();
}
