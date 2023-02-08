public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int i = 2000000000;
        System.out.println("Значение переменной i с типом int равно " + i);
        byte b = 120;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short sh = 32000;
        System.out.println("Значение переменной sh с типом short равно " + sh);
        long l = 9000000000000000000L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 1.0000001f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 1.0000000000000001;
        System.out.println("Значение переменной d с типом double равно " + d);
    }

    public static void task2 () {
        System.out.println("Задача 2 - по заданию не требуется вывод в консоль");
        float f = 27.12f;
        long l = 987678965549L;
        float f2 = 2.786f;
        short sh = 569;
        short sh2 = -159;
        short sh3 = 27987;
        byte b = 67;
    }

    public static void task3 () {
        System.out.println("Задача 3");
        short pupilsLP = 23;
        short pupilsAS = 27;
        short pupilsEA = 30;
        short paper = 480;
        int sheetPerPupil = paper / (pupilsLP + pupilsAS + pupilsEA);
        System.out.println("На каждого ученика рассчитано " + sheetPerPupil + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte bottlesPer2Minutes = 16;
        byte productivity = (byte) (bottlesPer2Minutes / 2);
        short bottlesIn20Minutes = (short) (productivity * 20);
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " бутылок");
        short bottlesInDay = (short) (productivity * 60 * 24);
        System.out.println("За сутки машина произвела " + bottlesInDay + " бутылок");
        int bottlesIn3Days = bottlesInDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " бутылок");
        int bottlesInMonth = bottlesInDay * 30;
        System.out.println("За месяц машина произвела " + bottlesInMonth + " бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int totalPaint = 120;
        int paintToClassroomWhite = 2;
        int paintToClassroomBraun = 4;
        int paintToClassroomAll = paintToClassroomWhite + paintToClassroomBraun;
        int countClassroom = totalPaint / paintToClassroomAll;
        int paintWhite = countClassroom * paintToClassroomWhite;
        int paintBraun = countClassroom * paintToClassroomBraun;
        System.out.println("В школе, где "+countClassroom+" классов, нужно "+paintWhite+" банок белой краски и "+paintBraun+" банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        short bananWeight = 80;
        short milk100mlWeight = 105;
        short icecreamWeight = 100;
        short eggWeight = 70;
        float totalWeight;
        totalWeight = bananWeight * 5 + milk100mlWeight * 2 + icecreamWeight * 2 + eggWeight * 4;
        float totalWeightKg = totalWeight / 1000;
        System.out.println("Общий вес - " + (short) totalWeight+ " г. (" +totalWeightKg+ " кг.)");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int needToLoseWeight = 7;
        float minLess = 0.250f;
        float maxLess = 0.5f;
        float needDayIfMin = needToLoseWeight / minLess;
        System.out.println("Максимальный срок - " + (short) needDayIfMin+ " дней");
        float needDayIfMax = needToLoseWeight / maxLess;
        System.out.println("Минимальный срок - " + (short) needDayIfMax+ " дней");
        float averagePeriod = (needDayIfMin + needDayIfMax) / 2;
        System.out.println("Средний срок - " + (short) averagePeriod+ " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryMashaAdd = salaryMasha / 10;
        int salaryMashaNew =  salaryMasha + salaryMashaAdd;
        int salaryMashaDifYear = salaryMashaAdd * 12;
        System.out.println("Маша теперь получает "+salaryMashaNew+" рублей. Годовой доход вырос на "+salaryMashaDifYear+" рублей");

        int salaryDenis = 83690;
        int salaryDenisAdd = salaryDenis / 10;
        int salaryDenisNew =  salaryDenis + salaryDenisAdd;
        int salaryDenisDifYear = salaryDenisAdd * 12;
        System.out.println("Денис теперь получает "+salaryDenisNew+" рублей. Годовой доход вырос на "+salaryDenisDifYear+" рублей");

        int salaryKristina = 76230;
        int salaryKristinaAdd = salaryKristina / 10;
        int salaryKristinaNew =  salaryKristina + salaryKristinaAdd;
        int salaryKristinaDifYear = salaryKristinaAdd * 12;
        System.out.println("Кристина теперь получает "+salaryKristinaNew+" рублей. Годовой доход вырос на "+salaryKristinaDifYear+" рублей");
    }
}
