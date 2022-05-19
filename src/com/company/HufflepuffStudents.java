package com.company;

public class HufflepuffStudents extends HogwartsStudents {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String studentName, int magicPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(studentName, magicPower, apparitionDistance);
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

    public String toString() {
        return super.toString() +
                "; трудолюбие- " + diligence +
                "; верность- " + loyalty +
                "; честность- " + honesty;
    }

    public int hufflepuffAbility() {
        return getMagicPower() + getApparitionDistance() + diligence + loyalty + honesty;
    }
}
