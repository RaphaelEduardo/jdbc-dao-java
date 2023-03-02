package application;

import model.entities.Department;

// Padr�o de Projeto DAO (Data Access Object)
public class Program {

	/*
	 * Classes: ClienteDAO (Cliente), ProdutoDAO (Produto), PedidoDAO (Pedido).
	 * 
	 * Para cada entidade haver� um objeto respons�vel por fazer 
	 * o acesso a dados relacionados a esta entidade.
	 * 
	 * Cada DAO � definido por uma interface e a inje��o de depend�ncia 
	 * pode ser feita por meio do Padr�o Factory.
	 */
	public static void main(String[] args) {

		Department d = new Department(1, "books");		
		System.out.println(d);
	}
}