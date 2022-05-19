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

    @Override
    public String toString() {
        return "Имя волшебника " + getStudentName() + "; Навыки: " + " сила магии- " + getMagicPower() +
                "; расстояние трансгрессии-  " + getApparitionDistance() +
                "; благородство- " + nobility +
                "; честь- " + honor +
                "; храбрость- " + bravery;
    }

   // public int gryffindorAbility() {
      //  return nobility + honor + bravery;
   // }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GryffindorStudents that = (GryffindorStudents) o;
        return gryffindorAbility == that.gryffindorAbility;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gryffindorAbility);
    }
}
