package exherança;

public class FUNCIONARIO {
    
    private String nome;
    private float salario;
    
    public void CALCULABONIFICACAO(){
        salario*=1.1;
    }
    
    public void Imprime(){
        System.out.println(nome);
        
    }
    
    public FUNCIONARIO (String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
