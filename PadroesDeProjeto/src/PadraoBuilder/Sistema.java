package PadraoBuilder;

public class Sistema {

    public static void main(String[] args) {
    	PrepararExameDirector preparo = 
    			new PrepararExameDirector (new ExameColesterol());
    	
    	preparo.construirExame();
    	
        ExameProduct solicitacao = preparo.getSolicitacao();
        
        System.out.println("Exame: "+preparo.toString());
    }
}
