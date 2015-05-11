
public class SpecPrato {
	private String nomePrato;
	private String ingredientes;
	
	public SpecPrato(String n, String i){
		nomePrato = n;
		ingredientes = i;
	}
	
	public String getNomePrato(){
		return nomePrato;
	}
	
	public String getIngredientes(){
		return ingredientes;
	}
	
	public boolean matches(SpecPrato spec){
		if(!nomePrato.equals(getNomePrato())) return false;
		if(!ingredientes.equals(getIngredientes())) return false;
		return true;
	}
}
