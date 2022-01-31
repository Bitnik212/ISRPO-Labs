import java.util.ArrayList;
import java.util.List;

/**
 * Задание 2
 * Используя IntelliJ IDEA, создайте класс SumMin. <br>
 * Дано два числа A и B (A < B) выведите суму всех чисел, расположенных между данными числами на экран. <br>
 * Дано два числа A и B (A < B) выведите все нечетные значения, расположенные между данными числами.
 * **/
public class SumMin {

    private double calcSum(int a, int b) {
        double result = 0;
        for (int i = a; i < b; i++) {
            result += i;
        }
        System.out.println("Сумма всех чисел: "+result);
        return result;
    }

    private void calcOdd(int a, int b) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) result.add(i);
        }
        System.out.println("Все нечетные значения: " + result);
    }

    public static void main(String[] args) {
        var s = new SumMin();
        s.calcOdd(1, 40);
        s.calcSum(1, 40);
    }

}
