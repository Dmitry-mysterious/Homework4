void main() {
    // Задача 1
    System.out.println("--|| Задача 1 ||--");

    byte age = 19;

    if (age >= 18) {
        System.out.println("Если возраст человека равен " + age
                + ", то он совершеннолетний");
    } else {
        System.out.println("Если возраст человека равен " + age
                + ", то он не достиг совершеннолетия, нужно немного подождать");
    }

    System.out.println();


    // Задача 2
    System.out.println("--|| Задача 2 ||--");

    byte temperature = 24;

    if (temperature < 5) {
        System.out.println("На улице холодно, нужно надеть шапку");
    } else {
        System.out.println("Сегодня тепло, можно идти без шапки");
    }

    System.out.println();


    // Задача 3
    System.out.println("--|| Задача 3 ||--");

    short speed = 120;

    if (speed > 60) {
        System.out.println("Если скорость " + speed
                + ", то придется заплатить штраф");
    } else {
        System.out.println("Если скорость " + speed
                + ", то можно ездить спокойно");
    }

    System.out.println();


    // Задача 4
    System.out.println("--|| Задача 4 ||--");

    byte numOfYears = 32;

    if (numOfYears >= 2 && numOfYears <= 6) {
        System.out.println("Если возраст человека равен " + numOfYears
                + " то ему нужно ходить в детский сад");
    } else if (numOfYears >= 7 && numOfYears <= 17) {
        System.out.println("Если возраст человека равен " + numOfYears
                + " то ему нужно ходить в школу");
    } else if (numOfYears >= 18 && numOfYears <= 24) {
        System.out.println("Если возраст человека равен " + numOfYears
                + " то ему нужно ходить в университет");
    } else {
        System.out.println("Если возраст человека равен " + numOfYears
                + " то ему нужно ходить на работу");
    }

    System.out.println();


    // Задача 5
    System.out.println("--|| Задача 5 ||--");

    byte ageKid = 14;

    // В условии задачи не сказано про больше или равно 5-и, там только меньше или только больше
    if (ageKid < 5) {
        System.out.println("Если возраст ребенка равен " + ageKid
                + ", то ему нельзя кататься на аттракционе");
    } else if (ageKid > 5 && ageKid <= 14) {
        System.out.println("Если возраст ребенка равен " + ageKid
                + ", то ему можно кататься на аттракционе в сопровождении взрослого");
    } else {
        System.out.println("Если возраст ребенка равен " + ageKid
                + ", то ему можно кататься на аттракционе без сопровождения взрослого");
    }

    System.out.println();


    // Задача 6
    System.out.println("--|| Задача 6 ||--");

    byte capacity = 102;
    byte seatingPlaces = 60;

    byte peoples = 72;

    if (peoples <= capacity && peoples <= seatingPlaces) {
        System.out.println("В вагоне есть сидячее место");
    } else if (peoples <= capacity && peoples >= seatingPlaces) {
        System.out.println("В вагоне есть стоячее место");
    } else {
        System.out.println("Вагон полностью забит");
    }

    System.out.println();


    // Задача 7
    System.out.println("--|| Задача 7 ||--");

    int one = 5;
    int two = 9;
    int three = 7;

    if (one > two && one > three) {
        System.out.println("Число " + one + " большее");
    } else if (two > one && two > three) {
        System.out.println("Число " + two + " большее");
    } else {
        System.out.println("Число " + three + " большее");
    }
}
