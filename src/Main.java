// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
    }

    /**
     * С помощью цикла for выведите в консоль все числа от 1 до 10.
     */
    public static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * С помощью цикла for выведите в консоль все числа от 10 до 1.
     */
    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    /**
     * Выведите в консоль все четные числа от 0 до 17.
     */
    public static void task3() {
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    /**
     * Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
     */
    public static void task4() {
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    /**
     * Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».
     */
    public static void task5() {
        for (int i = 1904; i < 2096; i++)
            if (i % 4 == 0 && i % 100 != 0) {
                System.out.println(i + "год является високостным");
            }
    }

    /**
     * Напишите программу, которая выводит в консоль последовательность чисел:
     * <p>
     * 7 14 21 28 35 42 49 56 63 70 77 84 91 98
     */
    public static void task6() {
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
    }

    /**
     * Напишите программу, которая выводит в консоль последовательность чисел:
     * <p>
     * 1 2 4 8 16 32 64 128 256 512
     */
    public static void task7() {
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
    }

    /**
     * Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
     * <p>
     * Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
     */
    public static void task8() {
        int cash = 29000;
        int bank = 0;
        int i;
        for (i = 1; i < 13; i++) {
            bank = cash + bank;
            System.out.printf("Месяц %d сумма накопленных %d рублей\n", i, bank);
        }
    }

    /**
     * Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
     * а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
     */
    public static void task9() {
        int cash = 29000;
        int bank = 0;
        int i;
        for (i = 1; i < 13; i++) {
            bank = cash + bank + cash / 100 * 12;
            System.out.printf("Месяц %d сумма накопленных %d рублей\n", i, bank);
        }
    }

    /**
     * Напишите программу, которая выводит в консоль таблицу умножения на 2:
     */

    public static void task10() {
        for (int i = 2; i < 11; i = i + 1) {
            System.out.println("2*" + i + "=" + i * 2);
        }
    }

}