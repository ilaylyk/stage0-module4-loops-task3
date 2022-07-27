package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        long number = 0;
        for (long i = firstBoarder; i <= secondBoarder; i++) {
            number += i;
        }
        System.out.println(number);
    }
}
