package Application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
			
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: Seller findById ===");
		Seller seller = sellerDao.findById(5);
		
		System.out.println(seller);
		
		
		System.out.println("\n=== TESTE 2: Seller findById ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
//		System.out.println((list == null) ? "Lista nula" : "Oi, to aqui.");
		
		for (Seller obj : list) {
			System.out.println(obj);			
		}
	}
}
