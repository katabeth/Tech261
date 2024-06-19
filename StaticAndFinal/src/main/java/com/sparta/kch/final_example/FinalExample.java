package com.sparta.kch.final_example;

public /*final*/ class FinalExample { //Final classes cannot be extended
    private /*final*/ int score = 100; //Final field cannot be changed, only referenced
    public /*final*/ int getScore(){ //Final method cannot be overridden
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
}
