package hybernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hqlselect {

public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("reservation.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	
	Query qry=session.createQuery("from Reservation r");
	List<Reservation> l=qry.list();
	System.out.println("total no of records:" +l);
	Iterator<Reservation> it=l.iterator();
	/*while(it.hasNext())
	{
		Object o=(Object)it.next();
		Reservation reservation=(Reservation)o;
		//System.out.println(reservation[0]+" "+reservation[1]);
		System.out.println("id:" +reservation.getName());
		System.out.println("name:"+reservation.getReservationid());
		System.out.println("type:"+reservation.getType());
		
	}*/
	try
	{
		while(it.hasNext())
		{
			Object O=(Object)it.next();
			Reservation[] reservation=(Reservation[])O;
			System.out.println(reservation[0]+""+reservation[1]);
			
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	session.close();
	
	
	
}
}
