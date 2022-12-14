public class PowerOf2{
    double x;
    public PowerOf2(double number){
        this.x = number*2;
    }
    public String isPowerOf2(){
        x/=2;
        if(x == 1.0){
            return "YES";
        }
        else if(x < 2 && x!= 1.0){
            return "NO";
        }
        String answer = isPowerOf2();
        return answer;
    }
}