import java.util.Scanner;
public class CaixaEletronico {
    static double saldo = 1000.00;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valor;
        
        opcao = show_menu_for_user(scanner);
        if (opcao == 1) {
            user_choose_withdraw(scanner);
        } else if (opcao == 2) {
            user_choose_deposit(scanner);
        } else if (opcao == 3) {
            user_choose_check_balance();
        } else {
            System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }

    private static int show_menu_for_user(Scanner scanner) {
        System.out.println("Bem-vindo ao Caixa Eletrônico");
        System.out.println("Seu saldo atual é: R$" + saldo);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Consultar Saldo");
        return scanner.nextInt();
    }

    private static void user_choose_withdraw(Scanner scanner) {
        System.out.println("Digite o valor do saque:");
        double valor = scanner.nextDouble();
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        }
    }

    private static void user_choose_deposit(Scanner scanner) {
        System.out.println("Digite o valor do depósito:");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    private static void user_choose_check_balance() {
        System.out.println("Seu saldo atual é: R$" + saldo);
    }
}
