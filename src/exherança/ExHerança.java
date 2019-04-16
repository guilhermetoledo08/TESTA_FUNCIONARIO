package exherança;

public class ExHerança {

    public static void main(String[] args) {
        
        GERENTES g1 = new GERENTES ("Alberto", 8500f, "userAlberto", "Alberto123");
        g1.Imprime();
        
        TELEFONISTAS tel1 = new TELEFONISTAS("Roberta",1000f,4002);
        tel1.Imprime();
        
        SECRETÁRIAS sec1 = new SECRETÁRIAS ("Tunin", 1300f,2828);
        sec1.Imprime();
        
        
    }
}