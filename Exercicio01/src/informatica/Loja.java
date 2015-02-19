package informatica;

public class Loja {
	
	public static void main(String[] args) {
		
		Fatura item01 = new Fatura();
		
		item01.setQuantidadeItem(5);
		item01.setPreco(45);
				
		System.out.printf("O valor da fatura é = %.2f\n", item01.getValorFatura());
		
	}

}
