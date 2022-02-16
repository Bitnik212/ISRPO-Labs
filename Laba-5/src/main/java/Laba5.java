import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;

public class Laba5 {
    private final Scanner input = new Scanner(System.in);

    /**
     * Написать программу, преобразующую все прописные русские буквы строки S в строчные (остальные символы строки S не изменяются).
     * Строка S является входным и выходным параметром
     * **/
    String variant4() {
        System.out.println("Вариант 5");
        System.out.println("Введите строку:");
        return this.input.nextLine().toLowerCase(Locale.ROOT);
    }

    public static void main(String[] args) {
        var laba = new Laba5();
        System.out.println(laba.variant4());
    }
}
