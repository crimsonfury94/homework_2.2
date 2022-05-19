package com.company;

public class HogwartsStudents {
    private final String studentName;
    private final int magicPower;
    private final int apparitionDistance;


    public HogwartsStudents(String studentName, int magicPower, int apparitionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;

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

    public String toString() {
        return "Имя волшебника " + getStudentName() + "; Навыки: " + "сила магии- " + getMagicPower() +
                "; расстояние трансгрессии-  " + getApparitionDistance();
    }
}
