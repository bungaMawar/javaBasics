package com.shafiya.java;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player is knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
