package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao{

	private Connection connection;
	
	//forca a injecao de dependencia
	public SellerDaoJDBC(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?");
			
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			
			//testar se veio algum resultado (true).
			if (resultSet.next()) {
				// instancia um departamento e seta os valores dele.
				Department department = new Department();
				department.setId(resultSet.getInt("DepartmentId"));
				department.setName(resultSet.getString("DepName"));
				
				//cria um objeto Seller apontando pro Department
				Seller seller = new Seller();
				seller.setId(resultSet.getInt("Id"));
				seller.setName(resultSet.getString("Name"));
				seller.setEmail(resultSet.getString("Email"));
				seller.setBaseSalary(resultSet.getDouble("BaseSalary"));
				seller.setBirthDate(resultSet.getDate("BirthDate"));
				// n�o � o Id do Department, e sim o objeto inteiro.
				seller.setDepartment(department);
				return seller;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			/*
			 * Nao precisa fechar a conexao, porque o mesmo objeto Dao
			 * pode servir para fazer varias operacoes.
			 * Fecha no programa depois...
			 */
			DB.closeStatement(preparedStatement);
			DB.closeResultSet(resultSet);
		}
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
