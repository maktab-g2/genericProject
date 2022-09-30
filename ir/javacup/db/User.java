package ir.javacup.db;

public class User extends AbstractRepository implements IEntity {

    private String id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(Object id) {
        this.id = (String) id;
    }

    @Override
    public Object getId() {
        return id;
    }
}
