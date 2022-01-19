import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Laba2 {
    Translator translator = new Translator();
    Calculator calculator = new  Calculator();
    Scanner input = new Scanner(System.in);

    public void ex1() {
        System.out.println("Задание 1");
        String translate = this.translator.translate(this.getStringFromKB());
        System.out.println(Objects.requireNonNullElse(translate, "Нет перевода"));
    }

    private String getStringFromKB() {
        System.out.println("Введите строку:");
        return this.input.nextLine();
    }

    public void ex2() {
        System.out.println("Задание 2");
        this.calculator.calc();
    }

    public void ex3() {
        System.out.println("Задание 3");
        var i = new Interval( 0, 15, 10);
//        var i = new Interval(new Integer[] {0, 15}, new Integer[] {14, 35});
        System.out.println("Введите число в диапазоне от " + i.min + " до " + i.max);
        while (this.input.hasNextInt()) {
            int number = this.input.nextInt();
            var interval = i.get_interval(number);
            if (interval == null) System.out.println("Число не соответствует диапазону от " + i.min + " до " + i.max);
            else System.out.println(Arrays.toString(interval));
        }
    }

    /**
     * Здание 4
     * Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
     * **/
    public void ex4(int[] numbers) {
        System.out.println("Задание 4");
        System.out.println(Arrays.stream(numbers).min());
    }

    /**
     * Задание 5
     * Вывести на консоль количество максимальных чисел среди этих четырех.
     * **/
    public void ex5(int[] numbers) {
        System.out.println("Задание 5");
        System.out.println(Arrays.stream(numbers).max());
    }

    /**
     * Задание 6
     * Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
     * **/
    public void ex6(int[] numbers) {
        System.out.println("Задание 6");
        System.out.println("Наименьшее: " + Arrays.stream(numbers).min() + " Наибольшее: " + Arrays.stream(numbers).max());
    }

    /**
     * Задание 7
     * Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
     * **/
    public void ex7() {
        System.out.println("Задание 7");
        System.out.println("Введите имена через пробел:");
        var namesRaw = this.input.nextLine();
        var names = namesRaw.split(" ");
        if (Objects.equals(names[0], names[1])) System.out.println("Люди являются тезками");
        else System.out.println("Люди НЕ являются тезками");
    }

    /**
     * Задание 8
     * Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
     * **/
    public void ex8() {
        System.out.println("Задание 8");
        System.out.println("Введите номер месяца:");
        int month = this.input.nextInt();
        if (month / 3 == 1)
            System.out.println("весна");
        else if (month / 3 == 2)
            System.out.println("лето");
        else if (month / 3 == 3)
            System.out.println("осень");
        else
            System.out.println("зима");
    }

    public static void main(String[] args) {
        var numbers = new int[] {100, 2, 3, 4};
        Laba2 laba = new Laba2();
        laba.ex1();
        laba.ex2();
        laba.ex3();
        laba.ex4(numbers);
        laba.ex5(numbers);
        laba.ex6(numbers);
        laba.ex7();
        laba.ex8();
    }

}
