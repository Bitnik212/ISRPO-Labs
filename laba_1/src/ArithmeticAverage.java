public class ArithmeticAverage {

    public float calc(int[] numbers) {
        System.out.println("Задание 2");
        float result = 0;
        for (int i = 0; i < numbers.length; i++ ) {
            result += numbers[i];
        }
        result = result/numbers.length;
        System.out.println(result);
        return result;
    }

}
