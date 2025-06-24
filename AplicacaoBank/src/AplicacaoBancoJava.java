import java.util.Scanner;

public class AplicacaoBancoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String nome;
        String conta;
        double saldo;
        double saque;
        double transferir;

        System.out.println("Bem vindo ao Banco Itaú");
        System.out.println("  ");
        System.out.println("Qual seu nome completo ? ");
        nome = scanner.nextLine();
        System.out.println("Conta corrente ou poupança ? ");
        conta = scanner.nextLine();
        System.out.println("Qual seu saldo atual ? ");
        saldo = scanner.nextDouble();

        System.out.println("*************************************");
        System.out.printf("""
                            Dados do cliente:
                            Nome: %s            
                            Tipo da conta: %s
                            Saldo inicial: %.2f
                            """, nome, conta, saldo);
        System.out.println("*************************************");

        while (opcao != 4) {
            System.out.println("""
                                Operações:
                                1 - Consultar saldo
                                2 - Sacar valor
                                3 - Transferir valor
                                4 - Sair
                                """);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;
                case 2:
                    System.out.println("Quanto você quer sacar ? ");
                    saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para saque");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual de " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Quanto você quer transferir ? ");
                    transferir = scanner.nextDouble();
                    if (transferir > saldo) {
                        System.out.println("Slado insuficiente para transferência ser efetuada");
                    } else {
                        saldo -= transferir;
                        System.out.println("Transferência feita com sucesso");
                        System.out.println("Saldo atual de " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Volte sempre! ");
                    break;
                default:
                    System.out.println("Não existe essa opção, tente novamente");
            }
            System.out.println("  ");
        }

        scanner.close();
    }
}