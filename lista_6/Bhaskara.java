package lista_6;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {

    double Xgraus, SenoX_Aprox, rad, SenoX_real;

    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com o valor do ângulo em graus");
    Xgraus = sc.nextFloat(); 

    SenoX_Aprox = 0;
    SenoX_real = 0;

    if ( Xgraus <= 180) {
        SenoX_Aprox = ((4 * Xgraus) * (180 - Xgraus)) / (40500 - (Xgraus *(180 - Xgraus)));

    rad = Math.toRadians(Xgraus);
    SenoX_real = Math.sin(rad);
    
    System.out.printf("Valor aproximado do Seno é: %.4f. %n", SenoX_Aprox);
    System.out.printf("Valor real do Seno é: %.4f. %n", SenoX_real);

    } 
        else if (180 < Xgraus & Xgraus < 360) {
            Xgraus = (360 - Xgraus);
        SenoX_Aprox = (-1)* ((4 * Xgraus) * (180 - Xgraus)) / (40500 - (Xgraus *(180 - Xgraus)));

        rad = Math.toRadians(Xgraus);
        SenoX_real = Math.sin(rad) *-1;

        System.out.printf("OValor aproximado do Seno é: %.4f. %n", SenoX_Aprox);
        System.out.printf("Valor real do Seno é: %.4f. %n", SenoX_real);
    }
    
   sc.close();

    }
}