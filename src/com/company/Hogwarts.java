package com.company;

public class Hogwarts {
    private final String studentName;
    private final int magicPower;
    private final int transgressionDistance;


    public Hogwarts(String studentName, int magicPower, int transgressionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;

    }

    public String getStudentName() {
        return studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void print(Gryffindor[] wizards) {
        for (int i = 0; i < wizards.length; i++) {
            Gryffindor lion = wizards[i];
            System.out.println("Имя волшебника " + lion.getStudentName() + "; Навыки: " + lion.getNobility() + " " + lion.getHonor() + " " + lion.getBravery());
        }
    }
}
