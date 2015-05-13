import java.util.List;


public class Restaurante {
	private String nome;
	private Login conta;
	private List<Prato> pratos;
	
	public Restaurante(String nome, Login conta, List<Prato> pratos){
		this.nome = nome;
		this.conta = conta;
		this.pratos = pratos;
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
