package com.company;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(studentName, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
