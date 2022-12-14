
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    int of;
    public Factorial(int of){
        this.of = of + 1;
    }
    public int getFactorial(){
        if(of <= 1) return 1;
        of--;
        return of*getFactorial();
    }
}
