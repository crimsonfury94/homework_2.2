package com.company;

public class Ravenclaw extends Hogwarts {
    private int clever;
    private int wisdom;
    private int wittiness;
    private int creative;

    public Ravenclaw(String studentName, int magicPower, int transgressionDistance, int clever, int wisdom, int wittiness, int creative) {
        super(studentName, magicPower, transgressionDistance);
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
}
