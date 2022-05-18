package com.company;

public class Main {

    public static void main(String[] args) {

        Gryffindor[] lion = {
                new Gryffindor("Гермиона Грейнджер", 75, 50, 80, 100, 100),
                new Gryffindor("Рон Уизли", 50, 30, 80, 80, 20),
                new Gryffindor("Гарри Поттер", 70, 90, 100, 100, 100)
        };

        Hufflepuff[] budger = {
                new Hufflepuff("Захария Смит", 50, 45, 70, 80, 90),
                new Hufflepuff("Седрик Диггори", 60, 62, 82, 83, 94),
                new Hufflepuff("Джастин Финч-Флетчли", 55, 43, 61, 74, 88)
        };

        Ravenclaw [] eagle = {
                new Ravenclaw("Чжоу Чанг", 44,31,58,60,54,71),
                new Ravenclaw("Падма Патил", 41,27,63,72,66,88),
                new Ravenclaw("Маркус Белби", 56,38,55,53,86,42)
        };

        Slytherin [] snake = {
                new Slytherin("Драко Малфой", 69,90,82,34,77,21,100),
                new Slytherin("Грэхэм Монтегю", 43,82,73,86,66,55,12),
                new Slytherin("Грегори Гойл", 21,35,54,51,48,63,5)
        };
Hogwarts hogwarts = new Hogwarts(null,0,0);
hogwarts.print(lion);
    }
}
