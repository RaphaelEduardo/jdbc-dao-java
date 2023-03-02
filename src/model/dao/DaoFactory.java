package model.dao;

import model.dao.impl.SellerDaoJDBC;

/*
 * Opera��es estaticas para instanciar as implementa��es DAO.
 * Dessa forma o cliente n�o conhece a implementa��o, apenas a interface.
 */
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}