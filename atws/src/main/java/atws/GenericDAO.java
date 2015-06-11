package atws;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GenericDAO {

	private EntityManager manager;
	private EntityTransaction tx;

	public GenericDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	
	
	public <T> T insert(T entity) {
		try {
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			System.out.println("O " + entity.toString() + " foi inserido");
			return entity;
			
		}catch (Exception e) {
			tx.rollback();
			return null;
		}
	}

	public <T> T delete(T entity) {
		tx = manager.getTransaction();
		try {
			tx.begin();
			manager.remove(entity);
			tx.commit();
			System.out.println("O " + entity.toString() + " foi excluído.");
			manager.close();

			return entity;

		} catch (Exception e) {
			tx.rollback();
			return null;
		}

	}

	public <T> List<T> selectAllRows(Class<T> clazz, String tablename) {
		String sql = "SELECT x FROM " + tablename + " x";
		tx = manager.getTransaction();
		try {
			tx.begin();
			@SuppressWarnings("unchecked")
			List<T> list = manager.createQuery(sql).getResultList();
			tx.commit();
			manager.close();
			return list;

		} catch (Exception e) {
			tx.rollback();
			return null;
		}
	}

	public <T> T selectOne(Class<T> clazz, Long id) {
		try {
			manager.getTransaction().begin();
			T selected = (T) manager.find(clazz, id);
			manager.getTransaction().commit();
			return (T) selected;
		} catch (Exception e) {
			manager.getTransaction().rollback();
			return null;
		}
	}

	public <T> T updateUser(Class<T> clazz, String name, Long id) {
		String sql = "UPDATE User SET name = " + "'" + name + "'"
				+ " WHERE id = " + id;
		tx = manager.getTransaction();
		try {
			tx.begin();
			manager.createQuery(sql).executeUpdate();
			tx.commit();
			return (T) name;

		} catch (Exception e) {
			tx.rollback();
			return null;
		}

	}
	
	
	
	

	// }

	/**
	 * select * from user select x from user x
	 * */

}
