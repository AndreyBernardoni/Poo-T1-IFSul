import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {

            menu();

            option = sc.nextInt();

            switch (option) {
                case 1:
                    
                    break;
            
                case 2:
                    
                    break;
            
                case 3:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (option != 3);

        sc.close();
    }

    public static void menu() {
        System.out.println("1.) Cadastro ");
        System.out.println("2.) Consultar");
        System.out.println("3.) Sair");
        System.out.println("\nInsira sua opção: ");
    }

    public void clear() {
        System.out.print("033 [H033 [2J");
    }

}
