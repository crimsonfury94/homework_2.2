package com.company;

import java.util.Objects;

public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;
    private final int gryffindorAbility;

    public GryffindorStudents(String studentName, int magicPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(studentName, magicPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.gryffindorAbility = nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getGryffindorAbility() {
        return gryffindorAbility;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; благородство- " + nobility +
                "; честь- " + honor +
                "; храбрость- " + bravery;
    }

    // public int gryffindorAbility() {
    //  return nobility + honor + bravery;
    // }

}
