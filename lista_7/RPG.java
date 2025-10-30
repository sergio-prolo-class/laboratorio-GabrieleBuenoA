import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {


    int vit, classe;
    int upgrade = 0;
    int vitInicial = 0;
    int nível = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): ");
        classe = sc.nextInt();

        System.out.print("Entre com a vitalidade desejada: ");
        vit = sc.nextInt();

       

        switch (classe) {
            case 1 -> { 
                upgrade = 10; 
                vitInicial = 150;
            }
            case 2 -> {
                upgrade = 15;
                vitInicial = 200;
            }
            case 3 -> {
                upgrade = 5;
                vitInicial = 100;
            }
            case 4 -> {
                upgrade = 4;
                vitInicial = 80;
            }
            default -> {
                System.out.println("Classe inválida");
                sc.close();
                return;
            }
        }

        while (vitInicial < vit) {
            if (nível % 5 == 0 && nível != 0) {
                vitInicial += (2 * upgrade);
            } else {
                vitInicial += upgrade;
            }
            nível++;
            System.out.printf("Nível: %d, Vitalidade: %d%n", nível, vitInicial); 
        }

        System.out.printf("Nível necessário: %d%n", nível);
        sc.close();
    }
}