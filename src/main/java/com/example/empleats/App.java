package com.example.empleats;
import model.Empleats;
import org.hibernate.Session;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
public class App {
    public static void main(String[] args) {
        Session session1 = HibernateUtil.getSessionFactory().getCurrentSession();
        session1.getTransaction().begin();
        System.out.println("Hola desde Hibernate");
//Damos de alta un nuevo empleado
        Empleats e = new Empleats(2, LocalDate.of(1980, Month.APRIL,3),"Pablo" ,"Martin", 'M',LocalDate.now());
        System.out.println(e);
//Guardamos
        int empno = (int)session1.save(e);
//Obtenemos el empleado guardado
        Empleats e1 = session1.get(Empleats.class, empno);
        System.out.println(e1);
//commit y cierre de sesion
        session1.getTransaction().commit();
        session1.close();
    }
}
