import static org.junit.Assert.*;

import org.junit.Test;


public class Testes {

	@Test
	public void test() {
		//-------------------------------------- Início dos testes -------------------------------------

		//------------------------------------------ Teste 01 ------------------------------------------
		//Adicionar usuários
		DBUsuarios listUsu = new DBUsuarios();
		listUsu.addUsuario(new Usuario("user1@site.com", 25, "m", new Login("user1", "12345")));
		listUsu.addUsuario(new Usuario("user2@site.com", 20, "f", new Login("user2", "12345")));
		listUsu.addUsuario(new Usuario("user3@site.com", 30, "m", new Login("user3", "12345")));
		assertEquals(listUsu.getUsuarios().size(), 3);
		
		//Adicionar usuário REPETIDO (não deve adicionar e a lista continua com 3 usuários)
		listUsu.addUsuario(new Usuario("user3@site.com", 30, "m", new Login("user3", "12345")));
		assertEquals(listUsu.getUsuarios().size(), 3);
		
		
		//------------------------------------------ Teste 02 ------------------------------------------
		//Adicionar restaurantes
		DBRestaurante listRest = new DBRestaurante();
		listRest.addRestaurante(new Restaurante("Restaurante A", new Login("restA", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante B", new Login("restB", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante C", new Login("restC", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante D", new Login("restD", "12345")));
		listRest.addRestaurante(new Restaurante("Restaurante E", new Login("restE", "12345")));	
		assertEquals(listRest.getRestaurantes().size(), 5);
	
		//Adicionar restaurante REPETIDO (não deve adicionar e a lista continua com 5 restaurantes)
		listRest.addRestaurante(new Restaurante("Restaurante E", new Login("restA", "12345")));
		assertEquals(listRest.getRestaurantes().size(), 5);
		
		
		//------------------------------------------ Teste 03 ------------------------------------------
		//Adicionar prato
		DBPrato listPrato = new DBPrato();
		listPrato.addPrato(new Prato(49.90, listRest.getRestaurante("Restaurante A"), new SpecPrato("Prato 1", "Arroz, feijão")));
		listPrato.addPrato(new Prato(49.90, listRest.getRestaurante("Restaurante A"), new SpecPrato("Prato 2", "Arroz, feijão")));
		listPrato.addPrato(new Prato(49.90, listRest.getRestaurante("Restaurante A"), new SpecPrato("Prato 3", "Arroz, feijão")));
		listPrato.addPrato(new Prato(49.90, listRest.getRestaurante("Restaurante B"), new SpecPrato("Prato 1", "Carne, feijão")));
		assertEquals(listPrato.getPratos().size(), 4);
		
		//Adicionar prato JÁ existente (não deve adicionar e a lista continua com 4 pratos)
		listPrato.addPrato(new Prato(49.90, listRest.getRestaurante("Restaurante A"), new SpecPrato("Prato 3", "Arroz, feijão")));
		assertEquals(listPrato.getPratos().size(), 4);
		
		
		//------------------------------------------ Teste 04 ------------------------------------------
		//Remover prato existente (um prato será removido e a lista terá 3 pratos)
		listPrato.excluirPrato("Prato 2", "Restaurante A");		
		assertEquals(listPrato.getPratos().size(), 3);
		
		//Remover prato NÃO existente (nenhum prato será removido e a lista continua com 3 pratos)
		listPrato.excluirPrato("Prato 2", "Restaurante B");
		assertEquals(listPrato.getPratos().size(), 3);
		
		
		//------------------------------------------ Teste 05 ------------------------------------------
		//Buscar prato por NOME	(deve retornar 2, pois 2 pratos com esse nome foram adicionados)
		assertEquals(listPrato.buscarPrato("Prato 1").isEmpty(), false);
		assertEquals(listPrato.buscarPrato("Prato 1").size(), 2);
		
		//Buscar prato por INGREDIENTE (deve retornar 2, pois 3 pratos foram adicionados com esse ingrediente, mas 1 foi removido)
		assertEquals(listPrato.buscarPrato("Arroz").isEmpty(), false);
		assertEquals(listPrato.buscarPrato("Arroz").size(), 2);
		
		
		//------------------------------------------ Teste 06 ------------------------------------------
		//Verificar status SEM logar restaurante (deve retornar false)
		Restaurante restB = listRest.getRestaurante("Restaurante B");
		boolean statusRest = restB.getConta().getStatus();
		assertEquals(statusRest, false);
		
		//Verificar status APÓS logar restaurante (deve retornar true)
		boolean novoStatusRest = restB.getConta().logar(new Login(restB.getConta().getNomeUsuario(), restB.getConta().getSenha()));
		assertEquals(novoStatusRest, true);
		
		//Verificar status SEM logar usuário (deve retornar false)
		Usuario userA = listUsu.getUsuario("user1@site.com");
		boolean statusUser = userA.getConta().getStatus();
		assertEquals(statusUser, false);
		
		//Verificar status APÓS logar restaurante (deve retornar true)
		boolean novoStatusUser = userA.getConta().logar(new Login(userA.getConta().getNomeUsuario(), userA.getConta().getSenha()));
		assertEquals(novoStatusUser, true);
	}
	
	/*--------------------------- Estrutura de parâmetros dos métodos ----------------------------
	
		- Prato(double preco, Restaurante restaurante, SpecPrato spec)
		- Restaurante(String nome, Login conta, List<Prato> pratos)
		- SpecPrato(String nomePrato, String ingredientes)
		- Usuario(String email, int idade, String sexo, Login conta)
		- Login(String nomeUsuario, String senha)*/
	
	
	/*------------------------------- Testes que devem ser feitos --------------------------------
		
		------------------------------------------ Teste 01 ------------------------------------------
	ok		- Adicionar usuário
	ok		- Verificar se já existe
	ok		- Confirmar se foi adicionado
		------------------------------------------ Teste 02 ------------------------------------------
	ok		- Adicionar Restaurante
	ok		- Verificar se já existe
	ok		- Confirmar se foi adicionado
		------------------------------------------ Teste 03 ------------------------------------------
	ok		- Adicionar prato (Prato, Restaurante)
	ok		- Verificar se o prato existe nesse restaurante
	ok		- Confirmar se foi adicionado
		------------------------------------------ Teste 04 ------------------------------------------
	ok		- Excluir prato (Prato, Restaurante)
	ok		- Verificar se o prato existe nesse restaurante
	ok		- Confirmar se foi exluído
		------------------------------------------ Teste 05 ------------------------------------------
	ok		- Buscar prato (nome prato)
	ok		- Buscar prato (ingrediente)
		------------------------------------------ Teste 06 ------------------------------------------
	ok		- Logar restaurante
	ok		- Verificar se restaurante está logado
	ok		- Logar usuário
	ok		- Verificar se usuário está logado
		---------------------------------------------------------------------------------------------*/

}
