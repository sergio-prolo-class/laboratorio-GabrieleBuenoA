import java.util.Scanner;

public class bisexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Insira o ano");

        int ano = sc.nextInt();

        String bisexto = ((  (   (ano % 4 == 0) && (ano % 100 != 0)   ) || (ano % 400 == 0))) ? "é bisexto" : "não é bisexto"  ;

        System.out.printf("O ano %s %n" , bisexto) ;
 
        sc.close();

    }
}