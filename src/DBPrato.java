import java.util.concurrent.ConcurrentLinkedQueue;
//teste
public class DBPrato {
	private ConcurrentLinkedQueue<Prato> pratos = new ConcurrentLinkedQueue<Prato>();
		
	public ConcurrentLinkedQueue<Prato> getPratos(){
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
