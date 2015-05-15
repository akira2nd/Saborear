import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class Tests {

	@Test
	public void test() {
		//inicio testes
		
		Restaurante list = new Restaurante();
		
		list.addRestaurante(new Restaurante("String nome", new Login(conta), new List<Prato> pratos))
		
		MusicList list = new MusicList();
		
		
		
		list.addMusic(new Music("Note: Capo in the 3rd -- [G] How many special people...", new Spec("Banda", "Musica")));
		list.addMusic(new Music("Note: Capo in the 2rd -- [Em] Toda is...", new Spec("NomeBanda", "NomeMusica")));
		
		assertEquals(list.getMusics().size(), 2);
		
		Music music = list.searchMusic(new Spec("NomeBanda", "NomeMusica"));
		
		assertEquals(music.getChords(), "Note: Capo in the 2rd -- [Em] Toda is...");
	}

}
