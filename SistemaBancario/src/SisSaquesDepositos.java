import java.io.PrintStream;
import java.util.Scanner;

public class SisSaquesDepositos {

    public static void main(String[] args){

        PrintStream show = new PrintStream(System.out);
        Scanner scan = new Scanner(System.in);

        show.println("Digite o seu nome: ");
        String nome = scan.next();
    
        try {
        show.println("Digite o numero da conta: ");
        String numConta = scan.next();
            if(numConta.length() != 8){
              throw new IllegalArgumentException("Numero de conta invalido");
            }
                System.out.println("Numero de conta valido");
    
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                }
                finally{
                    scan.close();
                }
                
                
                 
            
        while (true) {
            
           
            show.println("Qual operação deseja realizar?");
            show.println("1-Saque");
            show.println("2-Deposito");
            show.println("3-Consultar Saldo");

            int operacao = scan.nextInt();
           
            for (float saldo = 0; ;) {
            
            switch (operacao) {
                case 1:
                    System.out.println("Digite o valor que deseja sacar: ");
                        float saque = scan.nextFloat();
                            saldo -= saque;         
                                if(saque > saldo){
                                    System.out.println("Saldo insuficiente");
                            }else{
                                System.out.println("Saldo restante: R$" + saldo);
                                }
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                        float deposito = scan.nextFloat();
                            saldo += deposito;
                                System.out.println("Saldo atual: R$" + saldo);
                    break;

                case 3: 
                    System.out.println("Saldo atual: R$" + saldo);
                
                case 0:
                    System.out.println("Programa encerrado");
                
                default:
                    System.err.println("Dados incorretos");
                scan.close();

                    break;
                }
            } 
           
        }
                

    }
    
}
