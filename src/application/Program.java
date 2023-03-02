package application;

import java.sql.Connection;
import java.sql.Statement;

// Padrão de Projeto DAO (Data Access Object)
public class Program {

	/*
	 * Classes: ClienteDAO (Cliente), ProdutoDAO (Produto), PedidoDAO (Pedido).
	 * 
	 * Para cada entidade haverá um objeto responsável por fazer 
	 * o acesso a dados relacionados a esta entidade.
	 * 
	 * Cada DAO é definido por uma interface e a injeção de dependência 
	 * pode ser feita por meio do Padrão Factory.
	 */
	public static void main(String[] args) {

		Connection ct = null;
		Statement st = null;
		
		 
			
	}
}