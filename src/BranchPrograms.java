public class BranchPrograms {

    public String firstTask(int firstCorner, int secondCorner) {
        String isNotCorrect = "Введены не корректные данные";
        String isExistRectangular = "Треугольник существует. Треугольник является прямоугольным!";
        String isExistNotRectangular = "Треугольник существует. Треугольник не является прямоугольным!";
        String isNotExist = "Треугольник не существует";
        if (firstCorner < 0 || secondCorner < 0) {
            return isNotCorrect;
        }
        int threeCorner = 180 - (firstCorner + secondCorner);
        if (threeCorner <= 0) {
            return isNotExist;
        }
        if (firstCorner == 90 || secondCorner == 90 || threeCorner == 90) {
            return isExistRectangular;
        } else {
            return isExistNotRectangular;
        }
    }

    public double min(double a, double b) {
        return a < b ? a : b;
    }

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    public double secondTask(double a, double b, double c, double d) {
        return max(min(a, b), min(c, d));
    }

    public String thirdTask(double x1, double y1, double x2, double y2, double x3, double y3) {
        String isTrue = "Точки расположены на одной прямой";
        String isFalse = "Точки не расположены на одной прямой";
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            return isTrue;
        } else {
            return isFalse;
        }
    }

    public String forthTask(double a, double b, double x, double y, double z) {
        String isTrue = "Кирпич пройдет через отверстие";
        String isFalse = "Кирпич не пройдет через отверстие";
        if ((a >= x && b >= y) || (a >= y && b >= x)) {
            return isTrue;
        } else if ((a >= x && b >= z) || (a >= z && b >= x)) {
            return isTrue;
        } else if ((a >= y && b >= z) || (a >= z && b >= y)) {
            return isTrue;
        } else {
            return isFalse;
        }
    }

    public double fifthTask(double x) {
        if (x > 3) {
            return 1 / (Math.pow(x, 3) + 6);
        } else {
            return x * x - 3 * x + 9;
        }
    }
}
