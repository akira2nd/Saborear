import java.util.List;


public class Restaurante {
	private String nome;
	private Login conta;
	private List<Prato> pratos;
	
	public Restaurante(String nome, Login conta){
		this.nome = nome;
		this.conta = conta;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Login getConta(){
		return conta;
	}
	
	public List<Prato> getPratos(Restaurante restaurante){
		for(Prato prato: pratos){
			if(prato.getRestaurante().getNome().equals(restaurante.getNome())) {
				pratos.add(prato);
			}
		}
		return pratos;
	}
}
