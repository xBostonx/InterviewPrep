package DAOUtils;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements AbstractDaoLayerController<Student> {
    private SessionFactory sessionFactory;

    public StudentDao() {
        sessionFactory = SessionFactoryUtil.getSessionFactory();
    }

    @Override
    public List<Student> getAll() {
        return (ArrayList<Student>) (sessionFactory.openSession().createQuery("from Student").list());
    }

    @Override
    public void deleteAll() {
        List<Student> students = getAll();
        students.forEach(this::delete);
    }

    public Student getEntityById(int id) {
        return sessionFactory.openSession().get(Student.class, id);
    }

    public void update(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();
    }

    public void delete(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        session.close();
    }

    public void persist(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
    }

    @Override
    public void addAll(List<Student> list) {
        list.forEach(this::persist);
    }
}
