package ir.javacup.db;

import java.util.List;

public abstract class AbstractRepository implements IRepository {

    @Override
    public void save(IEntity entity) {

    }

    @Override
    public void update(IEntity entity) {

    }

    @Override
    public IEntity load(Object id) {
        return null;
    }

    @Override
    public List loadAll() {
        return null;
    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public void deleteAll() {

    }
}
