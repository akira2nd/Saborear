import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Test;


public class Tests {

	@Test
	public void test() {
		//inicio testes
		//Prato(double preco, SpecPrato spec)	
		//Restaurante(String nome, Login conta, List<Prato> pratos)
		//SpecPrato(String nomePrato, String ingredientes)
		//Usuario(String email, int idade, String sexo, Login conta)
		
		
		DBRestaurante restaurante = new DBRestaurante();
		
		restaurante.addRestaurante(new Restaurante("String nome", new Login("String nomeUsuario", "String senha"), new list<Prato> ("3.5", new SpecPrato("batata", "batata"))));
		

		MusicList list = new MusicList();
		
		list.addMusic(new Music("Note: Capo in the 3rd -- [G] How many special people...", new Spec("Banda", "Musica")));
		list.addMusic(new Music("Note: Capo in the 2rd -- [Em] Toda is...", new Spec("NomeBanda", "NomeMusica")));
		
		assertEquals(list.getMusics().size(), 2);
		Music music = list.searchMusic(new Spec("NomeBanda", "NomeMusica"));
		assertEquals(music.getChords(), "Note: Capo in the 2rd -- [Em] Toda is...");
	}
}