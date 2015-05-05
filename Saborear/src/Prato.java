
public class Prato {
	private double preco;
	private Restaurante restaurante;
	private SpecPrato spec;
	
	public Prato(double p, Restaurante r, SpecPrato s){
		preco = p;
		restaurante = r;
		spec = s;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public Restaurante getRestaurante(){
		return restaurante;
	}
	
	public SpecPrato getSpec(){
		return spec;
	}
}
