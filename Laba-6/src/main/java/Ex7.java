import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Создайте три метода для выполнения арифметических операций, с именами: <br>
 * Add – сложение, <br>
 * Sub – вычитание, <br>
 * Mul – умножение. <br>
 * Каждый метод должен принимать два целочисленных аргумента и выводить на экран результат выполнения арифметической
 * операции соответствующей имени метода.
 * Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов для выполнения вычислений.
 * **/
public class Ex7 {
    final Scanner input = new Scanner(System.in);

    /**
     * Сложение
     * **/
    void add(int x, int y) {
        System.out.println("Сложение: "+(x+y));
    }

    /**
     * Вычитание
     * **/
    void sub(int x, int y) {
        System.out.println("Вычитание: "+(x-y));
    }

    /**
     * Умножение
     * **/
    void mul(int x, int y) {
        System.out.println("Умножение: "+x*y);
    }

    /**
     * Метод int getInt() - должен считывать с консоли целое число и возвращать его
     * **/
    int getInt() {
        System.out.println("Введите целое число:");
        return this.input.nextInt();
    }

}
