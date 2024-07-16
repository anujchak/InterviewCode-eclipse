package controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class userDao {
@Autowired
private HibernateTemplate h;
@Transactional
public int insert(users u)
{
	Integer n =(Integer)this.h.save(u);
	return n;  
}
@Override
	public String toString() {
		return "userDao [h=" + h + "]";
	}

public userDao() {
		super();
		// TODO Auto-generated constructor stub
	}

public userDao(HibernateTemplate h) {
		super();
		this.h = h;
	}



public HibernateTemplate getH() {
	return h;
}

public void setH(HibernateTemplate h) {
	this.h = h;
}
}
