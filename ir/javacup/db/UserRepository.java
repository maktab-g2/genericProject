package ir.javacup.db;

public class UserRepository extends AbstractRepository<String,User>{
    public UserRepository(IdGenerator<String> idGenerator) {
        super(idGenerator);
    }
}
