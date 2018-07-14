package first_try;

public class Calculator {

    public static double[] realRoots(int a, int b, int c) {
        double rLam1 = ((-1) * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double rLam2 = ((-1) * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double r[] = new double[2];
        r[0] = rLam1;
        r[1] = rLam2;
        return r;
    }

    public static String[] imaginaryRoots(int a, int b, int c) {
        String iLam1 = "" + (-1) * b / (2 * a) + " + " + Math.sqrt((-1) * (Math.pow(b, 2) - 4 * a * c)) / (2 * a) + "i";
        String iLam2 = "" + (-1) * b / (2 * a) + " - " + Math.sqrt((-1) * (Math.pow(b, 2) - 4 * a * c)) / (2 * a) + "i";
        String s[] = new String[2];
        s[0] = iLam1;
        s[1] = iLam2;
        return s;
    }
}
