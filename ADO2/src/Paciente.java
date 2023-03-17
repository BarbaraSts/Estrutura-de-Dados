public class Paciente{

    private String nome;
    private int senha;
    private char tipo;

    public Paciente(String nome, int senha, char tipo) {
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {

        String texto = "Paciente: " + nome + ", Tipo: " + tipo + ", Senha: " + senha; 
        return texto;
    }
    
}