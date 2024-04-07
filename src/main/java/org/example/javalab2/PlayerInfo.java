package org.example.javalab2;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "players")
public class PlayerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String nickname;

    public int wins = 0;

    @Transient
    public String color;
    @Transient
    public ArrowInfo arrow = new ArrowInfo();
    @Transient
    public int shots = 0;
    @Transient
    public int score = 0;
    @Transient
    public boolean wantToPause = false;
    @Transient
    public boolean wantToStart = false;
    @Transient
    public boolean shooting = false;

    public PlayerInfo() {
    }

    public PlayerInfo(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public int getWins() {
        return wins;
    }

    public static PlayerInfo loadOrCreateByName(String nickname) {
        PlayerInfo player = null;
        // Code to load or create player by name goes here
        return player != null ? player : new PlayerInfo(nickname);
    }

    public void increaseWins() {
        ++wins;
        // Code to increase wins goes here
    }

    public static List<PlayerInfo> getAllPlayers() {
        List<PlayerInfo> allPlayers = new ArrayList<>();
        // Code to get all players goes here
        return allPlayers;
    }
}
