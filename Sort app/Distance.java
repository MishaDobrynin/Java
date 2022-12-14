
/**
 * Write a description of class Distance here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022
 */
public class Distance{
    public double distance(double[] arr){
        double max = 0;
        int length = arr.length;
        for(int i = 0; i < length-1; i++){
            if(Math.abs(arr[i] - arr[i+1]) > max){
                max = Math.abs(arr[i] - arr[i+1]);
            }
        }
        return max;
    }
    public int distance(int[] arr){
        int max = 0;
        int length = arr.length;
        for(int i = 0; i < length-1; i++){
            if(Math.abs(arr[i] - arr[i+1]) > max){
                max = Math.abs(arr[i] - arr[i+1]);
            }
        }
        return max;
    }
}
