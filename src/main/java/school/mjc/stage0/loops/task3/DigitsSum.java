package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String k = "" + t;
        int sum = 0;

        for (int i = 0; i < k.length(); i++){
            if(k.charAt(i) == '-'){
                continue;
            } else {
                sum += k.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
