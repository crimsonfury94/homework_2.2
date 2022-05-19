package com.company;

public class RavenclawStudents extends HogwartsStudents {
    private int clever;
    private int wisdom;
    private int wittiness;
    private int creative;

    public RavenclawStudents(String studentName, int magicPower, int apparitionDistance, int clever, int wisdom, int wittiness, int creative) {
        super(studentName, magicPower, apparitionDistance);
        this.clever = clever;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creative = creative;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public String toString() {
        return super.toString() +
                "; ум- " + clever +
                "; мудрость- " + wisdom +
                "; остроумие- " + wittiness +
                "; креативность- " + creative;
    }

    public int ravenclawAbility() {
        return getMagicPower() + getApparitionDistance() + clever + wisdom + wittiness + creative;
    }
}
