import java.util.concurrent.ConcurrentLinkedQueue;

public class DBRestaurante {
        
    private ConcurrentLinkedQueue<Restaurante> restaurantes = new ConcurrentLinkedQueue<Restaurante>();
        	
	public ConcurrentLinkedQueue<Restaurante> getRestaurantes(){
		return restaurantes;
	}
	
	public void addRestaurante(Restaurante restaurante){
		if(verificarExistente(restaurante) == false){
			restaurantes.add(restaurante);
		}
	}
	
	public boolean verificarExistente(Restaurante restaurante){
		for(Restaurante r:restaurantes){
			if(r.getConta().getNomeUsuario().equals(restaurante.getConta().getNomeUsuario())) return true;
		}
		return false;
	}
	
	public Restaurante getRestaurante(String nomeRestaurante){
		for(Restaurante r:restaurantes){
			if(r.getNome().equals(nomeRestaurante)) return r;
		}
		return null;
	}
}
