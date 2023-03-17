import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Fila fila = new Fila();

        Scanner sc = new Scanner(System.in);
        int menu;
        var paciente = new Paciente("Barbara", 1, 'P');
        var paciente2 = new Paciente("Thiago", 5, 'C');
        var paciente3 = new Paciente("Cleiton", 8, 'C');
        var paciente4 = new Paciente("Ana", 2, 'P');

        do{
            System.out.println("\n 1 - Gerar Senha \n 2 - Listar Pacientes \n 3 - Chamar proximo paciente \n 4 - Sair");
            menu = sc.nextInt();

            switch(menu){
                case 1: do{
                    System.out.println("Senha: 1 para Preferencial 2 para Comum");
                    String tipo = sc.next();
                    if(tipo.equals("1") || tipo.equals("2")){
                    }
                }while(true);
                
                case 2: 
                System.out.println(fila);
                break;
                case 3:
                case 4:
                default:
                System.out.println("Opção Invalida");
            }
        }while(true);
    
       

        fila.enfilerar(paciente);
        fila.enfilerar(paciente2);
        fila.enfilerar(paciente3);
        fila.enfilerar(paciente4);

        System.out.println(fila);
        fila.desenfileira();
        System.out.println();
        System.out.println(fila);
        System.out.println(fila.espiar());
    }
}
