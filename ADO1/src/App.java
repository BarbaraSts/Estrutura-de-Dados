import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int menu;
       String nome = "";

       System.out.println("Digite seu nome: ");
       nome = sc.next();
       Vetor vetor = new Vetor(nome);
       

       do{

        System.out.println("\n Sistema IMC \n 1 - Informar Dados \n 2 - Calcular o IMC \n 3 - Exibir Resultados \n 4 - Sair \n Escolha uma opção: \n");
        menu = sc.nextInt();
        
        switch(menu){

            case 1: 
                System.out.println("Informações de Dados");
                
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

                System.out.println("O seu IMC é de " + vetor.calculoImc());
                

            break;

            case 3: 
            break;

            case 4: 
            break;
        }
       }while(menu != 4);

    }
}
