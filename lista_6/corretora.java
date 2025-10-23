package lista_6;

import java.util.Scanner;


public class corretora {
    
public static void main(String[] args) {

    double transacao = 0;
    double comissao = 0;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o valor da transação");
    transacao = sc.nextDouble(); 

    if (transacao < 2500) {
        comissao = ((transacao * (1.7/100)) + 30);
    } else if (2500 <= transacao & transacao < 6250) {
        comissao = ((transacao * (0.66/100)) + 56);
    } else if (6250 <= transacao & transacao < 20000) {
        comissao = ((transacao * ((0.34/100)/100)) + 76);
    } else if (20000 <= transacao & transacao < 50000) {
        comissao = (transacao * ((0.22/100)) + 100);
    } else if (50000 <= transacao & transacao < 500000) {
        comissao = ((transacao * (0.11/100)) + 155);
    } else if (50000 < transacao) {
        comissao = transacao * (0.09/100) + 255;
    }

    if (comissao < 39){
        comissao = 39;
    }

    System.err.printf("A taxa de corretagem é de %.2f reais.%n" , comissao);


    sc.close();

    }
}