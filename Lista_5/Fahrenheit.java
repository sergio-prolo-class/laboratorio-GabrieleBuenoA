package Lista_5;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Insira a temperatura Fahrenheit");
        
        double numFahrenheit  = sc.nextDouble(); 

        double numCelcius = (numFahrenheit - 32)*(5.0/9);

        System.out.printf("O número, em Celcius, é %.3f %n", numCelcius);
        
        sc.close();
    }
}