package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

// Classe para testar operacoes com o Department
public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	
		System.out.println("======= TEST 1: department findById =======");
		Department department= departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n======= TEST 2: department findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);	
		}
	
		sc.close();
	}
	
}