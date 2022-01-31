/**
 * Задание 3
 * Используя IntelliJ IDEA, создайте класс.
 * Используя циклы и метод: <br>
 * System.out.print("*"), System.out.print (" "), System.out.print ("\n") (для перехода
 * на новую строку). <br>
 * Выведите на экран: <br>
 * · прямоугольник <br>
 * · прямоугольный треугольник <br>
 * · равносторонний треугольник <br>
 * · ромб
 * **/
public class Ex3 {

    enum Figures {
        RECTANGLE, RIGHT_TRIANGLE, EQUILATERAL_TRIANGLE, RHOMBUS
    }

    final char RENDER_CHAR = '*';
    final char EMPTY_CHAR = ' ';

    public void print(Figures figure) {
        int num = 10;
        switch (figure) {
            case RHOMBUS -> {
                System.out.println("Ромб");
                for (int i = 1; i < num/2; ++i){
                    for (int j = num/2; j > i; --j)
                        System.out.print(EMPTY_CHAR);
                    for (int j = 1; j < 2 * i; ++j)
                        System.out.print(RENDER_CHAR);
                    System.out.println();
                }
                for (int i = num/2; i >= 1; --i){
                    for (int j = num/2; j > i; --j)
                        System.out.print(EMPTY_CHAR);
                    for (int j = 1; j < i*2; ++j)
                        System.out.print(RENDER_CHAR);
                    System.out.println();
                }
            }
            case RECTANGLE -> {
                System.out.println("Прямоугольник");
                for (int i = 0; i < num/2; i++){
                    for (int j = 0; j < num; j++){
                        System.out.print(RENDER_CHAR+" ");
                    }
                    System.out.println(EMPTY_CHAR);
                }
            }
            case RIGHT_TRIANGLE -> {
                
            }
        }
    }

    public static void main(String[] args) {
        var e = new Ex3();
        e.print(Figures.RECTANGLE);
    }

}
