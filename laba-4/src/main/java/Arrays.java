/**
 * Задание 1
 * Используя IntelliJ IDEA, создайте класс Arrays.
 * Создайте массив размерностью в 10 элементов, выведите на экран все элементы массива в обратном порядке.
 * **/
public class Arrays {
    final int[] customArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = customArray.length - 1; i >= 0; i--) {
            result.append(customArray[i]);
            result.append(", ");
        }
        return result.toString();
    }
}
