package com.nachiket.DemoHib;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	StudentName sn = new StudentName();
    	sn.setfName("Nachiket");
    	sn.setmName("Nitin");
    	sn.setlName("Jagtap");
        student nachi = new student();
//        nachi.setSid(21);
//        nachi.setSname("Tushar");
//        nachi.setsSchool("GCOEARA");
        
        nachi.setSid(49);
        nachi.setsSchool("GCOEARA");
        nachi.setSname(sn);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(nachi);
         //nachi = (student) session.get(student.class, 79);
        tx.commit();
       // System.out.println(nachi);
    }
}
