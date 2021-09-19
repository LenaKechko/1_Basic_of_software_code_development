public class LinearPrograms {

    //вычислить z = ((a-3)*b/2)+c
    public double firstTask(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public double secondTask(double a, double b, double c) {
        if (a <= 0.0 || c <= 0.0 || b == 0) {
            throw new ArithmeticException();
        }
        double v = b * b + 4 * a * c;
        if (v < 0.0) {
            throw new ArithmeticException();
        }
        return (b + Math.sqrt(v)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public double thirdTask(double x, double y) {
        double a = Math.cos(x) - Math.sin(y);
        if (Math.abs(a) == 0.0 || Math.abs(Math.cos(x * y)) == 0.0) {
            throw new ArithmeticException();
        }
        return (Math.sin(x) + Math.cos(y)) / (a) * Math.tan(x * y);
    }

    public double fourthTask(double r) throws Exception {
        int n = (int) r;
        int d = (int) Math.round((r - n) * 1000);
        if ((n < 100 || n >= 1000) || (d < 100 || d >= 1000)) {
            throw new Exception();
        }
        return d + n / 1000.0;
    }

    public String fifthTask(int t) throws Exception {
        if (t > 86400) {
            throw new Exception();
        }
        int hours = t / 3600;
        t -= hours * 3600;
        int minutes = t / 60;
        int sec = t - minutes * 60;
        return String.format("%02dч %02dмин %02dс", hours, minutes, sec);
    }

    public boolean sixthTask(double x, double y) {
        return ((Math.abs(x) <= 4 && (y > -3 && y <= 0)) || (Math.abs(x) <= 2 && (y >= 0 && y < 4)));
    }
}
