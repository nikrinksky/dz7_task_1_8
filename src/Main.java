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

    public static void task1() {
        System.out.println("Задача 1:");

        int total = 0;
        int deposit = 15000;
        int target = 2_459_000;
        int i = 0;
        while (total < target) {
            total += deposit;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накопления равна " + total + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int population = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int birthPopulation;
        int mortalityPopulation;
        int yearY = 2020;
        int yearY2 = 2030;

        while (yearY <= yearY2) {
            System.out.println("Год " + yearY + ", численность населения составляет " + population);
            birthPopulation = population / 1000 * birth;
            mortalityPopulation = population / 1000 * mortality;
            population = population + (birthPopulation - mortalityPopulation);
            yearY++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int depositAmount = 15000;
        int percent = 7;
        int finalAmount = 12_000_000;
        int total = 0;
        int moth = 0;

        while (total < finalAmount) {
            total = total + total * percent / 100;
            total = total + depositAmount;
            moth++;
            System.out.println("Месяц: " + moth + " сумма накоплений - " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5:");
        int depositAmount = 15000;
        int percent = 7;
        int finalAmount = 12_000_000;
        int total = 0;
        int moth = 0;

        while (total < finalAmount) {
            total = total + total * percent / 100;
            total = total + depositAmount;
            moth++;
            if (moth % 6 == 0) {
                System.out.println("Месяц: " + moth + " сумма накоплений - " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6:");
        int depositAmount = 15000;
        int percent = 7;
        int total = 0;
        int moth = 0;
        int nineYears = 108;

        while (moth <= nineYears) {
            total = total + total * percent / 100;
            total = total + depositAmount;
            moth++;
            if (moth % 6 == 0) {
                System.out.println("Месяц: " + moth + " сумма накоплений - " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7:");
        int friday = 3;
        int month = 31;
        while (friday <= month) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчёт");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8:");
        int currentYear = 2023;
        int zeroYear = 0;
        int initialPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;

        while (zeroYear < endPeriod) {
            if (zeroYear > initialPeriod && zeroYear % 79 == 0) {
                if (zeroYear <= currentYear) {
                    System.out.println("За последние  200 лет комета появилась в: " + zeroYear + " году");
                } else if (zeroYear > currentYear) {
                    System.out.println("В следующие 100 лет комета появилась в: " + zeroYear + " году");
                }
            }
            zeroYear += 79;
        }
    }
}