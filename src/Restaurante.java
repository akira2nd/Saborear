import java.util.List;


public class Restaurante {
	private String nome;
	private Login conta;
	private List<Prato> pratos;
	
	public Restaurante(String n, Login c, List<Prato> p){
		nome = n;
		conta = c;
		pratos = p;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Login getConta(){
		return conta;
	}
	
	public List<Prato> getPratos(){
		return pratos;
	}
}
