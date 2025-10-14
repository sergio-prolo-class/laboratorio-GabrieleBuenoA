import java.util.Scanner;

public class Aprovação {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
       System.out.println("Insira a frequência");

       int frequencia = sc.nextInt();

        System.out.println("Insira as notas");
    
        double media = sc.nextDouble();
    
       media = (media + sc.nextDouble());
       media = (media + sc.nextDouble());
       media = (media + sc.nextDouble());
       media = (media/4.0);
        
    String Aprovacao = ((media >= 6.0) && (frequencia > 75))  ? "aprovado" : "reprovado";
        
    System.out.printf("A média é %.1f e a frêquencia é %d , aluno %s", media, frequencia, Aprovacao) ;


    sc.close();

    }
}