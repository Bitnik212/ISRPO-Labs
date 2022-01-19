import java.util.Scanner;

/**
 * Задание 2.
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Напишите программу – консольный калькулятор.
 * Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения.
 * Предложите пользователю ввести знак арифметической операции.
 * Примите значение, введенное пользователем и поместите его в строковую переменную sign.
 * Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
 * Выведите на экран результат выполнения арифметической операции. В случае использования операции деления,
 * организуйте проверку попытки деления на ноль.
 * И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.
 * **/
public class Calculator {
    static Scanner input = new Scanner(System.in);

    public void calc() {
        int operand1 = getInt();
        int operand2 = getInt();
        char sign = getOperation();
        try {
            int result = calculate(operand1,operand2,sign);
            System.out.println("Результат операции: "+result);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на 0");
        }
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(input.hasNextInt()){
            num = input.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            input.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(input.hasNext()){
            operation = input.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            input.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    private static int calculate(int num1, int num2, char operation){
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculate(num1, num2, getOperation());//рекурсия
            }
        }
        return result;
    }
}
