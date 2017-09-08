package epicness.counter;

public class Color {
    public int red, green, blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int r() {
        return this.red;
    }

    public int g() {
        return this.green;
    }

    public int b() {
        return this.blue;
    }

    public void print(){
        System.out.println("("+this.red+","+this.green+","+this.blue+")");
    }

    public void colorboost(int amount){
        this.red+=amount;
        this.green+=amount;
        this.blue+=amount;
        if(this.red>255){
            this.red=255;
        }
        if(this.green>255){
            this.green=255;
        }
        if(this.blue>255){
            this.blue=255;
        }
    }

}







