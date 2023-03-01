public class Vetor{
    protected String nomePaciente;
    private double[] dadosIMC = new double [4];
    private int tamanho = 0;
    private double mediaNota;
    private double pesoImc, alturaIMC;
    private double resultadoIMC;
    

    public Vetor(String nomePaciente) {
        this.nomePaciente = nomePaciente;

    }

    
    public String getNome(){

        return nomePaciente;
    }

    public void adiciona(double dadosIMC) throws Exception{

        if (this.tamanho < this.dadosIMC.length){
            this.dadosIMC[this.tamanho] = dadosIMC;
            this.tamanho++;
        } else {
            throw new Exception("Todos os dados foram preenchidos!");
        }  
      }

      public double calculoImc(){

        resultadoIMC = 0;

        resultadoIMC = dadosIMC[0] / ((dadosIMC[1] * dadosIMC[1]));

       

        return resultadoIMC;
    }

    public void imc(){

        if (resultadoIMC < 18.5 )
        {
        System.out.printf("\nVocê está abaixo do peso!");
        return;
        }

        if (resultadoIMC >= 18.5 && resultadoIMC <= 24.9)
        {
            System.out.printf("\nVocê está no peso ideal!");
            return;
        }

        if (resultadoIMC >=  25.0 && resultadoIMC <= 29.9)
         {
            System.out.printf("\nVocê está acima do peso!");
            return;
        }
        if (resultadoIMC >=  30.0 && resultadoIMC <= 39.9)
         {
            System.out.printf("\nVocê está na obesidade!");
            return;
        }
        if (resultadoIMC >= 40.0)
        {
            System.out.printf("\nVocê está na obesidade grave!");
            return;
        }


    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.dadosIMC[i]);
            s.append(", ");
        }
        
        if(this.tamanho> 0){
            s.append(this.dadosIMC[this.tamanho-1]);
        }
        
        s.append("]");
                
        return s.toString();
    }

}