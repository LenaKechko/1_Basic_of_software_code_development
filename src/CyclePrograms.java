import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

    public double fifthTask(int n, double e) {
        if (n < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = 0;
        double sum = 0.0;
        while (i <= n) {
            double aN = 1.0 / Math.pow(2, i) + 1.0 / Math.pow(3, i);
            if (Math.abs(aN) >= e) {
                sum += aN;
            }
            i++;
        }
        return sum;
    }

    public int[] sixthTask(String symbols) {
        if (symbols.equals("")) {
            return new int[]{255};
        }
        int[] numbers = new int[symbols.length()];
        for (int i = 0; i < symbols.length(); i++) {
            numbers[i] = (int) symbols.charAt(i);
        }
        return numbers;
    }

    public HashMap<Integer, List<Integer>> seventhTask(int m, int n) throws Exception {
        if (m > n) {
            throw new Exception();
        }
        if (m <= 0 || n <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        HashMap<Integer, List<Integer>> result = new HashMap<>();
        List<Integer> divisor = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            divisor.clear();
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisor.add(j);
                }
            }
            List<Integer> tempList = new ArrayList<>(divisor);
            result.put(i, tempList);
        }
        return result;
    }

    public int withoutFractionalPart(double num) {
        int d = (int) Math.round((num - (int) num) * 1000);
        if (d == 0) {
            return (int) num;
        }
        return -1;
    }

    public String eighthTask(double x, double y) {
        String number1 = "";
        String number2 = "";
        if (withoutFractionalPart(x) == -1) {
            number1 = Double.toString(x);
        } else {
            number1 = Integer.toString((int) x);
        }
        if (withoutFractionalPart(y) == -1) {
            number2 = Double.toString(y);
        } else {
            number2 = Integer.toString((int) y);
        }
        StringBuilder resultList = new StringBuilder();
        int len = Math.min(number1.length(), number2.length());
        if (len == number2.length()) {
            String temp = number1;
            number1 = number2;
            number2 = temp;
        }

        for (int i = 0; i < len; i++) {
            if (number1.charAt(i) != '.' && number2.contains(Character.toString(number1.charAt(i)))) {
                resultList.append(number1.charAt(i));
            }
        }
        return resultList.toString();
    }
}
