public class Volume {

    public double[] calc(double r, double h) {
        System.out.println("Задание 4");
        double v = Math.PI * r * 2 * h;
        double s = 2 * Math.PI * r * (r + h);
        System.out.println("V = " + v);
        System.out.println("S = " + s);
        return new double[] {v, s};
    }

}
