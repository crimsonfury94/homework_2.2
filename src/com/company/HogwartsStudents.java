package com.company;

public class HogwartsStudents {
    private String studentName;
    private final int magicPower;
    private final int apparitionDistance;
    private final int wizardsAbility;


    public HogwartsStudents(String studentName, int magicPower, int apparitionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;
        wizardsAbility = magicPower + apparitionDistance;

    }

    public void setStudentName() {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
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

    public int getWizardsAbility() {
        return wizardsAbility;
    }

    public static void comparisonWizardsSkills(HufflepuffStudents students, RavenclawStudents student) {
        int currentWizard = students.getWizardsAbility();
        int anotherWizard = student.getWizardsAbility();
        if (currentWizard > anotherWizard) {
            System.out.println(students.getStudentName() + " обладает бОльшей мощностью магии, чем " + student.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " обладает бОльшей мощностью магии, чем " + students.getStudentName());

        }
    }


}
