import java.util.Scanner;

public class barras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Insira o código do produto.");

        String codigo = sc.nextLine();

        //agrupando os numeros em strings separadamente 
        String num1 = codigo.substring(0, 1);
        String num2 = codigo.substring(1, 2); 
        String num3 = codigo.substring(2, 3); 
        String num4 = codigo.substring(3, 4); 
        String num5 = codigo.substring(4, 5);
        String num6 = codigo.substring(5, 6); 
        String num7 = codigo.substring(6, 7); 
        String num8 = codigo.substring(7, 8);
        String num9 = codigo.substring(8, 9); 
        String num10 = codigo.substring(9, 10); 
        String num11 = codigo.substring(10, 11);
        String num12 = codigo.substring(11, 12);
        String num13 = codigo.substring(12, 13);

        //convertendo strings em inteiros
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        int n4 = Integer.parseInt(num4);
        int n5 = Integer.parseInt(num5);
        int n6 = Integer.parseInt(num6);
        int n7 = Integer.parseInt(num7);
        int n8 = Integer.parseInt(num8);
        int n9 = Integer.parseInt(num9);
        int n10 = Integer.parseInt(num10);
        int n11 = Integer.parseInt(num11);
        int n12 = Integer.parseInt(num12);
        int digito_verificador = Integer.parseInt(num13);


//////calculos//////

//(a) Some o primeiro, terceiro, quinto, sétimo, nono e décimo primeiro dígitos.

    int A = (n1 + n3 + n5 + n7 +n9 + n11);

//(b) Some o segundo, quarto, sexto, oitavo, décimo e décimo segundo dígitos.

    int B = (n2 + n4 + n6 + n8 +n10 + n12);

//(c) Multiplique a segunda soma por 3 e adicione o resultado à primeira soma.

    int C = (B*3);
    C = (A + C) ;

//(d) Subtraia 1 desse total.
    
    int D = (C - 1) ;
    
//(e) Extraia o último dígito desse valor. (Dica: use o resto da divisão por 10)

    int E = (D %10) ;

//(f) Faça 9 menos esse resultado.

    int F = (9 - E) ;


    String validação = (F == digito_verificador ? "Verificação de código válida" : "Verificação de código inválida");
    
    
    System.out.printf("%s. %nO número verificador é %d. %n", validação, digito_verificador);         

        sc.close();

    }
}