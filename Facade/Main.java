import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
	
	String tipo ;

	System.out.println("Selecione seu combo");
	System.out.println("1. Combo Master \n");
	System.out.println("2. Super Combo \n");
	System.out.println("Sua escolha:  \n ");

	tipo = JOptionPane.showInputDialog("Digite o numero do combo:");
	Combo combo = new Combo();

	switch(tipo){
		case"1":
			combo.ComboMaster();
			break;

		case "2":
			combo.SuperCombo();
			break;
	}



}

}