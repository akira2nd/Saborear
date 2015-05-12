import java.util.List;


public class Usuario {
	private String email;
	private int idade;
	private String sexo;
	private Login conta;
	
	public Usuario(String e, int i, String s, Login c){
		email = e;
		idade = i;
		sexo = s;
		conta = c;
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
