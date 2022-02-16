import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.Arrays;

public class Laba4 {
    private final Scanner input = new Scanner(System.in);
    private final Random random = new Random();
    private final Sorter sorter = new Sorter();
    static int n = 10;
    static int MAX_RAND = 10;
    static int MIN_RAND = -10;

    private static void printMatrix(int[] @NotNull [] matrix) {
        for (int[] ints : matrix) System.out.println(Arrays.toString(ints));
    }

    private int[][] genMatrix() {
        var matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) for (int j = 0; j < matrix.length; j++) matrix[i][j] = this.random.nextInt(MIN_RAND, MAX_RAND);
        System.out.println("Исходный массив:");
        printMatrix(matrix);
        return matrix;
    }

    /**
     * Задание 3.
     * Введите с клавиатуры строку произвольной длины и подсчитайте процент вхождения заданного символа в строку.
     * **/
    void ex3() {
        System.out.println("Задание 3");
        System.out.println("Введите строку с произвольными символами:");
        var string = input.next();
        System.out.println("Введите заданный симвл:");
        var randChar = input.next().toCharArray()[0];
        var result = string.chars().filter(value -> {
            return value == randChar;
        }).count();
        System.out.println("Процент вхождений: " + (result * 100)/string.length() + "%");
    }

    /**
     * Задание 4.
     * Задан массив действительных чисел размерности 10х10.
     * Найти суммы элементов каждой строки, произведения элементов каждого столбца, и максимальный элемент главной диагонали
     * (подсказка: все элементы, для которых номер строки совпадает с номером столбца).
     * **/
    void ex4() {
        System.out.println("Задание 4");
        var matrix = genMatrix();
        int[] summ = new int[n];
        int[] proiz = new int[n];
        int[] diago = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            var sum = 0;
            var proi = 1;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
                proi *= matrix[j][i];
                diago[i] = matrix[i][i];
            }
            summ[i] = sum;
            proiz[i] = proi;
        }
        System.out.println("Суммы элементов: " + Arrays.toString(summ));
        System.out.println("Произведения элементов: " + Arrays.toString(proiz));
        System.out.println("Максимальный элемент главной диагонали: " + Arrays.stream(diago).max().getAsInt());
    }

    /**
     * Задание 5.
     * В заданной строке текста определите количество слов. Каждое слово отделено друг от друга пробелом.
     * **/
    void ex5() {
        System.out.println("Задание 5");
        System.out.println("Введите слова: ");
        System.out.println("Количество слов: " + this.input.nextLine().replaceAll("  ", "").split(" ").length);
    }

    /**
     * Задание 6.
     * Задан одномерный массив целых чисел. Образуйте из него два отсортированных по возрастанию массива,
     * содержащих четные и нечетные числа. Подсказка: четное число делится на 2 без остатка.
     * **/
    void ex6() {
        System.out.println("Задание 6");
        int[] ints = new int[n];
        List<Integer> matrxOdd = new ArrayList<>();
        List<Integer> matrxEven = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) ints[i] = this.random.nextInt(MIN_RAND, MAX_RAND);
        for (int i : ints) if (i % 2 == 0) matrxOdd.add(i); else matrxEven.add(i);
        System.out.println("Четные числа: "+matrxOdd);
        System.out.println("Нечетные числа: "+matrxEven);
    }

    /**
     * Задание 7.
     * В заданном массиве действительных чисел найдите разность между максимальным и минимальным числом.
     * **/
    void ex7() {
        System.out.println("Задание 7");
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) ints[i] = this.random.nextInt(MIN_RAND, MAX_RAND);
        System.out.println("Разность между максимальным и минимальным числом: (" + Arrays.stream(ints).max().getAsInt() + " / " + Arrays.stream(ints).min().getAsInt() + ") = " + (Arrays.stream(ints).max().getAsInt() / Arrays.stream(ints).min().getAsInt()));
    }

    /**
     * Задание 8.
     * В одномерном массиве из 100 чисел M[] подсчитайте количество элементов, удовлетворяющих условию 0 < M[i] <125.
     * **/
    void ex8() {
        System.out.println("Задание 8");
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) ints[i] = this.random.nextInt(MIN_RAND, MAX_RAND);
        int count = 0;
        for (int i: ints) if (i > 0 && i < 125) count++;
        System.out.println("Количество элементов, удовлетворяющих условию 0 < M[i] < 125: " + count);
    }

    /**
     * Задание 9.
     * Определите, является ли исходная строка символов палиндромом (читается одинаково с начала и с конца).
     * Регистры символов и пробелы игнорируйте.
     * **/
    void ex9() {
        System.out.println("Задание 9");
        System.out.println("Введите строку: ");
        var input = this.input.nextLine().toLowerCase(Locale.ROOT).replaceAll(" ", "").toCharArray();
        var isAn = false;
        List<Character> left = new ArrayList<>();
        List<Character> right = new ArrayList<>();
        for (int i = 0; i < input.length; i++) if (i < input.length/2) left.add(input[i]); else right.add(input[i]);
        Collections.reverse(right);
        for (int i = 0; i < left.size(); i++) isAn = (char) left.toArray()[i] == (char) right.toArray()[i];
        if (isAn) System.out.println("Является"); else System.out.println("Не является");
    }

    /**
     * Задание 10.
     * Задана квадратная матрица целых чисел. Подсчитайте количество отрицательных и положительных элементов,
     * а также выведите на печать координаты нулевых элементов (номер строки и номер столбца).
     * **/
    void ex10() {
        System.out.println("Задание 10");
        var matrix = genMatrix();
        HashMap<Integer, Integer> zeroCoordinats = new HashMap<>();
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < matrix.length; i++) for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 0) zeroCoordinats.put(i + 1, j + 1);
            if (matrix[i][j] > 0) posCount++; else negCount++;
        }
        System.out.println("Позиции чисел с нулевым значением {номер строки=номер столбца}: "+zeroCoordinats);
        System.out.println("Количество положительных чисел: "+posCount);
        System.out.println("Количество отрицательных чисел: "+negCount);
    }

    /**
     * Задание 11.
     * Введите с клавиатуры строку произвольной длины и подсчитайте процент вхождения гласных букв латинского алфавита
     * в строку (не различая регистры).
     * **/
    void ex11() {
        System.out.println("Задание 11");
        System.out.println("Введите строку: ");
        var input = this.input.nextLine();
        var vowels = "ауоыиэяюёе";
        var count = 0;
        for (char c: input.toCharArray()) if (vowels.contains(""+c))  count++;
        System.out.println("Процент вхождения гласных букв латинского алфавита: " + (count * 100 ) / input.length() + "%");
    }

    /**
     * Задание 12.
     * Задан массив действительных чисел из N элементов (используйте генератор случайных чисел).
     * Определить количество элементов, значения которых находятся в диапазоне от -100 до +100.
     * **/
    void ex12() {
        System.out.println("Задание 12");
        var count = 0;
        var matrix = genMatrix();
        for (int[] i: matrix) for (int j: i) if (j < 100 && j > -100) count++;
        System.out.println("Количество элементов, значения которых находятся в диапазоне от -100 до +100: "+count);
    }

    /**
     * Задание 13.
     * Задано пять произвольных целых чисел (элементы массива).
     * Определить, является ли их расположение в массиве упорядоченным (т.е. по возрастанию или по убыванию) или неупорядоченным.
     * **/
    void ex13() {
        System.out.println("Задание 13");
        int[] numbers = new int[5];
//        int[] numbers = new int[] {5, 4, 3, 2, 1};
        for (int i = 0; i < numbers.length; i++) numbers[i] = this.random.nextInt(MIN_RAND, MAX_RAND);
        System.out.println(Arrays.toString(numbers));
        var sorted = this.sorter.isSorted(numbers);
        if (!sorted) System.out.println("Не отсортированно");
    }

    /**
     * Задание 14.
     * Задан массив действительных чисел из N элементов (используйте генератор случайных чисел).
     * Определить количество элементов, значения которых находятся вне диапазона от -10 до +10.
     * **/
    void ex14() {
        System.out.println("Задание 14");
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) numbers[i] = this.random.nextInt(MIN_RAND, MAX_RAND);
        var count = 0;
        for (int i: numbers) if (i < 10 && i > -10) count++;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Количество элементов, значения которых находятся в диапазоне от -10 до +10: "+count);
    }

    /**
     * Задание 15.
     * В двухмерном массиве переставьте попарно соседние строки, т.е. 1-ю со 2-ой, 3-ю с 4-й и т.д.
     * Результат выведите на экран.
     * **/
    void ex15() {
        System.out.println("Задание 15");
        var matrix = genMatrix();
        int[] tmp;
        for (int i = 0; i < matrix.length - 1; i += 2) {
            tmp = matrix[i];
            matrix[i] = matrix[i+1];
            matrix[i+1] = tmp;
        }
        System.out.println("Результат: ");
        printMatrix(matrix);
    }

    public static void main(String[] args) {
        var laba = new Laba4();
//        System.out.println(new Arrays());
//        var ca = new CustomerArray();
//        ca.create();
//        System.out.println(ca);
        laba.ex15();
    }
}
