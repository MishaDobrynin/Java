
/**
 * Flips an array of things
 *
 * @author Misha Dobrynin
 * @version (a version number or a date)
 */
public class Flip
{
    public String[] flip(String[] arr){
        int le;
        String hold;
        le = arr.length;
        for(int i = 0; i < le/2; i++){
            hold = arr[i];
            arr[i] = arr[le-i-1];
            arr[le-i-1] = hold;
        }
        return arr;
    }
    public int[] flip(int[] arr){
        int hold,le;
        le = arr.length;
        for(int i = 0; i < le/2; i++){
            hold = arr[i];
            arr[i] = arr[le-i-1];
            arr[le-i-1] = hold;
        }
        return arr;
    }
    public double[] flip(double[] arr){
        int le;
        double hold;
        le = arr.length;
        for(int i = 0; i < le/2; i++){
            hold = arr[i];
            arr[i] = arr[le-i-1];
            arr[le-i-1] = hold;
        }
        return arr;
    }
    public char[] flip(char[] arr){
        int le;
        char hold;
        le = arr.length;
        for(int i = 0; i < le/2; i++){
            hold = arr[i];
            arr[i] = arr[le-i-1];
            arr[le-i-1] = hold;
        }
        return arr;
    }
}
