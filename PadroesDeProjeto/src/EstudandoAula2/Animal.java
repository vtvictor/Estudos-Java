package EstudandoAula2;

public abstract class Animal {
	protected String getMakeNoise() {
		return makeNoise;
	}


	protected void setMakeNoise(String makeNoise) {
		this.makeNoise = makeNoise;
	}


	protected String makeNoise;
	
	
	protected String makeNoise() {
		return null ;	
	}
	
	
	void makeSound() {
		System.out.println(this.makeNoise());
	}

}
