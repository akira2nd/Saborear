import java.util.List;


public class Usuario {
	private String email;
	private int idade;
	private String sexo;
	private Login conta;
	private List<Prato> favoritos;
	
	public Usuario(String e, int i, String s, Login c, List<Prato> f){
		email = e;
		idade = i;
		sexo = s;
		conta = c;
		favoritos = f;
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
	
	public List<Prato> getFavoritos(){
		return favoritos;
	}

}
