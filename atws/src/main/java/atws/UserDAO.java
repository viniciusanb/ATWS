package atws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserDAO {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("alphatrade");
	private GenericDAO dao;

	public User insertUser(String user, String name, String password, String email, String birthDate,String telephoneNumber, Double rating, String imageURL, Long cityId) throws ParseException {
		EntityManager manager = factory.createEntityManager();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		dao = new GenericDAO(manager);
		City city = dao.selectOne(City.class, cityId);
		User usr = dao.insert(new User(name, user, password, email, date.parse(birthDate), telephoneNumber, rating, imageURL, city));
		return usr;
		
	}
	
	
	
	

	

}
