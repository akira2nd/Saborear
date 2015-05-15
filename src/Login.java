
public class Login {
	private String nomeUsuario;
	private String senha;
	
	public Login(String nomeUsuario, String senha){
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}
	
	public String getNomeUsuario(){
		return nomeUsuario;
	}
	public String getSenha(){
		return senha;
	}
	
	public boolean matches(Login conta){
		if(!nomeUsuario.equals(getNomeUsuario())) return false;
		if(!senha.equals(getSenha())) return false;
		return true;
	}
}
