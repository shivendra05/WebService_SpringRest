package com.nit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.model.Product;
import com.nit.utility.DBConnection;

public class IProductDAOImpl implements IProductDAO {

	@Override
	public Integer saveProduct(Product prod) {
		Session sess=  DBConnection.getSession().openSession();
		Transaction tx=null;
		Integer id=null;
		try {
			tx = sess.beginTransaction();
			id = (Integer) sess.save(prod);
			System.out.println("DAO "+id);
			tx.commit();
			sess.close();
		}catch (Exception e) {
			if(tx==null) {
				tx.rollback();
			}
		}
		return id;
	}

	@Override
	public void updateProduct(Product prod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProductByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
