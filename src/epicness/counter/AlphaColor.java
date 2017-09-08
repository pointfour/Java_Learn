package epicness.counter;

public class AlphaColor extends Color {
    private int alpha;
    public AlphaColor(int red,int green,int blue,int alpha){
        super(red,green,blue);
        this.alpha=alpha;
    }

    public int a(){
        return this.alpha;
    }
    public void print(){
        System.out.println("("+this.red+","+this.green+","+this.blue+","+this.alpha+")");
    }
}
