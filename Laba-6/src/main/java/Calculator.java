import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * Необходимо написать простой консольный калькулятор на Java
 * **/
public class Calculator {
    private final Scanner input = new Scanner(System.in);
    private final static String operations = "+-*/";
    public enum OperationType {
        PLUS, MINUS, MULTIPLE, DIVISION, NONE
    }

    /**
     * Метод int getInt() - должен считывать с консоли целое число и возвращать его
     * **/
    int getInt() {
        System.out.println("Введите целое число:");
        return this.input.nextInt();
    }

    /**
     * Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
     * **/
    char getOperation() {
        System.out.println("Введите операцию:");
        var operation = this.input.next();
        var operationChar = operation.toCharArray()[0];
        if (operations.contains(operation)) return operationChar;
        else {
            System.out.println("Это не симвл операции");
            operationChar = getOperation();
        }
        return operationChar;
    }

    OperationType getOperationType() {
        char charr = getOperation();
        OperationType type = OperationType.NONE;
        switch (charr) {
            case '*' -> type = OperationType.MULTIPLE;
            case '+' -> type = OperationType.PLUS;
            case '-' -> type = OperationType.MINUS;
            case '/' -> type = OperationType.DIVISION;
        }
        return type;
    }

    char getCharOperation(@NotNull OperationType operation) {
        char operationChar = 0;
        switch (operation) {
            case MULTIPLE -> operationChar = '*';
            case MINUS -> operationChar = '-';
            case PLUS -> operationChar = '+';
            case DIVISION -> operationChar = '/';
        }
        return operationChar;
    }

    /**
     * Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
     * **/
    Integer calc(int num1, int num2, @NotNull OperationType operation) {
        Integer result = 0;
        switch (operation) {
            case PLUS -> result = num1 + num2;
            case MINUS -> result = num1 - num2;
            case DIVISION -> {
                try {
                    result = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!");
                    result = null;
                }
            }
            case MULTIPLE -> result = num1 * num2;
        }
        return result;
    }

    void calcAndPrint(int num1, int num2, OperationType operation) {
        var result = calc(num1, num2, operation);
        if (result != null) printResult(num1, num2, operation, result);
        else System.out.println("Нет ответа");
    }

    private void printResult(int num1, int num2, OperationType operation, int result) {
        System.out.println(num1 + " " + getCharOperation(operation) + " " + num2 + " = " + result );
    }

    /**
     * Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию
     * (с помощью getOperation(), передать все методу calc() и вывести на экран результат.
     * **/
    public static void main(String[] args) {
        var calculator = new Calculator();
        calculator.calcAndPrint(calculator.getInt(), calculator.getInt(), calculator.getOperationType());
    }

}
