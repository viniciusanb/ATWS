package atws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Program {

	private static EntityManagerFactory factory;

	public static void main(String[] args) throws ParseException {
		Logger.getRootLogger().setLevel(Level.OFF);
		factory = Persistence.createEntityManagerFactory("alphatrade");
		EntityManager manager = factory.createEntityManager();
		GenericDAO dao = new GenericDAO(manager);

//		 List<Country> countries = dao.selectAllRows(Country.class,
//		 "Country");
//		 for (Country country : countries) {
//		 System.out.println("NOME = " + country.getName());
//		 }

//		 Country country = dao.selectOne(Country.class, 1L);
//		 System.out.println(country.getName());

		// Date date = new Date();
		// SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

		

		
		
		factory.close();

	}
	
	
}