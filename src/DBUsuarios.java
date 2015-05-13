import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DBUsuarios {
	private List<Usuario> usuarios;
	
	public DBUsuarios(){
		ConcurrentLinkedQueue<Usuario> usuarios = new ConcurrentLinkedQueue<Usuario>(); //não sei se é assim esse concurrentlinkedqueue
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public void addUsuario(Usuario usuario){
		if(verificarExistente(usuario) == false){
			usuarios.add(usuario);
		}
	}

	public boolean verificarExistente(Usuario usuario){
		for(Usuario u:usuarios){
			if(u.getConta().getNomeUsuario().equals(usuario.getConta().getNomeUsuario())) return true;
		}
		return false;
	}
	
	public void excluirConta(String nomeUsuario){
		for(Usuario user:usuarios){
			if(user.getConta().getNomeUsuario().equals(nomeUsuario)) usuarios.remove(user);
		}
	}
}

