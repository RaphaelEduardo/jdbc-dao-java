package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	
		System.out.println("======= TEST 1: seller findById =======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n======= TEST 2: seller findByDepartment =======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);	
		}
		
		System.out.println("\n======= TEST 3: seller findAll =======");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);	
		}
	
		System.out.println("\n======= TEST 4: seller insert =======");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	
		System.out.println("\n======= TEST 5: seller update =======");
		seller = sellerDao.findById(6);
		seller.setEmail("alexpink@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n======= TEST 6: seller delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
				
		sc.close();
	}
	
}