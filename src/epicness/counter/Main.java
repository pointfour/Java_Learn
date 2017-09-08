package epicness.counter;

import javax.print.DocFlavor;
import java.io.*;

public class Main {



    public static String query(String query) throws IOException {
        System.out.println(query);
        return (new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static void disp(int ep) {
        System.out.println("You have " + ep + " epicness points");
    }

    public static void weird(int max) {
        for (int i = 1; i < max + 1; i++) {
            String diamonds = "";
            for (int j = 1; j < i + 1; j++) {
                diamonds = diamonds + "*";
            }
            System.out.println(diamonds);
        }
        for (int i = max - 1; i > 0; i--) {
            String diamonds = "";
            for (int j = 1; j < i + 1; j++) {
                diamonds = diamonds + "*";
            }
            System.out.println(diamonds);
        }
    }

    public static void main(String[] args) throws IOException {
        Color red = new Color(255, 0, 0);
        AlphaColor transparentRed=new AlphaColor(255,0,0,100);
        weird(5);
        red.print();
        transparentRed.print();
        /*int ep=0;

        String answer=query("What is your name?");

        if(answer.toLowerCase().equals("lesha")){
            ep+=10;
            disp(ep);
        }else if(answer.toLowerCase().equals("human")){
            ep+=5;
            disp(ep);
        }else{
            ep-=3;
            disp(ep);
        }
        answer=query("What is your favorite color?");
        if(answer.toLowerCase().equals("blue")){
            ep+=10;
            disp(ep);
        }else if(answer.toLowerCase().equals("green")){
            ep+=5;
            disp(ep);
        }else{
            ep-=3;
            disp(ep);
        }*/


    }
}
