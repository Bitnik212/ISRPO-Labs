public class Laba1 {

    ArithmeticAverage average = new ArithmeticAverage();
    Circle circle = new Circle();
    Volume volume = new Volume();

    public void ex1 () {
        System.out.println("Задание 1");
        int x = 10;
        int y = 12;
        int z = 3;
        x += y - (x + 1) * z;
        z = y * 5;
        z -= --x;
        System.out.println("x = " + x);
        System.out.println("z = " + z);
        y /= x + 5 % z;
        System.out.println("y = " + y);
        z = x++ + y * 5;
        System.out.println("z = " + z);
        x = y - x++ * z;
        System.out.println("x = " + x);
    }

    public void ex2() {
        this.average.calc(new int[] {2, 2, 20});
    }

    public void ex3() {
        this.circle.calc(200f);
    }

    public void ex4() {
        this.volume.calc(100f, 5f);
    }

    public static void main(String[] args) {
        Laba1 laba = new Laba1();
        laba.ex1();
        laba.ex2();
        laba.ex3();
        laba.ex4();
    }
}


