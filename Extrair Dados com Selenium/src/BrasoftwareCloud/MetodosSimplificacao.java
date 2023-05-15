package BrasoftwareCloud;

public class MetodosSimplificacao {
	
	
	public static void waitFor(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}


}
