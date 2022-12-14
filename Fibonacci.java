
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public int getFibonacci(int x){
        if(x == 0 || x == 1) return x;
        return getFibonacci(x-1) + getFibonacci(x-2);
    }
}
