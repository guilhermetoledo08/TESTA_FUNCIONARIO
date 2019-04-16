package exherança;

public class SECRETÁRIAS extends FUNCIONARIO {
    private int ramal;
    
    public SECRETÁRIAS(String nome, Float salario, int ramal){
        super (nome, salario);
        this.ramal = ramal;
    }
}