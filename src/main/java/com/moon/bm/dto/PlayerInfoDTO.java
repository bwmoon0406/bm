package com.moon.bm.dto;

import lombok.Data;

@Data
public class PlayerInfoDTO {
    private int playerId;
    private String playerName;
    private String position;
    private int age;
    private int height;
    private int quarter;
    private int assist;
    private int block;
    private int steel;
    private int rebound;
    private int offensiveRebound;
    private int defensiveRebound;
    private int turnover;
    private int point;
    private int backNumber;
    private double averagePoint;
    private double averageAssist;
    private double averageSteel;
    private double averageBlock;
    private double averageRebound;
    private double averageOr;
    private double averageDr;
    private double averageTurnover;
    private double averageGame;
}
