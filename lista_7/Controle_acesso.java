package lista_7;
import java.util.Scanner;

public class Controle_acesso {
    public static void main(String[] args) {

    int senha;
    int i = 1;

    Scanner sc = new Scanner(System.in);
    
    do {
        System.out.println("Insira a senha");
        senha = sc.nextInt();
        if (senha == 314159) {
            System.out.println("Acesso autorizado");
            break;
        } else 
            System.out.println("Acesso negado (senha incorreta)");
            i++;
        }
    while (i <= 3);

    if (i > 3) {
        System.out.println("Sistema bloqueado");
    }

    sc.close();
    }
}