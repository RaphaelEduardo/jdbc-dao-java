package model.dao;

import model.dao.impl.SellerDaoJDBC;

/*
 * Operações estaticas para instanciar as implementações DAO.
 * Dessa forma o cliente não conhece a implementação, apenas a interface.
 */
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
