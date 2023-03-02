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

		System.out.println("\n======= TEST 3: department insert =======");
		Department newDepartment = new Department(null, "Bebidas");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n======= TEST 4: department update =======");
		department = departmentDao.findById(13);
		department.setName("Drinks");
		departmentDao.update(department);
		System.out.println("Update completed");

		System.out.println("\n======= TEST 5: department delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}
	
}