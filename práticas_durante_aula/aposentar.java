package práticas_durante_aula;

import java.util.Scanner;

public class aposentar {
    public static void main(String[] args) {

        Scanner sc_idade = new Scanner(System.in);   
        System.out.println("Insira a idade.");
        int idade = sc_idade.nextInt();

        Scanner sc_t_servico = new Scanner(System.in);
        System.out.println("Insira o tempo de serviço.");
        int t_servico = sc_t_servico.nextInt();

        if ((idade >= 65 && t_servico >= 25) || (idade >= 60 && t_servico >= 30)){;
            System.out.println("Pode se aposentar. %n");
        } else { 
            System.out.println("Não pode se aposentar.%n");
        }
        sc_idade.close();
        sc_t_servico.close();
    }
}