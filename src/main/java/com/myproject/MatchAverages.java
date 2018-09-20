package com.myproject;

import java.io.Serializable;

public class MatchAverages implements Serializable{

    private int totalMatches = 0;
    private int totalBaronKills = 0;
    private int totalDragonKills = 0;
    private int totalFirstBlood = 0;
    private int totalTowerKills = 0;
    private int totalWins;

    private long avgBaronKills;
    private long avgDragonKills;
    private long avgFirstBlood;
    private long avgTowerKills;
    private long avgTotalWins;

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public int getTotalBaronKills() {
        return totalBaronKills;
    }

    public void setTotalBaronKills(int totalBaronKills) {
        this.totalBaronKills = totalBaronKills;
    }

    public int getTotalDragonKills() {
        return totalDragonKills;
    }

    public void setTotalDragonKills(int totalDragonKills) {
        this.totalDragonKills = totalDragonKills;
    }

    public int getTotalFirstBlood() {
        return totalFirstBlood;
    }

    public void setTotalFirstBlood(int totalFirstBlood) {
        this.totalFirstBlood = totalFirstBlood;
    }

    public int getTotalTowerKills() {
        return totalTowerKills;
    }

    public void setTotalTowerKills(int totalTowerKills) {
        this.totalTowerKills = totalTowerKills;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public long getAvgBaronKills() {
        return avgBaronKills;
    }

    public void setAvgBaronKills(long avgBaronKills) {
        this.avgBaronKills = avgBaronKills;
    }

    public long getAvgDragonKills() {
        return avgDragonKills;
    }

    public void setAvgDragonKills(long avgDragonKills) {
        this.avgDragonKills = avgDragonKills;
    }

    public long getAvgFirstBlood() {
        return avgFirstBlood;
    }

    public void setAvgFirstBlood(long avgFirstBlood) {
        this.avgFirstBlood = avgFirstBlood;
    }

    public long getAvgTowerKills() {
        return avgTowerKills;
    }

    public void setAvgTowerKills(long avgTowerKills) {
        this.avgTowerKills = avgTowerKills;
    }

    public long getAvgTotalWins() {
        return avgTotalWins;
    }

    public void setAvgTotalWins(long avgTotalWins) {
        this.avgTotalWins = avgTotalWins;
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NL = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " {" + NL);
        result.append(" totalMatches: " + totalMatches + NL);
        result.append(" totalBaronKills: " + totalBaronKills + NL);
        result.append(" totalDragonKills: " + totalDragonKills + NL );
        result.append(" totalFirstBlood: " + totalFirstBlood + NL);
        result.append(" totalTowerKills: " + totalTowerKills + NL);
        result.append(" totalWins: " + totalWins + NL);
        result.append(" totalFirstBlood: " + totalFirstBlood + NL);
        result.append("}");

        return result.toString();

    }
}

