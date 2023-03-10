public class Fila <T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }

    public Fila(int capaciade){
        super(capaciade);
    }

    public void enfilerar (T elemento){
        this.adicionar(elemento);
    }

    public T espiar(){
        if (this.estaVazia()){
            return null;
        }
        return elementos[0];
    }
    public T desenfileira(){
        if (this.estaVazia()){
            return null;
        }
        final int POS =0;
        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }


}