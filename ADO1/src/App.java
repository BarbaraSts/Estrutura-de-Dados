import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int menu;
       String nome = "";

       System.out.println("Digite seu nome: ");
       nome = sc.next();
       Vetor vetor = new Vetor(nome);
        
 
        

       do{

        System.out.println("\n Sistema IMC \n 1 - Informar Dados \n 2 - Calcular o IMC \n 3 - Exibir Resultados \n 4 - Sair \n \nEscolha uma opção: \n");
        menu = sc.nextInt();
        
        switch(menu){

            case 1: 
                System.out.println("-- Informações de Dados --\n");
                
                System.out.println("Informe seu Peso: ");
                double peso = sc.nextDouble();
                System.out.println("Informe sua Altura: ");
                double altura = sc.nextDouble();

                try {

                    vetor.adiciona(peso);
                    vetor.adiciona(altura);
                    
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }

            break;

            case 2: 
            
                DecimalFormat df = new DecimalFormat("#,###.00");
                //df.format(vetor.calculoImc());
                System.out.printf("O seu IMC é de: " + df.format(vetor.calculoImc()));
                System.out.println("");
                
            break;

            case 3: 

                vetor.imc();

            break;

            case 4: 

                System.out.println(" Saindo do Sistema! ");

            break;

            default:
                System.out.println("Operação inválida! \n Digite uma opção novamente: ");
                break;
        }
       }while(menu != 4);

    }
}
