package ir.javacup.db;

public class PersonRepository extends AbstractRepository<Long,Person>{
    public PersonRepository(IdGenerator<Long> idGenerator) {
        super(idGenerator);
    }
}
