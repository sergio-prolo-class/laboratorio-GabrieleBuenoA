package lista_6;

import java.util.Scanner;

public class numExtenso {
    public static void main(String[] args) {

        double numero, unidade, dezena;
        String palavra_unidade, palavra_dezena;
        unidade = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número inteiro entre 1 a 99: ");
        numero = sc.nextDouble(); 

       
        unidade = numero % 10;
        dezena = (numero - (numero % 10))/10;
        palavra_dezena = "dezena";
        palavra_unidade = "unidade"; 
                        
        if ( 10 < numero & numero < 20) {
                if (unidade == 1) { 
                    palavra_unidade = "onze"; 
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 2) { 
                    palavra_unidade = "doze";
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 3) { 
                    palavra_unidade = "treze";
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 4) { 
                    palavra_unidade = "catorze";
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 5) { 
                    palavra_unidade = "quinze";
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 6) { 
                    palavra_unidade = "dezesseis";
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 7) { 
                    palavra_unidade = "dezessete";
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 8) { 
                    palavra_unidade = "dezoito";
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);
                } else if (unidade == 9) { 
                    palavra_unidade = "dezenove"; 
                    System.out.printf("Número por extenso: %s %n", palavra_unidade);              
                }
        }
        
        if ( 20 <= numero & numero <= 99) {
            if (dezena == 2) { 
                palavra_dezena  = "vinte"; 
            } else if (dezena == 3) { 
                palavra_dezena = "trinta";
            } else if (dezena == 4) { 
                palavra_dezena = "quarenta";
            } else if (dezena == 5) { 
                palavra_dezena = "cinquenta";
            } else if (dezena == 6) { 
                palavra_dezena = "sessenta";
            } else if (dezena == 7) { 
                palavra_dezena = "setenta";
            } else if (dezena == 8) { 
                palavra_dezena = "oitenta";
            } else if (dezena == 9) { 
                palavra_dezena = "noventa";
            }
        }

