package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Shafiya";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 50;
//        player.loseHealth(damage);
//        System.out.println("Health Remaining: " + player.healthRemaining());
//
//        damage = 51;
//        player.health = 300;
//        player.loseHealth(damage);
//        System.out.println("Health Remaining: " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Shafiya", 50, "Bow");
        System.out.println("Initial health is " + player.getHealth());
    }
}