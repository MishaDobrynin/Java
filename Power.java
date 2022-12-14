
/**
 * Write a description of class Power here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Power
{
    int base, power;
    public Power(int base, int power){
        this.base = base;
        this.power = power;
    }
    public int getPowerOf(){
        if(power == 0) return 1;
        power--;
        return base*getPowerOf();
    }
}
