package com.company;

public class HogwartsStudents {
    private String studentName;
    private int magicPower;
    private int apparitionDistance;



    public HogwartsStudents(String studentName, int magicPower, int apparitionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;


    }

    public void setStudentName() {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }


    public int getApparitionDistance() {
        return apparitionDistance;
    }

    @Override
    public String toString() {
        return "Имя волшебника " + studentName + "; Навыки: " + "сила магии- " + magicPower +
                "; расстояние трансгрессии-  " + apparitionDistance;
    }

    private int wizardsAbility() {
        return magicPower + apparitionDistance;
    }

    public static void comparisonWizardsSkills(HogwartsStudents students, HogwartsStudents student) {
        int currentWizard = students.wizardsAbility();
        int anotherWizard = student.wizardsAbility();
        if (currentWizard > anotherWizard) {
            System.out.println(students.getStudentName() + " обладает бОльшей мощностью магии, чем " + student.getStudentName());
        } else if (currentWizard < anotherWizard) {
            System.out.println(student.getStudentName() + " обладает бОльшей мощностью магии, чем " + students.getStudentName());

        } else if (currentWizard == anotherWizard) {
            System.out.println(students.getStudentName() + " и " + student.getStudentName() + " обладают равной мощностью магии");
        }
    }


}
