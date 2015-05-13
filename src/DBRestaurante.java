import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DBRestaurante {
        
    private List<Restaurante> restaurantes;
        
	public DBRestaurante(){
		restaurantes = new LinkedList<Restaurante>();
	}
	
	public List<Restaurante> getRestaurantes(){
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
}
