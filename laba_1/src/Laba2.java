import java.util.Objects;
import java.util.Scanner;

public class Laba2 {
    Translator translator = new Translator();
    Calculator calculator = new  Calculator();

    public void ex1() {
        System.out.println("Задание 1");
        String translate = this.translator.translate(this.getStringFromKB());
        System.out.println(Objects.requireNonNullElse(translate, "Нет перевода"));
    }

    private String getStringFromKB() {
        System.out.println("Введите строку:");
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public void ex2() {
        this.calculator.calc();
    }

    public static void main(String[] args) {
        Laba2 laba = new Laba2();
        laba.ex1();
        laba.ex2();
    }

}
