package com.example.javaassignment1;

public class Player {
    private String playerName, countryPlayedFor;
    private int matchesPlayed;
    private static int runsScored;
    private int ballsFaced;
    private int playerId;
    private double strikeRate;

    public Player(int playerId, String playerName, String countryPlayedFor, int matchesPlayed, int runsScored, int ballsFaced, double strikeRate) {
        this.playerName = playerName;
        this.countryPlayedFor = countryPlayedFor;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
        this.ballsFaced = ballsFaced;
        this.playerId = playerId;
        this.strikeRate = strikeRate;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCountryPlayedFor() {
        return countryPlayedFor;
    }

    public void setCountryPlayedFor(String countryPlayedFor) {
        this.countryPlayedFor = countryPlayedFor;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public static int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        Player.runsScored = runsScored;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }
}
