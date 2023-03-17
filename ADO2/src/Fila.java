public class Fila extends EstruturaEstatica<Paciente> {
    public Fila() {
        super();
    }

    public Fila(int capaciade) {
        super(capaciade);
    }

    public Boolean enfilerar(Paciente paciente) {

        char tipo = paciente.getTipo();
        int posicao = 0;
        if (tipo == 'P') {
            adiciona(posicao, paciente);
            posicao++;
            return true;
        }
        return super.adiciona(paciente);
    }

    public Paciente espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return elementos[0];
    }

    public Paciente desenfileira() {
        if (this.estaVazia()) {
            return null;
        }
        final int POS = 0;
        this.remove(POS);
        return null;
    }

}