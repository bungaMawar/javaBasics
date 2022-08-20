package com.shafiya.java;

public class Main {
    public static void main(String[] args) {
        FootballPlayer wel = new FootballPlayer("Wel");
        BaseballPlayer jev = new BaseballPlayer("Jev");
        SoccerPlayer imp = new SoccerPlayer("Imp");

        Team<FootballPlayer> starTeam = new Team<>("Star");
        starTeam.addPlayer(wel);
//        starTeam.addPlayer(doc);
//        starTeam.addPlayer(imp);
        System.out.println(starTeam.numPlayers());

        Team<BaseballPlayer> greenTeam = new Team<>("Green");
        greenTeam.addPlayer(jev);
        
    }
}