package informatica;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidadeItem;
	private double preco;
	private double valorTotal;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getValorFatura(){
		
		valorTotal = this.preco * this.quantidadeItem;
		
		if(preco < 0){
			preco = 0;
		}
		
		if(valorTotal < 0){
			valorTotal = 0.0;
		}
		
		return valorTotal;
	}

}
