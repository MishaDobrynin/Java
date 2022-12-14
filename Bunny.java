public class Bunny{
    int stairs, jumpMax, iCap;
    Integer[] seq;
    public Bunny(int x, int y){
        if(x < 1 || y < 1) throw new IllegalArgumentException("Illegal bunny arguments");
        this.stairs = x;
        this.jumpMax = y;
        this.seq = new Integer[this.stairs+1];
    }
    public int getWaysForBunny(){
        if(this.jumpMax == 1) return 1;
        this.seq[this.stairs] = this.seq[this.stairs-1] = 1;
        for(int i = this.stairs-2; i >= 0; i--){
            this.iCap = i;
            seq[i] = solveStep(i+1);
        }
        return seq[0];
    }
    private int solveStep(int i){
        if(i > this.stairs || i > this.iCap+jumpMax) return 0;
        return seq[i] + solveStep(i+1);
    }
}