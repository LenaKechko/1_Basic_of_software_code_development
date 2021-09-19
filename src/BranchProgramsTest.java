import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BranchProgramsTest {
    private BranchPrograms branchTest;

    @Before
    public void setUp() {
        branchTest = new BranchPrograms();
    }

    @Test
    public void firstTaskRectangular() {
        Assert.assertEquals("Треугольник существует. Треугольник является прямоугольным!", branchTest.firstTask(90, 40));
    }

    @Test
    public void firstTaskIsExist() {
        Assert.assertEquals("Треугольник существует. Треугольник не является прямоугольным!", branchTest.firstTask(10, 40));
    }

    @Test
    public void firstTaskIsNotExist() {
        Assert.assertEquals("Треугольник не существует", branchTest.firstTask(180, 40));
    }

    @Test
    public void firstTaskNegativeCorner() {
        Assert.assertEquals("Введены не корректные данные", branchTest.firstTask(-60, 40));
    }

    @Test
    public void min() {
        Assert.assertEquals(-1.0, branchTest.min(5.0, -1.0), 0.000001);
    }

    @Test
    public void max() {
        Assert.assertEquals(5.0, branchTest.max(5.0, -1.0), 0.000001);
    }

    @Test
    public void secondTask() {
        Assert.assertEquals(1.0, branchTest.secondTask(1, 5, 6, -1), 0.0000001);
    }

    @Test
    public void thirdTaskWhenTrue() {
        Assert.assertEquals("Точки расположены на одной прямой", branchTest.thirdTask(0, 0, 1, 1, 2, 2));
    }

    @Test
    public void thirdTaskWhenFalse() {
        Assert.assertEquals("Точки не расположены на одной прямой", branchTest.thirdTask(0, 0, 1, 1, 1, 2));
    }

    @Test
    public void forthTaskIsTrueXY() {
        Assert.assertEquals("Кирпич пройдет через отверстие", branchTest.forthTask(2, 4, 1, 1, 6));
    }

    @Test
    public void forthTaskIsTrueXZ() {
        Assert.assertEquals("Кирпич пройдет через отверстие", branchTest.forthTask(2, 4, 1, 3, 1));
    }

    @Test
    public void forthTaskIsTrueYZ() {
        Assert.assertEquals("Кирпич пройдет через отверстие", branchTest.forthTask(2, 4, 3, 1, 2));
    }

    @Test
    public void forthTaskIsFalse() {
        Assert.assertEquals("Кирпич не пройдет через отверстие", branchTest.forthTask(1, 1, 3, 1, 2));
    }

    @Test
    public void fifthTaskBranchFirst() {
        Assert.assertEquals(9.0, branchTest.fifthTask(3), 0.0000001);
    }

    @Test
    public void fifthTaskBranchSecond() {
        Assert.assertEquals(0.014, branchTest.fifthTask(4), 0.001);
    }
}