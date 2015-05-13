import java.util.List;


public class Usuario {
	private String email;
	private int idade;
	private String sexo;
	private Login conta;
	
	public Usuario(String email, int idade, String sexo, Login conta){
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
		this.conta = conta;
	}
	
	public String getEmail(){
		return email;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	public Login getConta(){
		return conta;
	}
}
