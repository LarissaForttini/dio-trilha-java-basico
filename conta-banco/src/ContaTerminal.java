      import java.util.Scanner;

        public class ContaTerminal {
            public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
        
                // Solicitar número da conta
                System.out.println("Por favor, digite o número da Conta !");
                int numero = scanner.nextInt();
                scanner.nextLine();  
        
                // Solicitar agência
                System.out.println("Por favor, digite o número da Agência !");
                String agencia = scanner.nextLine();
        
                // Solicitar nome do cliente
                System.out.println("Por favor, digite o nome do Cliente !");
                String nomeCliente = scanner.nextLine();
        
                // Solicitar saldo
                System.out.println("Por favor, digite o saldo !");
                double saldo = scanner.nextDouble();
        
                // Mensagem final
                String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                                  + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
                System.out.println(mensagem);
        
                scanner.close();
            }
        }
        

