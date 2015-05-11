import java.util.LinkedList;
import java.util.List;

public class DBUsuarios {
	private List<Usuario> usuarios;
	
	public DBUsuarios(){
		usuarios = new LinkedList<Usuario>();
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public void addUsuario(Usuario usuario){
		usuarios.add(usuario);
	}
		
	public void excluirConta(String nomeUsuario){
		for(Usuario user:usuarios){
			if(user.getConta().getNomeUsuario().equals(nomeUsuario)) usuarios.remove(user);
		}
	}
}

