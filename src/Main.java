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
        System.out.println("Task One");
        int total = 0;
        int counter = 0;
        int deposit = 15000;
        while (total <= 2_459_000) {
            total = total + (total / 100);
            total = total + deposit;
            counter++;
            System.out.println("Месяц " + counter + "," + "сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task Two");
        int k = 1;
        while (k < 11) {
            System.out.print(k + " ");
            k += 1;
        }
        System.out.println();

        for (int n = 0; n < 10; n++) {
            System.out.print(10 - n + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task Three");
        double initPopulation = 12_000_000;
        double total;
        double birthRate = (double) 17 / 1000;
        // System.out.println(birthRate); // to check the type
        double deathRate = (double) 8 / 1000;
        int time = 1;
        while (time < 11) {
            total = initPopulation + (initPopulation * birthRate) - (initPopulation * deathRate);
            initPopulation = total;

            System.out.println("Год " + time + "," + " численность населения " +
                    "составляет " + (long) (total));
            time++;
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task Four");
        double initSum = 15000;
        double percentage = (double) 7 / 100;
        int counter = 0;
        double total = 0;
        while (total < 12_000_000) {
            //total = initSum + (initSum * percentage);  // Second Version
            total = total + (total * percentage);
            total = total + initSum;
            //initSum = total;
            counter++;
        }
        System.out.println("Сколько месяцев копить: " + counter);
        System.out.println((long) total);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task Five");
        double initSum = 15000;
        double percentage = (double) 7 / 100;
        double total = 0;
        for (int i = 1; total < 12_000_000; i++) {
            total = total + (total * percentage);
            total = total + initSum;
            if (i % 6 == 0) {
                System.out.println("Month " + i + "," + " total " + (long) total);
            }
        }
        System.out.println((long) total);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Task Six");
        double initSum = 15000;
        double percentage = (double) 7 / 100;
        double total = 0;
        int years = 9;
        int i = 0;
        while (i < (years * 12)) {
            total = total + (total * percentage);
            total = total + initSum;
            i++;
            if (i % 6 == 0) {
                System.out.println("Month " + i + "," + " earned " + (long) total);
            }
        }
        System.out.println("Totally " + (long) total);
        System.out.println();

    }

    public static void task7() {
        System.out.println("Task Seven");
        int f = 5;
        do {
            System.out.println("Today is Friday, " + f + "." + " A day of reporting.");
            f += 7;
        } while (f < 31);
        System.out.println();
    }

    public static void task8() {
        System.out.println("Task Eight");
        int firstComet = 1817;
        int nextComet = 2017;
        while (firstComet < nextComet) {
            firstComet += 79;
            System.out.println(firstComet);
        }
    }
}
