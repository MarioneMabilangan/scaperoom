package com.example.empleats;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
public class EscapeRoom {
    public static void main(String[] args) {
        int x=codigo1();
        int y=codigo2();
        int z=codigo3();
        int w=codigo4();
        System.out.println("El código descubierto es :" +x+y+z+w);
    }
    public static int codigo1() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        Query query = session.createQuery("Select count(*) from Modulo");
        Long result = (Long) query.uniqueResult();
        return result.intValue();
    }
    public static int codigo2() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("Select count(distinct idModul) from Examen");
        Long result = (Long) query.uniqueResult();
        return result.intValue();
    }
    public static int codigo3() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("Select ceiling(avg(nota)) from Examen where idModul = 1");
        Double result = (Double) query.uniqueResult();
        if (result != null) {
            return result.intValue();
        } else {
            return 0;
        }
    }
    public static int codigo4() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("Select count(apellidos) from Alumno where apellidos like '%z%'");
        Long result = (Long) query.uniqueResult();
        return result.intValue();
    }
}

