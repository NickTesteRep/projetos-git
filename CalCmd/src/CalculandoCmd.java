/*
 * Importar a classe Scanner para realizar interação
 * digitando valores e obtendo retornos.
 * Importar a classe PrintStream para que possa resumir
 * o que será digitado.
 */
import java.io.PrintStream;
import java.util.Scanner;

public class CalculandoCmd {

    public static void main(String[] args) {

    //Criar os objetos referente as classes criadas
    PrintStream show = new PrintStream(System.out);    
    Scanner scan = new Scanner(System.in);
    
   
    int soma;
    int subtracao;
    int multiplicacao;
    float divisao;

    
    //Cmd interativo
   show.println("Digite seu nome: ");
        String texto = scan.next();
   show.println("Olá " + texto + " qual operação deseja realizar?");
   show.println("1-Soma");
   show.println("2-Subtracao");
   show.println("3-multiplicacao");
   show.println("4-Divisao");
         
    
        while (true) {
            
            int texto2 = scan.nextInt();    
        
            switch (texto2) {
            case 1:
                show.println("Soma escolhida!");
                show.print("Digite o primeiro numero: ");
                    int som1 = scan.nextInt();
                show.println("Digite o segundo numero: ");
                    int som2 = scan.nextInt();
                soma = som1 + som2;
                show.println("O resultado da operacao é: " + soma);
                break;
        
            case 2:
                show.println("Subtracao escolhida!");
                show.println("Digite o primeiro numero:");
                    int sub1 = scan.nextInt();
                show.println("Digite o segundo numero:");
                    int sub2 = scan.nextInt();
                subtracao = sub1 - sub2;
                show.println("O resultado da operacao é: " + subtracao);
                break;

            case 3:
                show.println("Multiplicacao escolhida!");
                show.println("Digite o primeiro numero:");
                    int mult1 = scan.nextInt();
                show.println("Digite o segundo numero:");
                    int mult2 = scan.nextInt();
                multiplicacao = mult1 * mult2;
                show.println("O resultado da operação é: " + multiplicacao);
                break;
                
            case 4:
                show.println("Divisão escolhida!");
                show.println("Digite o primeiro numero:");
                    float div1 = scan.nextFloat();
                show.println("Digite o segundo número:");
                    float div2 = scan.nextFloat();
                divisao = div1 / div2;
                show.println("O resultado da operação é: " + divisao);
                break;

            case 0: 
                System.err.println("Programa encerrado.");
                return;
            default:
                System.err.println("Operação invalida. Tente novamente");
            }
        }
    }
}  
    

