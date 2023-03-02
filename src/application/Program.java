package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);	
		}
		
		System.out.println("\n==== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);	
		}
		
		
	}
	
}