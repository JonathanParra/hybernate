package hybernate;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hqlupdate {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("reservation.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
	/*Query qry=session.createQuery("update Reservation res set res.name='rani' where res.reservationid=101");
	Transaction transaction=session.beginTransaction();
	int k=qry.executeUpdate();
	transaction.commit();
	System.out.println(k+"rows updated");*/
		
		Object o=session.get(Reservation.class,101);
		Reservation r=(Reservation)o;
		Transaction transaction=session.beginTransaction();
		r.setName("chaitanya");
		transaction.commit();
	session.close();
	}
}
