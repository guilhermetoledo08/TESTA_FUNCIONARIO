package exherança;

public class TELEFONISTAS extends FUNCIONARIO {
    private int id;
    
    public TELEFONISTAS(String nome, Float salario, int id){
        super (nome, salario);
        this.id = id;
    }
}