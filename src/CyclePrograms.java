import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CyclePrograms {

    public int firstTask(int n) throws Exception {
        int sum = 0;
        if (n <= 0) {
            throw new Exception();
        }
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    public List<Double> secondTask(int a, int b, double h) {
        if ((a > b && h >= 0) || (a < b && h <= 0)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        List<Double> resultList = new ArrayList<Double>();
        if (a > b) {
            int r = a;
            a = b;
            b = r;
            h = Math.abs(h);
        }
        double x = a;
        while (x <= b) {
            if (x > 2) {
                resultList.add(x);
            } else {
                resultList.add(-x);
            }
            x += h;
        }
        return resultList;
    }

    public long thirdTask() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    public BigInteger forthTask() {
        BigInteger pr = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            pr = pr.multiply(BigInteger.valueOf(i * i));
        }
        return pr;
    }

    public void fifthTask() {

    }

    public void sixthTask() {

    }

    public void seventhTask() {

    }

    public void eighthTask() {

    }
}
