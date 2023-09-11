package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int count = 1;

        while (count <= lastFibonacci) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
    }
}
