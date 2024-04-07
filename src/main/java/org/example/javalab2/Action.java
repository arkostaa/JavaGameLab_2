package org.example.javalab2;

public record Action(Type type, String info) {
    public enum Type {
        New,
        State,
        WantToStart,
        Update,
        Shoot,
        WantToPause,
        Winner,
        Reset,
        Remove,
        Stop, Leaderboard,
    }
}
