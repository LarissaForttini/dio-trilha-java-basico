      import java.util.Scanner;

        public class ContaTerminal {
            public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
        
                // Pedir número da conta
                System.out.println("Por favor, digite o número da 933Conta.");
                int numero = scanner.nextInt();
                scanner.nextLine();  
        
                // Pedir número da agência
                System.out.println("Por favor, digite o número da Agência.");
                String agencia = scanner.nextLine();
        
                // Pedir nome do Cliente
                System.out.println("Por favor, digite seu nome.");
                String nomeCliente = scanner.nextLine();
        
                // Pedir saldo do Cliente
                System.out.println("Por favor, digite o seu saldo");
                double saldo = scanner.nextDouble();
        
                // Mensagem final
                
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                                  + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
                scanner.close();
            }
        }
        

