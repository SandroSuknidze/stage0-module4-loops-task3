package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int k = 0;

        int bigger = firstBoarder > secondBoarder ? firstBoarder : secondBoarder;
        int smaller = firstBoarder < secondBoarder ? firstBoarder : secondBoarder;

        for (int i = smaller; i <= bigger; i++) {
            k += i;
        }

        System.out.println(k);
    }
}
