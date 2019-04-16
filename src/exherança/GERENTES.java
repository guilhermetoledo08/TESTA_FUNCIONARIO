package exherança;

public class GERENTES extends FUNCIONARIO {
    private String user;
    private String senha;
    
    public GERENTES(String nome, Float salario, String user, String senha){
        super (nome, salario);
        this.user = user;
        this.senha = senha;
    }
}