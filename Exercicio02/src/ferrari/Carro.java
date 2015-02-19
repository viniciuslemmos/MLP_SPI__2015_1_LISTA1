package ferrari;

public class Carro {
	
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar(int velocidadeAcrescentada){
		this.velocidadeAtual = this.velocidadeAtual + velocidadeAcrescentada;
		
		if(velocidadeAtual > velocidadeMaxima){
			System.out.println("Atenção, velocidade máxima foi excedida!");
		}
	}
	
	public void ligar(boolean comportamento){
		if(comportamento == true){
			System.out.println("Carro ligado");
		}
		else{
			System.out.println("Carro desligado");
		}		
	}
}
