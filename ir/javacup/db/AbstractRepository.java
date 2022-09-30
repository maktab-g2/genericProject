package ir.javacup.db;

import java.util.ArrayList;
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
        if (entity.getId() == null)
            throw new RuntimeException("Id can't be null");
        T flag = map.get(entity.getId());
        if (flag == null)
            throw new IllegalArgumentException("Object is null");
        map.put(entity.getId(), entity);
    }

    @Override
    public T load(U id) {
        return map.get(id);
    }

    @Override
    public List<T> loadAll() {
        List<T> list = new ArrayList<>();
        for (Map.Entry<U, T> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    @Override
    public void delete(U id) {
        T result = map.remove(id);
        if (result == null)
            throw new RuntimeException("value doesn't exist");
    }

    @Override
    public void deleteAll() {

    }
}
