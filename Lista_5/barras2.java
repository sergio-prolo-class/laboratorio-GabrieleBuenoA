package Lista_5;

import java.util.Scanner;

public class barras2 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
    
        System.out.println("Insira a primeira parte do código do produto.");
        int n1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Insira a segunda parte do código do produto.");
        String codigo_parte2 = sc2.nextLine();

//agrupando os numeros em strings separadamente parte 2
    String num2 = codigo_parte2.substring(0, 1); 
    String num3 = codigo_parte2.substring(1, 2); 
    String num4 = codigo_parte2.substring(2, 3); 
    String num5 = codigo_parte2.substring(3, 4);
    String num6 = codigo_parte2.substring(4, 5); 
    String num7 = codigo_parte2.substring(5, 6); 

//convertendo strings em inteiros parte 2
    int n2 = Integer.parseInt(num2);
    int n3 = Integer.parseInt(num3);
    int n4 = Integer.parseInt(num4);
    int n5 = Integer.parseInt(num5);
    int n6 = Integer.parseInt(num6);
    int n7 = Integer.parseInt(num7);

    Scanner sc3 = new Scanner(System.in);

    System.out.println("Insira a terceira parte do código do produto, sem o digito verificador.");
    String codigo_parte3 = sc3.nextLine();


//agrupando os numeros em strings separadamente parte 3
    String num8 = codigo_parte3.substring(0, 1);
    String num9 = codigo_parte3.substring(1, 2); 
    String num10 = codigo_parte3.substring(2, 3); 
    String num11 = codigo_parte3.substring(3, 4); 
    String num12 = codigo_parte3.substring(4, 5);

//convertendo strings em inteiros
        int n8 = Integer.parseInt(num8);
        int n9 = Integer.parseInt(num9);
        int n10 = Integer.parseInt(num10);
        int n11 = Integer.parseInt(num11);
        int n12 = Integer.parseInt(num12);

//////calculos//////

//(a) Some o primeiro, terceiro, quinto, sétimo, nono e décimo primeiro dígitos.

    int A = (n1 + n3 + n5 + n7 + n9 + n11);

//(b) Some o segundo, quarto, sexto, oitavo, décimo e décimo segundo dígitos.

    int B = (n2 + n4 + n6 + n8 + n10 + n12);

//(c) Multiplique a segunda soma por 3 e adicione o resultado à primeira soma.

    int C = (B*3);
    C = (A + C) ;

//(d) Subtraia 1 desse total.
    
    int D = (C - 1) ;
    
//(e) Extraia o último dígito desse valor. (Dica: use o resto da divisão por 10)

    int E = (D %10) ;

//(f) Faça 9 menos esse resultado.

    int digito_verificador = (9 - E) ;

    System.out.printf("O dígito verificador é %d. ", digito_verificador);         

    sc1.close();     
    sc2.close();
    sc3.close();

    }
}