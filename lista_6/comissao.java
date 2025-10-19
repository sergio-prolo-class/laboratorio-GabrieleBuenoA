package lista_6;

import java.util.Scanner;

public class comissao {
    public static void main(String[] args) {

    double vendas, bonus, comissao, remuneracao;
    int avaliacao ;

    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o total em vendas (R$)");
    vendas = sc.nextFloat();

    System.out.println("Insira a avaliação do funcionário");
    avaliacao = sc.nextInt();

    if (avaliacao >= 8) { 
        bonus = 500 ;
    } else {
        bonus = 0 ;
    System.out.printf("bonus %f %n", bonus );
}

    if (vendas >= 10000) {
        comissao = (vendas * (7.0/100));
    } else {
        comissao = (vendas * (5.0/100));
    }
    System.out.printf("comissao %f %n", comissao );


    remuneracao = (2000 + comissao + bonus);
    System.out.printf("Remuneração: R$%.2f %n" , remuneracao);


    sc.close();

    }
}