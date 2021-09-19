import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinearProgramsTest {
    private LinearPrograms linearTest;

    @Before
    public void setUp() {
        linearTest = new LinearPrograms();
    }

    @Test
    public void firstTask() {
        Assert.assertEquals(linearTest.firstTask(3, 1, 1), 1.0, 0.000000001);
        Assert.assertEquals(linearTest.firstTask(5, 1, 1), 2.0, 0.000000001);
    }

    @Test
    public void secondTask() {
        Assert.assertEquals(linearTest.secondTask(3.0, 2.0, 1.0), -25.75, 0.000000001);
        Assert.assertEquals(linearTest.secondTask(3.0, 2.0, 1.0), -25.75, 0.000000001);
    }

    @Test (expected = ArithmeticException.class)
    public void secondTaskDivByZero() {
        linearTest.secondTask(0, 1, 1);
        linearTest.secondTask(1, 0, 1);
    }

    @Test (expected = ArithmeticException.class)
    public void secondTaskNegative() {
        linearTest.secondTask(-4, 1, 1);
    }

    @Test
    public void thirdTask() {
        Assert.assertEquals(linearTest.thirdTask(0,0), 0.0,0.000001);
        Assert.assertEquals(linearTest.thirdTask(0,1), 0.0,0.000001);
        Assert.assertEquals(linearTest.thirdTask(Math.PI,Math.PI), 0.477,0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void thirdTaskDivByZero() {
        linearTest.thirdTask(0,Math.PI / 2);
        linearTest.thirdTask(Math.PI / 2, 0);
        linearTest.thirdTask(Math.PI / 2,1);
    }

    @Test
    public void fourthTask() throws Exception {
        Assert.assertEquals(linearTest.fourthTask(456.654), 654.456, 0.00001);
    }


    @Test(expected = Exception.class)
    public void fourthTaskOneAndOneNumbers() throws Exception {
        linearTest.fourthTask(4.6);
    }

    @Test(expected = Exception.class)
    public void fourthTaskFourAndThreeNumbers() throws Exception {
        linearTest.fourthTask(4444.611);
    }

    @Test(expected = Exception.class)
    public void fourthTaskOneAndThreeNumbers() throws Exception {
        linearTest.fourthTask(4.600);
    }

    @Test(expected = Exception.class)
    public void fourthTaskTwoAndTwoNumbers() throws Exception {
        linearTest.fourthTask(41.61);
    }

    @Test
    public void fifthTask() throws Exception {
        Assert.assertEquals(linearTest.fifthTask(7900), "02ч 11мин 40с");
        Assert.assertEquals(linearTest.fifthTask(36000), "10ч 00мин 00с");
    }
    @Test(expected = Exception.class)
    public void fifthTaskMoreOneDay() throws Exception {
        linearTest.fifthTask(89000);
    }

    @Test
    public void sixthTaskResultTrue() {
        Assert.assertTrue(linearTest.sixthTask(0,0));
    }

    @Test
    public void sixthTaskResultFalse() {
        Assert.assertFalse(linearTest.sixthTask(3,3));
    }
}