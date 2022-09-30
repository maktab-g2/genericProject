package ir.javacup.db;

public class Person extends AbstractRepository implements IEntity {

    private int id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(Object id) {
        this.id = (Integer) id;
    }

    @Override
    public Object getId() {
        return null;
    }


}
