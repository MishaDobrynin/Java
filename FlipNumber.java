public class FlipNumber
{
    int x;
    int xLenOg;
    public FlipNumber(int toFlip){
        this.x = toFlip*10;
        this.xLenOg = (int)Math.log10(x);
    }
    public int doFlip(){
        if(xLenOg < -1) return 0;
        xLenOg--;
        return getDigit()*(int)Math.pow(10,xLenOg) + doFlip();
    }
    public int getDigit(){
        x/=10;
        return x%10;
    }
}
