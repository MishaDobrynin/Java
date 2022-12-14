
/**
 * Write a description of class Inside here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022
 */
public class Inside
{
    public boolean inside(double[] a, double b[]){
        boolean flag = false;
        int lookIndex = 0;
        for(double c: a){
            if(lookIndex == b.length){
                flag = true;
                break;
            }
            if(c == b[lookIndex]){
                lookIndex ++;
            }
        }
        return flag;
    }
    public boolean inside(String[] a, String[] b){
        boolean flag = false;
        int lookIndex = 0;
        for(String c: a){
            if(lookIndex == b.length){
                flag = true;
                break;
            }
            if(c.equals(b[lookIndex])){
                lookIndex ++;
            }
        }
        return flag;
    }
    public boolean inside(int[] a, int b[]){
        boolean flag = false;
        int lookIndex = 0;
        for(int c: a){
            if(lookIndex == b.length){
                flag = true;
                break;
            }
            if(c == b[lookIndex]){
                lookIndex ++;
            }
        }
        return flag;
    }
}
