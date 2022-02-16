import java.util.*;
import java.util.Arrays;

/**
 * Задание 2
 * Используя IntelliJ IDEA, создайте класс CustomerArray.
 * Требуется:
 * Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер массива задает пользователь).
 * Вывести на экран:
 * наибольшее значение массива,
 * наименьшее значение массива,
 * общую сумму всех элементов,
 * среднее арифметическое всех элементов,
 * вывести все нечетные значения.
 * **/
public class CustomerArray {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    int[] customArray = new int[] {};

    public void create() {
        System.out.println("Введите размерность массива:");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Должно быть большие 0");
            create();
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = random.nextInt(1, 10);
        customArray = array;
    }

    @Override
    public String toString() {
        List<Integer> oddArray = new ArrayList<>();
        for (int i: customArray) {
            if (i % 2 != 0) oddArray.add(i);
        }
        return "Наибольшее значение массива = " + Arrays.stream(customArray).max() + "\n" +
                "Наименьшее значение массива = " + Arrays.stream(customArray).min() + "\n" +
                "Общую сумму всех элементов = " + Arrays.stream(customArray).sum() + "\n" +
                "Среднее арифметическое всех элементов = " + Arrays.stream(customArray).average() + "\n" +
                "Все нечетные значения: " + oddArray + "\n";
    }
}
