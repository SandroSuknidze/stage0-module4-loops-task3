package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int bigger = first > second ? first : second;
        int divisor = 0;
        for(int i=1; i<=bigger; i++){
            if (first % i == 0 && second % i == 0){
                divisor = i;
            }
        }
        System.out.println(divisor);
    }
}
