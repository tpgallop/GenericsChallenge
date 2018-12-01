package com.tomgallop;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("World Cup");
        Team<FootballPlayer> readingFC = new Team<>("Reading FC");
        Team<FootballPlayer> englandFC = new Team<>("England FC");
        Team<FootballPlayer> manchesterFC = new Team<>("Manchester FC");
        Team<FootballPlayer> scotlandFC = new Team<>("Scotland FC");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        readingFC.matchResult(englandFC,3,8);
        englandFC.matchResult(manchesterFC,1,0);
        scotlandFC.matchResult(manchesterFC,2,1);

        footballLeague.add(readingFC);
        footballLeague.add(englandFC);
        footballLeague.add(manchesterFC);
        footballLeague.add(scotlandFC);

//        footballLeague.add(baseballTeam); Error check
        footballLeague.showLeagueTable();
    }
}
