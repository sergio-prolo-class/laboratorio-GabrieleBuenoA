package lista_6;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
    
    double a, b, c;

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira os valores dos lados do triângulo");

    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    if (( (a + b) < c ) | ((b + c) < a ) | ((a + c) < b)) {
        System.out.print("Triângulo inválido. ");

    }   else if (( (a / b) == 1 ) & ((b / c) == 1) & ((a / c) == 1)){
        System.out.print("Triângulo equilátero. ");

    }   else if (( (a / b) == 1 ) | ((b / c) == 1) | ((a / c) == 1)) {
        System.out.print("Triângulo isósceles. ");

    }   else if (( (a / b) != 1 ) & ((b / c) != 1) & ((a / c) != 1)) {
        System.out.print("Triângulo escaleno. ");
        
    }

    sc.close();

    }
}