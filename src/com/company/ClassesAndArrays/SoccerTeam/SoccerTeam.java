package com.company.ClassesAndArrays.SoccerTeam;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    static int gamesPlayed;
    static int totalGoals;

    public SoccerTeam (){
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        gamesPlayed++;
        totalGoals += myScore + otherScore;

        if(myScore == otherScore){
            ties++;
            other.ties++;
        }
        else if(myScore > otherScore){
            wins++;
            other.losses++;
        }
        else{
            losses++;
            other.wins++;
        }
    }
    public void reset(){
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public int getPoints(){
        return (wins * 3) + ties;
    }
    static int getGoals(){
        return totalGoals;
    }
    static int getGames(){
        return gamesPlayed;
    }
    static void startTournament(){
        totalGoals = 0;
        gamesPlayed = 0;
    }
    public String toString(){
        return "Record: " + wins + " - " + losses + " - " + ties;
    }

    public static void main(String[] args) {
        SoccerTeam team1 = new SoccerTeam();
        SoccerTeam team2 = new SoccerTeam();
        SoccerTeam team3 = new SoccerTeam();
        SoccerTeam team4 = new SoccerTeam();

        startTournament();
        System.out.println("Tournament Number 1");

        team1.played(team4,6,5);
        team2.played(team3,5,0);

        team1.played(team3, 4, 5);
        team2.played(team4, 3,2);

        team1.played(team2,1,1);
        team3.played(team4, 3,2);

        System.out.println("Team 1 points: " + team1.getPoints() + " " + team1);
        System.out.println("Team 2 points: " + team2.getPoints() + " " + team2);
        System.out.println("Team 3 points: " + team3.getPoints() + " " + team3);
        System.out.println("Team 4 points: " + team4.getPoints() + " " + team4);

        System.out.println();

        team1.reset();
        team2.reset();
        team3.reset();
        team4.reset();

        startTournament();
        System.out.println("Tournament Number 2");

        team1.played(team4,11,0);
        team2.played(team3,2,0);

        team1.played(team3, 6, 7);
        team2.played(team4, 0,0);

        team1.played(team2,0,1);
        team3.played(team4, 4,2);

        System.out.println("Team 1 points: " + team1.getPoints() + " " + team1);
        System.out.println("Team 2 points: " + team2.getPoints() + " " + team2);
        System.out.println("Team 3 points: " + team3.getPoints() + " " + team3);
        System.out.println("Team 4 points: " + team4.getPoints() + " " + team4);
    }
}

/*
Tournament Number 1
Team 1 points: 4 Record: 1 - 1 - 1
Team 2 points: 7 Record: 2 - 0 - 1
Team 3 points: 6 Record: 2 - 1 - 0
Team 4 points: 0 Record: 0 - 3 - 0
Tournament Number 2
Team 1 points: 3 Record: 1 - 2 - 0
Team 2 points: 7 Record: 2 - 0 - 1
Team 3 points: 6 Record: 2 - 1 - 0
Team 4 points: 1 Record: 0 - 2 - 1
*/