import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class Teste_Denis {

	@Test
	public void test() {
		//inicio testes
		//Prato(double preco, Restaurante restaurante, SpecPrato spec)
		//Restaurante(String nome, Login conta, List<Prato> pratos)
		//SpecPrato(String nomePrato, String ingredientes)
		//Usuario(String email, int idade, String sexo, Login conta)
		//Login(String nomeUsuario, String senha)
		
		/*------------------------------------------ Teste 01 ------------------------------------------
		- Adicionar usuário √
		- Verificar se já existe √
		- Confirmar se foi adicionado √
		------------------------------------------ Teste 02 ------------------------------------------
		- Adicionar Restaurante √
		- Verificar se já existe √
		- Confirmar se foi adicionado √
		------------------------------------------ Teste 03 ------------------------------------------
		- Adicionar prato (Prato, Restaurante) √
		- Verificar se o prato existe nesse restaurante √
		- Confirmar se foi adicionado √
		------------------------------------------ Teste 04 ------------------------------------------
		- Excluir prato (Prato, Restaurante)
		- Verificar se o restaurante está logado
		- Verificar se o prato existe nesse restaurante
		- Confirmar se foi exluído
		------------------------------------------ Teste 05 ------------------------------------------
		- Buscar prato (nome prato)
		- Buscar prato (ingrediente)
		---------------------------------------------------------------------------------------------*/
		
		
		
		//------------------------------------------ Teste 01 ------------------------------------------
		DBUsuarios listUsu = new DBUsuarios();
		listUsu.addUsuario(new Usuario("user1@site.com", 25, "m", new Login("user1", "12345")));
		listUsu.addUsuario(new Usuario("user2@site.com", 20, "f", new Login("user2", "12345")));
		listUsu.addUsuario(new Usuario("user3@site.com", 30, "m", new Login("user3", "12345")));
		
		assertEquals(listUsu.getUsuarios().size(), 3);
		
		//------------------------------------------ Teste 02 ------------------------------------------
		DBRestaurante listRest = new DBRestaurante();
		listRest.addRestaurante(new Restaurante("Restaurante A", new Login("restA", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante B", new Login("restB", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante C", new Login("restC", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante D", new Login("restD", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante E", new Login("restE", "12345")));
		
		assertEquals(listRest.getRestaurantes().size(), 5);
		
		//------------------------------------------ Teste 03 ------------------------------------------
		DBPrato listPrato = new DBPrato();
		listPrato.addPrato(new Prato(49.90, new Restaurante("Restaurante A", new Login("restA", "12345")), new SpecPrato("Prato 1", "Arroz, feijão")));
		listPrato.addPrato(new Prato(49.90, new Restaurante("Restaurante A", new Login("restA", "12345")), new SpecPrato("Prato 2", "Arroz, feijão")));
		listPrato.addPrato(new Prato(49.90, new Restaurante("Restaurante A", new Login("restA", "12345")), new SpecPrato("Prato 3", "Arroz, feijão")));

		assertEquals(listPrato.getPratos().size(), 3);
	}

}
