public class Login {
	private String nomeUsuario;
	private String senha;
	private boolean status = false;
	
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
	
	public boolean getStatus(){
		return status;
	}
	
	public void setStatus(boolean s){
		status = s;
	}
	
	public boolean logar(Login conta){
		if(!nomeUsuario.equals(getNomeUsuario())) return false;
		if(!senha.equals(getSenha())) return false;
		setStatus(true);
		return true;
	}
}
