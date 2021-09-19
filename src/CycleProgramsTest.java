import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CycleProgramsTest {
    private CyclePrograms cycleTest;

    @Before
    public void setUp() throws Exception {
        cycleTest = new CyclePrograms();
    }

    @Test
    public void firstTask() throws Exception {
        Assert.assertEquals(15, cycleTest.firstTask(5));
    }

    @Test(expected = Exception.class)
    public void firstTaskFail() throws Exception {
        cycleTest.firstTask(-1);
    }

    @Test
    public void secondTaskStepInt() {
        List<Double> listTest = Arrays.asList(-1.0, -2.0, 3.0);
        List<Double> listResult = cycleTest.secondTask(1, 3, 1);
        Assert.assertEquals(listTest, listResult);
    }

    @Test
    public void secondTaskStepDouble() {
        List<Double> listTest = Arrays.asList(-1.0, -1.5, -2.0, 2.5, 3.0);
        List<Double> listResult = cycleTest.secondTask(1, 3, 0.5);
        Assert.assertEquals(listTest, listResult);
    }

    @Test
    public void secondTask() {
        List<Double> listTest = Arrays.asList(-1.0, -1.5, -2.0, 2.5, 3.0);
        List<Double> listResult = cycleTest.secondTask(3, 1, -0.5);
        Assert.assertEquals(listTest, listResult);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void secondTaskStepNegative() {
        cycleTest.secondTask(1, 3, -0.5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void secondTaskSegmentNegative() {
        cycleTest.secondTask(3, 1, 0.5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void secondTaskStepZero() {
        cycleTest.secondTask(1, 3, 0);
    }

    @Test
    public void thirdTask() {
        Assert.assertEquals(338350, cycleTest.thirdTask());
    }

    @Test
    public void forthTask() {
        BigInteger number = new BigInteger("621981231756379489999997501700030226361030042908402135795585416076780567701229627071194748755274771867550481130867332728398608915678217606208944334143532903157416015053231992085653846275159616127812272870349795208758168675609821292383968189620347359298821336964567268936282003057371855944848505049857604569455105033587666178052186125598590101814860460233644389300432456960009702905584857393518877079243717213370983146491503406155228997954249347719005783769360467152555665800216223615428450836858053400856713359967484823371026535062161096211713506798207812398746913836648755132232834523663952442186966337759051603462287553956523494664588575257708095078400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        boolean equals = cycleTest.forthTask().equals(number);
        Assert.assertTrue(equals);
    }

    @Test
    public void fifthTask() {
    }

    @Test
    public void sixthTask() {
    }

    @Test
    public void seventhTask() {
    }

    @Test
    public void eighthTask() {
    }
}