package springorm;
import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class studentDao {
private HibernateTemplate h;
public studentDao() {
	super();
	// TODO Auto-generated constructor stub
}
public studentDao(HibernateTemplate h) {
	super();
	this.h = h;
}
public HibernateTemplate getH() {
	return h;
}
public void setH(HibernateTemplate h) {
	this.h = h;
}
@Transactional
public String insert(student s)
{
	String n =(String)h.save(s);
	return n;  
}
}
