package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber > 0) {
            System.out.println((int) ((10 * (Math.pow(10, lengthOfLastNumber) - 1)) / 9 - lengthOfLastNumber));
        } else {
            System.out.println(0);
        }
    }
}
