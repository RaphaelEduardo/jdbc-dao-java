package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

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

		Department d = new Department(1, "books");		
		System.out.println(d);
		
		Seller s = new Seller(7 ,"Raphael", "raphael@gmail.com", new Date(), 3000.00, d);
		System.out.println(s);
	
	}
	
}