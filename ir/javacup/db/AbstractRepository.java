package ir.javacup.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<U, T extends IEntity<U>> implements IRepository<U, T> {

    private Map<U, T> map = new HashMap<>();
    private IdGenerator<U> idGenerator;

    @Override
    public void save(T entity) {
        if (entity == null)
            throw new IllegalArgumentException("Object is null");
        U id = idGenerator.generate();
        entity.setId(id);
        map.put(id, entity);
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public T load(U id) {
        return null;
    }

    @Override
    public List<T> loadAll() {
        return null;
    }

    @Override
    public void delete(U id) {

    }

    @Override
    public void deleteAll() {

    }
}
