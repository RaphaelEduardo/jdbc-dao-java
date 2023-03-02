package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

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
		
		Seller s = new Seller(7 ,"Raphael", "raphael@gmail.com", new Date(), 3000.00, d);
		System.out.println(s);
	
	}
	
}