
public class Login {
	private String nomeUsuario;
	private String senha;
	
	public Login(String n, String s){
		nomeUsuario = n;
		senha = s;
	}
	
	public String getNomeUsuario(){
		return nomeUsuario;
	}
	public String getSenha(){
		return senha;
	}
	
	public boolean matches(Login conta){
		if(!nomeUsuario.equals(getNomeUsuario())) return false;
		if(senha.equals(getSenha())) return false;
		return true;
	}
}