        if (unidade == 1) { 
            palavra_unidade = "um"; 
        } else if (unidade == 2) { 
            palavra_unidade = "dois"; 
        } else if (unidade == 3) { 
            palavra_unidade = "três"; 
        } else if (unidade == 4) { 
            palavra_unidade = "quatro"; 
        } else if (unidade == 5) { 
            palavra_unidade = "cinco";
        } else if (unidade == 6) { 
            palavra_unidade = "seis"; 
        } else if (unidade == 7) { 
            palavra_unidade = "sete"; 
        } else if (unidade == 8) { 
            palavra_unidade = "oito"; 
        } else if (unidade == 9) { 
            palavra_unidade = "nove";
        } else if (unidade == 0) { 
            palavra_unidade = "dez";
        }

       
        if (((numero % 10) != 0) & (numero >= 20)) {
            System.out.printf("Número por extenso: %s e %s %n", palavra_dezena, palavra_unidade);
        }   else if (numero <= 10) {
                System.out.printf("Número por extenso: %s %n", palavra_unidade);
        }    else if (numero %10 == 0){
                System.out.printf("Número por extenso: %s %n", palavra_dezena);
            }
    
        
    sc.close();
    }
}
        









             // if ((numero % 10) == 0) {
        //     System.out.printf("%s", palavra_dezena);
        // }    else {
        //     System.out.printf(" %s e %s", palavra_dezena, palavra_unidade);
        // }
                
        
        // else if ( 20 <= numero & numero <= 99) {
        //     dezena = numero - (numero % 10);
        //         if (dezena ==2) {
        //             palavra_dezena = "vinte";
        //             System.out.printf("%s e %s %n", palavra_dezena, palavra_unidade);
                    
        //         }
            
        
         
        // if (numero <= 10 | numero >= 20) {
        //     unidade = numero % 10;
        //     dezena = numero - (numero % 10);
        //         if (unidade == 1) { 
        //             palavra_unidade = "um"; 
                
        //         } else if (unidade == 2) { 
        //             palavra_unidade = "dois";
                
        //         } else if (unidade == 3) { 
        //             palavra_unidade = "três";
                
        //         } else if (unidade == 4) { 
        //             palavra_unidade = "quatro";
                
        //         } else if (unidade == 5) { 
        //             palavra_unidade = "cinco";
                
        //         } else if (unidade == 6) { 
        //             palavra_unidade = "seis";
                
        //         } else if (unidade == 7) { 
        //             palavra_unidade = "sete";
                
        //         } else if (unidade == 8) { 
        //             palavra_unidade = "oito";
                
        //         } else if (unidade == 9) { 
        //             palavra_unidade = "nove"; 
                
        //         } else if (unidade == 0) { 
        //             palavra_unidade = "dez"; 
        //         }





        
        // else if ( 10 <= numero & numero < 20) {
        //     unidade = numero %10;
        //     if (unidade == 1) { 
        //             palavra_unidade = "onze"; 
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 2) { 
        //             palavra_unidade = "dois";
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 3) { 
        //             palavra_unidade = "três";
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 4) { 
        //             palavra_unidade = "quatro";
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 5) { 
        //             palavra_unidade = "cinco";
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 6) { 
        //             palavra_unidade = "seis";
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 7) { 
        //             palavra_unidade = "sete";
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 8) { 
        //             palavra_unidade = "oito";
        //             System.out.printf("%s %n", palavra_unidade);
        //         } else if (unidade == 9) { 
        //             palavra_unidade = "nove"; 
        //             System.out.printf("%s %n", palavra_unidade);     



            //     if (numero == 10) {
            //         System.out.println("dez");
            //     } else if (numero == 11) {
            //         System.out.println("onze");
            //     } else if (numero == 12) {
            //         System.out.println("doze");
            //     } else if (numero == 13) {
            //         System.out.println("treze");
            //     } else if (numero == 14) {
            //         System.out.println("catorze");
            //     } else if (numero == 15) {
            //         System.out.println("quinze");
            //     } else if (numero == 16) {
            //         System.out.println("dezesseis");
            //     } else if (numero == 17) {
            //         System.out.println("dezessete");
            //     } else if (numero == 18) {
            //         System.out.println("dezoito");
            //     } else if (numero == 19) {
            //         System.out.println("dezenove");
            //     }
            // }

        // if (unidade == 1) { palavra_unidade = "um"; 
        //     } else if (unidade == 2) { palavra_unidade = "dois"; 
        //     } else if (unidade == 3) { palavra_unidade = "três"; 
        //     } else if (unidade == 4) { palavra_unidade = "quatro"; 
        //     } else if (unidade == 5) { palavra_unidade = "cinco";
        //     } else if (unidade == 6) { palavra_unidade = "seis"; 
        //     } else if (unidade == 7) { palavra_unidade = "sete"; 
        //     } else if (unidade == 8) { palavra_unidade = "oito"; 
        //     } else if (unidade == 9) { palavra_unidade = "nove";   








        
        // else if ( 10 <= numero & numero < 20) {
        //         if (numero == 10) {
        //             System.out.println("dez");
        //         } else if (numero == 11) {
        //             System.out.println("onze");
        //         } else if (numero == 12) {
        //             System.out.println("doze");
        //         } else if (numero == 13) {
        //             System.out.println("treze");
        //         } else if (numero == 14) {
        //             System.out.println("catorze");
        //         } else if (numero == 15) {
        //             System.out.println("quinze");
        //         } else if (numero == 16) {
        //             System.out.println("dezesseis");
        //         } else if (numero == 17) {
        //             System.out.println("dezessete");
        //         } else if (numero == 18) {
        //             System.out.println("dezoito");
        //         } else if (numero == 19) {
        //             System.out.println("dezenove");
                
            // }


    





