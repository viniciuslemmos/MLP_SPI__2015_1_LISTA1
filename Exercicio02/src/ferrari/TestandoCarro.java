package ferrari;

public class TestandoCarro {
	
	public static void main(String[] args) {
		
		Carro teste01 = new Carro();
		teste01.ligar(true);
		teste01.setModelo("Ferrari 450");
		teste01.setCor("Amarela");
		teste01.setVelocidadeAtual(0);
		teste01.setVelocidadeMaxima(320);
		
		teste01.acelerar(200);
		
		System.out.println("Modelo: " + teste01.getModelo());
		System.out.println("Cor: " + teste01.getCor());
		System.out.printf("Velocidade Atual: %d%n", teste01.getVelocidadeAtual());
		System.out.printf("Velocidade Máxima: %d%n", teste01.getVelocidadeMaxima());
		
		teste01.acelerar(150);
		
		System.out.printf("Velocidade Atual: %d%n", teste01.getVelocidadeAtual());
		System.out.printf("Velocidade Máxima: %d%n", teste01.getVelocidadeMaxima());
		
		teste01.acelerar(-50);
		
		System.out.printf("Velocidade Atual: %d%n", teste01.getVelocidadeAtual());
		System.out.printf("Velocidade Máxima: %d%n", teste01.getVelocidadeMaxima());
	}

}
