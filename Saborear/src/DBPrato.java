import java.util.LinkedList;
import java.util.List;

public class DBPrato {
	private List<Prato> pratos;
	
	public DBPrato(){
		pratos = new LinkedList<Prato>();
	}
	
	public List<Prato> getPratos(){
		return pratos;
	}
	
	public void addPrato(Prato prato){
		pratos.add(prato);
	}
		
	public void excluirPrato(Prato prato){
		pratos.remove(prato);
	}
	

}
