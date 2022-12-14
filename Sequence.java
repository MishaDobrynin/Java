
/**
 * Write a description of class Sequence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sequence
{
    int start, end;
    public Sequence(int start, int end){
        this.start = start;
        this.end = end;
    }
    public int rangeSum(int start, int end){
        int sum = 0;
        if(start <= end){
            sum = sum + start;
            start++;
            sum += rangeSum(start, end);
        }
        return sum;
    }
    public int rangeSum(){
        int sum = 0;
        if(this.start <= this.end){
            sum = sum + this.start;
            this.start++;
            sum += rangeSum();
        }
        return sum;
    }
}
