import java.util.List;


public class Restaurante {
	private String nome;
	private ContaRestaurante conta;
	private List<Prato> pratos;
	
	public Restaurante(String n, ContaRestaurante c, List<Prato> p){
		nome = n;
		conta = c;
		pratos = p;
	}
	
	public String getNome(){
		return nome;
	}
	
	public ContaRestaurante getConta(){
		return conta;
	}
	
	public List<Prato> getPratos(){
		return pratos;
	}
}
