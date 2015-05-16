import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class Teste_Denis {

	@Test
	public void test() {
		//inicio testes
		//Prato(double preco, SpecPrato spec)
		//Restaurante(String nome, Login conta, List<Prato> pratos)
		//SpecPrato(String nomePrato, String ingredientes)
		//Usuario(String email, int idade, String sexo, Login conta)
		//Login(String nomeUsuario, String senha)
		
		/*------------------------------------------ Teste 01 ------------------------------------------
		- Adicionar usuário
		- Verificar se já existe (email deve ser único)
		- Confirmar se foi adicionado
		------------------------------------------ Teste 02 ------------------------------------------
		- Adicionar Restaurante √
		- Verificar se já existe √
		- Confirmar se foi adicionado √
		------------------------------------------ Teste 03 ------------------------------------------
		- Adicionar prato (Prato, Restaurante)
		- Verificar se o restaurante está logado
		- Verificar se o prato existe nesse restaurante
		- Confirmar se foi adicionado
		------------------------------------------ Teste 04 ------------------------------------------
		- Excluir prato (Prato, Restaurante)
		- Verificar se o restaurante está logado
		- Verificar se o prato existe nesse restaurante
		- Confirmar se foi exluído
		---------------------------------------------------------------------------------------------*/
		
		
		DBRestaurante list = new DBRestaurante();
		list.addRestaurante(new Restaurante("Restaurante A", new Login("restA", "12345")));
		list.addRestaurante(new Restaurante("Restaurante B", new Login("restB", "12345")));
		list.addRestaurante(new Restaurante("Restaurante C", new Login("restC", "12345")));
		list.addRestaurante(new Restaurante("Restaurante D", new Login("restD", "12345")));
		//list.addRestaurante(new Restaurante("Restaurante E", new Login("restE", "12345")));
		
		assertEquals(list.getRestaurantes().size(), 5);
		
		
		
		
	}

}
