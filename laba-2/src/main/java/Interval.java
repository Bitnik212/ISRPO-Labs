import java.util.*;

/**
 * Задание 3
 * Используя IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой промежуток
 * [0 - 14] [15 - 35] [36 - 50][50 - 100]. Если да, то укажите, в какой именно промежуток.
 * Если пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то выводится соответствующее сообщение.
 * **/
public class Interval {
    public int max;
    public int min;
    public int size;
    private Integer[] left;
    private Integer[] right;

    /**
     * @param start С какого числа начинать
     * @param step Шаг
     * @param repeat Количество сделать интервалов
     * **/
    public Interval (int start, int step, int repeat) {
        this.min = start;
        int size = 0;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int number = start;
        for (int i = 1; i <= repeat; i++) {
            left.add(number);
            right.add(number + step - 1 );
            number = step + number;
            size++;
        }
        this.left = left.toArray(Integer[]::new);
        this.right = right.toArray(Integer[]::new);
        this.size = size;
        this.max = this.right[this.right.length - 1];
    }

    /**
     * @param left Массив левых чисел
     * @param right Массив правых чисел
     * @exception ArrayIndexOutOfBoundsException когда длинны массивов разные
     * **/
    public Interval ( Integer[] left,  Integer[] right) throws ArrayIndexOutOfBoundsException {
        if (left.length != right.length) throw new ArrayIndexOutOfBoundsException("Длина масивов не равна");
        this.left = left;
        this.right = right;
        this.max = right[right.length - 1];
        this.min = left[0];
        this.size = left.length;
    }

    public int[] get_interval(int number) {
        if (number < this.min || number > this.max) return null;
        for (int i = 0; i < this.size; i++) {
            if (this.right[i] - number >= 0 && this.left[i] <= number) {
//                System.out.println(this.left[i] + " < " + number + " < " +this.right[i]);
                return new int[] {this.left[i], this.right[i]};
            }
        }
        return null;
    }

}
