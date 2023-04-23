package application;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) throws SQLException, IOException {
		
		DepartmentDaoJDBC depdao = (DepartmentDaoJDBC) DB.getConnection();
		
		Department department = new Department(null, "CQ");
		//depdao.insert(department);
		
		//department = depdao.findById(3);
		//department.setName("Mkt");
		//depdao.update(department);
		
		depdao.deleteById(8);
		
		List<Department> list = depdao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		
	}
}
