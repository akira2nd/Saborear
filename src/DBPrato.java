import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DBPrato {
	private List<Prato> pratos;
	
	public DBPrato(){
		pratos = new LinkedList<Prato>();
	}
	
	public List<Prato> getPratos(){
		return pratos;
	}
	
	public void addPrato(Prato prato){
		if(verificarExistente(prato) == false) {
			pratos.add(prato);
		}
	}
	
	public boolean verificarExistente(Prato prato){
		for(Prato p:pratos){
			if(p.getSpec().getNomePrato().equals(prato.getSpec().getNomePrato())) return true;
		}
		return false;
	}
		
	public void excluirPrato(String nomePrato, String nomeRestaurante){
		for(Prato prato:pratos){
			if(prato.getRestaurante().getNome().equals(nomeRestaurante)  && prato.getSpec().getNomePrato().equals(nomePrato)) pratos.remove(prato);
		}
	}
}
