/* Three differences
1. Java uses static void and Python uses def
2. Java uses Math.pow(num1,num2) to compute and Python uses num1 ** num2
3. Java uses System.out.println to print and Python uses print */

public class Power {
    public static void main(String[] args){
        long result = (long) Math.pow(2,31);
        System.out.println(result);
    }
}
