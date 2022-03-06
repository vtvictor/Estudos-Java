package EstudandoAula2;

public class Carro {
	private final Motor motor;

	public Carro(Motor motor) {
		super();
		this.motor = motor;
	}
	
	Motor motor1 = new Motor();
	Carro carro1 = new Carro(motor1);

	@Override
	public String toString() {
		return "Carro [carro1=" + carro1 + "]";
	} 
	
	
	

}
