import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        System.out.println("\n\t1.\tГлава 1. Задание 6.");
        System.out.println("\t2.\tГлава 1. Задание 10.");
        System.out.println("\t3.\tГлава 1. Задание 14.");
        System.out.println("\t4.\tГлава 1. Задание 2.");

        while (true) {
            System.out.print("\nВаш выбор: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n1.6\t Напишите программу, вычисляющую факториал п ! = 1 х 2 * . . . х п, исполь" +
                            "зуя класс Biglnteger. Вычислите факториал числа 1000.");
                    System.out.println("\t\tРезультат: " + Factorial.calculate(1000));
                    break;
                case 2:
                    System.out.println("\n1.10\tНапишите программу, составляющую произвольную символьную строку из " +
                            "букв и цифр, генерируя произвольное значение типа long и выводя его по ос" +
                            "нованию 36.");

                    String result = "";
                    Random random = new Random();
                    for (int i = 0; i < 5; i++) {
                        result += Long.toUnsignedString(random.nextLong(), 36);

                    }
                    System.out.println("\t\tРезультат: " + result);
                break;
                case 3:
                    System.out.println("\n1.14\tНапишите программу, вводящую двумерный массив целочисленных значений " +
                            "и определяющую, содержится ли в нем магический квадрат \n(т.е. одинаковая " +
                            "сумма значений во всех строках, столбцах и диагоналях). Принимая строки " +
                            "вводимых данных, разбивайте их на отдельные\n целочисленные значения, пре" +
                            "кратив этот процесс, когда пользователь введет пустую строку. Например, на" +
                            "следующие вводимые данные: \n" +
                            "16 3 2 13\n" +
                            "5 10 11 8\n" +
                            "9 6 7 12\n" +
                            "4 15 14 1\n" +
                            "(Пустая строка)\t программа должна ответить утвердительно.");

                    MagicSquare magicSquare = new MagicSquare();
                    int[][] magicArray = magicSquare.input();

                    System.out.println("\t\tРезультат: Массив");

                    for (int[] itemN : magicArray) {
                        System.out.println("\t\t" + Arrays.toString(itemN));
                    }

                    System.out.println("\t\tЯвляется магическим квадратом: " + magicSquare.validate(magicArray));

                    break;

                case 4:
                    System.out.println("\n1.2\tНапишите программу, вводящую целочисленное (как положительное, так и \n" +
                            "отрицательное) значение угла и нормализующую его в пределах от 0 до 359 \n" +
                            "градусов. Попробуйте сделать это сначала с помощью операции %, а затем ме" +
                            "тода floorMod().");
                    int angle = 0;

                    System.out.print("\t\tВведите значение угла: ");
                    angle = scanner.nextInt();
                    int res = abs(angle % 360);
                    System.out.println("\t\tРезультат (%): " + res);
                    System.out.println("\t\tРезультат (floorMod): " + floorMod(angle, 360));
                    break;
            }
        }
    }
}
