import java.util.LinkedList;
import java.util.List;

public class DBRestaurante {
        
        private List<Restaurante> restaurantes;
        
	public DBRestaurante(){
		restaurantes = new LinkedList<Restaurante>();
	}
	
	public List<Restaurante> getRestaurantes(){
		return restaurantes;
	}
	
	public void addRestaurante(Restaurante restaurante){
		restaurantes.add(restaurante);
	}
}
