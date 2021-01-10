package DAOUtils;

import java.util.List;

public interface AbstractDaoLayerController<E> {
    List<E> getAll();

    void deleteAll();

    E getEntityById(int id);

    void update(E entity);

    void delete(E entity);

    void persist(E entity);

    void addAll(List<E> list);
}
