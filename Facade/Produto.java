public class Produto {
	
	private String descricao;
	private double preco;
	
	
    public void DescricaoComboMaster(String descricao, int preco) {
    	System.out.println("1. Combo Master \nEsse combo contem " + descricao + "\nPreco: " + preco);
	}
    
    public void DescricaoSuperCombo(String descricao, double preco) {
		System.out.println("2. Super Combo \nEsse combo contem " + descricao + "\nPreco: " + preco);

		
	}

}