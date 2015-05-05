import java.util.LinkedList;
import java.util.List;

public class DBUsuarios {
	private List<Usuario> usuarios;
	
	public DBUsuarios(){
		usuarios = new LinkedList<Usuario>();
	}
	
	public void addUsuario(Usuario usuario){
		usuarios.add(usuario);
	}
		
	public void excluirConta(ContaUsuario conta){
		usuarios.remove(conta);
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
}
