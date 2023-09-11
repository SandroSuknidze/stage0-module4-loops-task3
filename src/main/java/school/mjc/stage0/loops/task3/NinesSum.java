package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int k = 0;
        String d = "9";

        for (int i = 0; i < lengthOfLastNumber; i++) {

            k += Integer.parseInt(d);
            d += "9";
        }

        System.out.println(k);
    }
}
