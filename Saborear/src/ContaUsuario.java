
public class ContaUsuario {
	private String nomeUsuario;
	private String senha;
	
	public ContaUsuario(String n, String s){
		nomeUsuario = n;
		senha = s;
	}
	
	public String getNomeUsuario(){
		return nomeUsuario;
	}
	public String getSenha(){
		return senha;
	}
	
	public boolean matches(ContaUsuario conta){
		if(!nomeUsuario.equals(getNomeUsuario())) return false;
		if(senha.equals(getSenha())) return false;
		return true;
	}
}
