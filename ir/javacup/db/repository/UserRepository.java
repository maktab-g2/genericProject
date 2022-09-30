package ir.javacup.db.repository;

import ir.javacup.db.entity.abstracts.AbstractRepository;
import ir.javacup.db.service.interfaces.IdGenerator;
import ir.javacup.db.entity.User;

public class UserRepository extends AbstractRepository<String, User> {
    public UserRepository(IdGenerator<String> idGenerator) {
        super(idGenerator);
    }
}
