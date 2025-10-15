package práticas_durante_aula;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

    Scanner sc_peso = new Scanner(System.in);
    System.out.println("Insira o peso em quilos");
    float peso = sc_peso .nextFloat();
    
    if (peso < 0) {
        sc_peso.close(); 
        System.out.println("ERRO: peso inválido");
        return;
    }

    Scanner sc_altura = new Scanner(System.in);
    System.out.println("Insira a altura em metros");
    float altura = sc_altura .nextFloat();
         
    if (altura <= 0) {
        sc_altura.close();
        sc_peso.close(); 
        System.out.println("ERRO: altura inválida");
        return;
    }
    
    float IMC = (peso/(altura*altura));

    String classificacao = "classificação";

    if (IMC < 18.5) { 
        classificacao = "abaixo do peso";     
    } else if (IMC < 24.99) { 
        classificacao = "eutrófico";
    } else if (IMC < 29.99) { 
        classificacao = "sobrepeso";
    } else if  (IMC < 34.99) { 
        classificacao = "obesidade grau I"; 
    } else if (IMC < 39.99) { 
        classificacao = "obesidade grau II";
    } else if (40.0 < IMC ) { 
        classificacao = "obesidade grau III";
    }

    System.out.printf("Seu IMC é %.3f. Classificação é de %s. %n", IMC , classificacao );

    sc_altura.close();
    sc_peso.close();

    }
} 