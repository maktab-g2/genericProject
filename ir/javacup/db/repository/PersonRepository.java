package ir.javacup.db.repository;

import ir.javacup.db.entity.abstracts.AbstractRepository;
import ir.javacup.db.service.interfaces.IdGenerator;
import ir.javacup.db.entity.Person;

public class PersonRepository extends AbstractRepository<Long, Person> {
    public PersonRepository(IdGenerator<Long> idGenerator) {
        super(idGenerator);
    }
}
