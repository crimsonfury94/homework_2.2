package com.company;

public class SlytherinStudents extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;
    private final int slytherinAbility;

    public SlytherinStudents(String studentName, int magicPower, int apparitionDistance, int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(studentName, magicPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
        slytherinAbility = cunning + determination + ambition + ingenuity + thirstForPower;
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

    public int getSlytherinAbility() {
        return slytherinAbility;
    }

    public String toString() {
        return super.toString() +
                "; хитрость- " + cunning +
                "; решительность- " + determination +
                "; амбициозность- " + ambition +
                "; находчивость- " + ingenuity +
                "; жажда власти- " + thirstForPower;
    }

    public static void comparisonSlytherinSkills(SlytherinStudents students, SlytherinStudents student) {
        int currentWizard = students.getSlytherinAbility();
        int anotherWizard = student.getSlytherinAbility();
        if (currentWizard > anotherWizard) {
            System.out.println(students.getStudentName() + " лучший Слизеринец, чем " + student.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " лучший Слизеринец, чем " + students.getStudentName());
        }
    }
}
