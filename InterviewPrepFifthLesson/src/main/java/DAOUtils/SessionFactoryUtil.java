package DAOUtils;

import entities.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
    private static SessionFactory sessionFactory;

    public SessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration config = new Configuration().configure();
            config.addAnnotatedClass(Student.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties());
            sessionFactory = config.buildSessionFactory(builder.build());
        }
        return sessionFactory;
    }
}
