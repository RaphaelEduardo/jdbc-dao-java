package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	}
	
}