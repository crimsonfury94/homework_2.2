package com.company;

public class Main {




    public static void main(String[] args) {

        GryffindorStudents granger = new GryffindorStudents("Гермиона Грейнджер", 75, 50, 80, 100, 100);
        GryffindorStudents weasley = new GryffindorStudents("Рон Уизли", 50, 30, 80, 80, 20);
        GryffindorStudents potter = new GryffindorStudents("Гарри Поттер", 70, 90, 100, 100, 100);

        HufflepuffStudents smith = new HufflepuffStudents("Захария Смит", 50, 45, 70, 80, 90);
        HufflepuffStudents diggory = new HufflepuffStudents("Седрик Диггори", 60, 62, 82, 83, 94);
        HufflepuffStudents finchFletchley = new HufflepuffStudents("Джастин Финч-Флетчли", 55, 43, 61, 74, 88);

        RavenclawStudents chang = new RavenclawStudents("Чжоу Чанг", 44, 31, 58, 60, 54, 71);
        RavenclawStudents patil = new RavenclawStudents("Падма Патил", 41, 27, 63, 72, 66, 88);
        RavenclawStudents belby = new RavenclawStudents("Маркус Белби", 56, 38, 55, 53, 86, 42);

        SlytherinStudents malfoy = new SlytherinStudents("Драко Малфой", 69, 90, 82, 34, 77, 21, 100);
        SlytherinStudents montague = new SlytherinStudents("Грэхэм Монтегю", 43, 82, 73, 86, 66, 55, 12);
        SlytherinStudents goyle = new SlytherinStudents("Грегори Гойл", 21, 35, 54, 51, 48, 63, 5);

        System.out.println("Лучший ученик "  + granger.equals(weasley));
    }
}
