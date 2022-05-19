package com.company;

public class SlytherinStudents extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudents(String studentName, int magicPower, int apparitionDistance, int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(studentName, magicPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public String toString() {
        return "Имя волшебника " + getStudentName() + "; Навыки: " + " сила магии- " + getMagicPower() +
                "; расстояние трансгрессии-  " + getApparitionDistance() +
                "; хитрость- " + cunning +
                "; решительность- " + determination +
                "; амбициозность- " + ambition +
                "; находчивость- " + ingenuity +
                "; жажда власти- " + thirstForPower;
    }

    public int slytherinAbility() {
        return getMagicPower() + getApparitionDistance() + cunning + determination + ambition + ingenuity + thirstForPower;
    }
}
