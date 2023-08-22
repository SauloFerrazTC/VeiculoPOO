package codigo;

public class Carro extends Veiculo {


	   private void confereCombustivel() {
	      System.out.println("Conferindo combustivel");
	   }

	   private void conferindoCambio() {
	      System.out.println("Cabio no P tá ok");
	   }

	public void ligar() {
		conferindoCambio();
	      confereCombustivel();
	      System.out.println("Carro ligado");
		
	}

	}
