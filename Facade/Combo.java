public class Combo {
	
	 private Produto produto = new Produto();
	 private Burguer burguer = new Burguer();
	 private Sobremesa sobremesa = new Sobremesa();
	 private Bebida bebida = new Bebida ();
	 
	 public void SuperCombo() {
		 produto.DescricaoSuperCombo(" 3 produtos \t", 12);
		 burguer.HSuperCombo(300);
		 sobremesa.SobremesaSuperCombo("Medio");
		 bebida.BebidaSuperCombo(400);
	 }
	 
	 public void ComboMaster() {
		 produto.DescricaoComboMaster(" 3 produtos \t", 15);
		 burguer.HComboMaster(500);
		 sobremesa.SobremesaComboMaster("Grande");
		 bebida.BebidaComboMaster(600);
	 }
	 

}