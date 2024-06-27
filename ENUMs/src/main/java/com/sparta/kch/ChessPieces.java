package com.sparta.kch;

public enum ChessPieces {
    PAWN("Pawn", 8, "1 Forward"),
    KNIGHT("Knight",2, "2 Forward 1 Sideways or 2 Sideways 1 Forwards or 2 Backwards"),
    BISHOP("Bishop",2, "Diagonal Left Diagonal Right"),
    ROOK("Bishop",2,"Forward or Sideways or Backwards"),
    QUEEN("Queen",1,"All Directions"),
    KING("King",1,"1 All Directions");

    private final String name;
    private int numberAtStart;
    private String movement;

    ChessPieces(String name, int numberAtStart, String movement) {
        this.name = name;
        this.numberAtStart = numberAtStart;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }
    public int getNumberAtStart() {
        return numberAtStart;
    }
    public void setNumberAtStart(int numberAtStart) {
        this.numberAtStart = numberAtStart;
    }
    public String getMovement() {
        return movement;
    }
    public void setMovement(String movement) {
        this.movement = movement;
    }

    public static int[] moveCords (String movement){
        String[] moveBreak = movement.split(" ");

        return null;
    }
}
