package lab6;

import java.util.Random;

public class NightSky {

    //attribut
    private double density;
    private int width;
    private int heigth;
    private Random r = new Random();
    private int numberOfStars = 0;

    //Construktor

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.heigth = 10;

    }

    public NightSky (int width, int heigth){
        this.density = 0.1;
        this.width = width;
        this.heigth = heigth;
    }

    public NightSky( double density, int width, int heigth){
        this.density = density;
        this.heigth = heigth;
        this.width = width;
    }

    //method
    public void printLine(){
        for(int i = 0 ; i < this.width ; i++){
            long result = Math.round(Math.random());
            if (result == 1 ){
                System.out.print("*");
                this.numberOfStars++;
            } else {
                System.out.print(" ");
            }
        }

    }

    public void print() {
        for (int i = 0; i < this.heigth; i++) {
            printLine();
            System.out.println("");
        }
    }
    public int starsInLastPrint(){
        return this.numberOfStars;
    }

}




