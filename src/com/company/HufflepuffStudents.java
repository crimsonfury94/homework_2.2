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

    private int hufflepuffAbility() {
        return diligence + loyalty + honesty;
    }

    public String toString() {
        return super.toString() +
                "; трудолюбие- " + diligence +
                "; верность- " + loyalty +
                "; честность- " + honesty;
    }

    public static void comparisonHufflepuffSkills(HufflepuffStudents students, HufflepuffStudents student) {
        int currentWizard = students.hufflepuffAbility();
        int anotherWizard = student.hufflepuffAbility();
        if (currentWizard > anotherWizard) {
            System.out.println(students.getStudentName() + " лучший Пуфендуец, чем " + student.getStudentName());
        } else if (currentWizard < anotherWizard){
            System.out.println(student.getStudentName() + " лучший Пуфендуец, чем " + students.getStudentName());
        } else if (currentWizard == anotherWizard) {
            System.out.println(students.getStudentName() + " и " + student.getStudentName() + " лучшие Пуфендуйцы");
        }
    }

}
