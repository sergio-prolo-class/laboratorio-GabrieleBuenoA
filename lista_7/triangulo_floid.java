package lista_7;
import java.util.Scanner;

public class triangulo_floid {
    public static void main(String[] args) {

    int linhas;
    int numero = 0;
    int j = 0; // numeros de vezes que soma 1
    int controle = 1; // controle linha atual

    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o número de linhas");
    linhas = sc.nextInt(); 


while (controle <= linhas) {
        while (j < controle) {
        numero = numero + 1 ;
        System.out.printf( "%d ", numero );
        j = j + 1 ;}
    j = 0 ;
    controle = controle + 1;
    System.out.print('\n') ;
    }

    sc.close();
    }
}
