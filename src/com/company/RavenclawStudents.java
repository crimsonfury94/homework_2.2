package com.company;

public class RavenclawStudents extends HogwartsStudents {
    private int clever;
    private int wisdom;
    private int wittiness;
    private int creative;
    private final int ravenclawAbility;

    public RavenclawStudents(String studentName, int magicPower, int apparitionDistance, int clever, int wisdom, int wittiness, int creative) {
        super(studentName, magicPower, apparitionDistance);
        this.clever = clever;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creative = creative;
        ravenclawAbility = clever + wisdom + wittiness + creative;

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

    public int getRavenclawAbility() {
        return ravenclawAbility;
    }

    public String toString() {
        return super.toString() +
                "; ум- " + clever +
                "; мудрость- " + wisdom +
                "; остроумие- " + wittiness +
                "; креативность- " + creative;
    }

    public static void comparisonRavenclawSkills(RavenclawStudents students, RavenclawStudents student) {
        int currentWizard = students.getRavenclawAbility();
        int anotherWizard = student.getRavenclawAbility();
        if (currentWizard > anotherWizard) {
            System.out.println(students.getStudentName() + " лучший Когтевранец, чем " + student.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " лучший Когтевранец, чем " + students.getStudentName());
        }
    }
}
