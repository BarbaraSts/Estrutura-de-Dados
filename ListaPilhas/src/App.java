import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
        
        Pilha<Integer> pilha = new Pilha<Integer>();

        for(int i=1; i<=10;i++){
            pilha.empilha(i);
        }
        System.out.println(pilha);
        System.out.println("Tamanho da Pilha: " + pilha.tamanho());

        System.out.println(pilha);
        System.out.println(pilha.estaVazia());
        pilha.empilha(1);
        System.out.println(pilha);
        System.out.println(pilha.estaVazia());

        System.out.println(pilha.topo());

        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha.topo());

        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);

        System.out.println("Desempilhar elemento " + pilha.desempilha());

        System.out.println(pilha);

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size());

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
