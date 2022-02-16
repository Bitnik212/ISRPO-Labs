import org.jetbrains.annotations.NotNull;

public class Sorter {

    boolean isSorted(int @NotNull [] numbers) {
        boolean sorted = true;
        Order sortType = Order.NONE;
        if (numbers[0] <= numbers[1]) {
            sortType = Order.ASC;
            for (int i = 2; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    sorted = false;
                    break;
                }
            }
        } else {
            sortType = Order.DSC;
            for (int i = 2; i < numbers.length; i++) {
                if (numbers[i] > numbers[i - 1]) {
                    sorted = false;
                    break;
                }
            }
        }
        if (sorted) switch (sortType) {
            case ASC -> System.out.println("Отсортированно по возрастанию");
            case DSC -> System.out.println("Отсортированно по убыванию");
            case NONE -> System.out.println("Нет сортировки");
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        boolean sorted= true;

    }
}
