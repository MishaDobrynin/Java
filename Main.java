
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String [] args){
        Sequence seq1 = new Sequence(1, 4);
        Factorial fac1 = new Factorial(5);
        Power pow1 = new Power(2, 10);
        Fibonacci fib1 = new Fibonacci();
        PowerOf2 pow2 = new PowerOf2(64);
        FlipNumber flp1 = new FlipNumber(1234);
        System.out.println(seq1.rangeSum(1, 4));
        System.out.println(seq1.rangeSum());
        System.out.println(fac1.getFactorial());
        System.out.println(pow1.getPowerOf());
        System.out.println(fib1.getFibonacci(5));
        System.out.println(pow2.isPowerOf2());
        System.out.println(flp1.doFlip());
        System.out.println("The end!");
    }
}
