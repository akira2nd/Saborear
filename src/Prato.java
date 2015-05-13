
public class Prato {
	private double preco;
	private Restaurante restaurante;
	private SpecPrato spec;
	
	public Prato(double preco, Restaurante restaurante, SpecPrato spec){
		this.preco = preco;
		this.restaurante = restaurante;
		this.spec = spec;
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
