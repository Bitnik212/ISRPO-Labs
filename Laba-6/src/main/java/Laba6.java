import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class Laba6 {
    private final Random random = new Random();
    private final Calculator calculator = new Calculator();
    private final Ex7 ex7 = new Ex7();
    private final static int MAX_RAND = 10;
    private final static int MIN_RAND = -10;
    private final static int n = 10;
    private final double x = 10f;
    private final double y = 11f;

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
     * Даны две переменные х, у (вещественные).
     * Используя метод нахождения наименьшего из двух значений, найдите наименьшее из х, у.
     * **/
    void ex1() {
        System.out.println("Задание 1");
        var result= Double.min(x, y);
        System.out.println("наименьшее из "+x+", "+y+" = "+result);
    }

    /**
     * Даны две переменные х, у (вещественные).
     * Используя метод нахождения наименьшего из двух значений, найдите наименьшее из х + у, х • у, 0,5.
     * **/
    void ex2() {
        System.out.println("Задание 2");
        var result = Double.min(Double.min(x+y, x*y), 0.5f);
        System.out.println("наименьшее из "+(x+y)+", "+(x*y)+", 0.5 = "+result);
    }

    /**
     * Даны две переменные х, у (вещественные).
     * Используя метод нахождения наименьшего из двух значений, найдите наименьшее из 2х, |х -у|, 4.5, (х + у)/3.
     * **/
    void ex3() {
        System.out.println("Задание 3");
        var result = Double.min(Double.min(Double.min(2*x, Math.abs(x-y)), 4.5f), (x+y)/3);
        System.out.println("наименьшее из "+(2*x)+", "+Math.abs(x-y)+", 4.5, "+((x+y)/3)+" = "+result);
    }

    /**
     * Разработайте метод для нахождения максимального из двух чисел.
     * Вычислите с помощью него значение выражения z = max (х, 2у — х) + max (5х + Зу, у)
     * **/
    void ex4() {
        System.out.println("Задание 4");
        var z = Double.max(x, (2*y - x)) + Double.max(5*x+3*y, y);
        System.out.println("Значение выражения z = max ("+x+", 2*"+y+" — "+x+") + max (5*"+x+" + З*"+y+", "+y+") = " + z);
    }

    void ex5() {
        System.out.println("Задание 5");

    }

    /**
     * Разработать методы для формирования и вывода на экран двумерного массива
     * **/
    void ex6() {
        System.out.println("Задание 6");
        genMatrix();
    }

    /**
     * Создайте три метода для выполнения арифметических операций, с именами: <br>
     * Add – сложение, <br>
     * Sub – вычитание, <br>
     * Mul – умножение. <br>
     * Каждый метод должен принимать два целочисленных аргумента и выводить на экран результат выполнения арифметической
     * операции соответствующей имени метода.
     * Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов для выполнения вычислений.
     * **/
    void ex7() {
        System.out.println("Задание 7");
        var number1 = this.ex7.getInt();
        var number2 = this.ex7.getInt();
        this.ex7.add(number1, number2);
        this.ex7.sub(number1, number2);
        this.ex7.mul(number1, number2);
    }

    /**
     * Необходимо написать простой консольный калькулятор на Java
     * **/
    void ex8() {
        System.out.println("Задание 8");
        this.calculator.calcAndPrint(this.calculator.getInt(), this.calculator.getInt(), this.calculator.getOperationType());
    }

    public static void main(String[] args) {
        var laba = new Laba6();
        laba.ex7();
    }

}
