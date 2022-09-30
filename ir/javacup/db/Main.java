package ir.javacup.db;

import ir.javacup.db.entity.Person;
import ir.javacup.db.entity.User;
import ir.javacup.db.entity.abstracts.AbstractRepository;
import ir.javacup.db.repository.PersonRepository;
import ir.javacup.db.repository.UserRepository;
import ir.javacup.db.service.NumericIdGenerator;
import ir.javacup.db.service.StringIdGenerator;
import ir.javacup.db.service.interfaces.IRepository;
import ir.javacup.db.service.interfaces.IdGenerator;

public class Main {
    public static void main(String[] args) {

        IdGenerator<String> stringIdGenerator = new StringIdGenerator();
        NumericIdGenerator numericIdGenerator = new NumericIdGenerator();
        IRepository<String, User> userRepository = new UserRepository(stringIdGenerator);
        AbstractRepository<Long, Person> personRepository = new PersonRepository(numericIdGenerator);
        User user1 = new User();
        user1.setName("mahbobeh");
        userRepository.save(user1);
        System.out.println(userRepository.load(user1.getId()));

        Person person = new Person();
        person.setName("reihaneh");
        personRepository.save(person);
        System.out.println(personRepository.load(person.getId()));
        try {
            System.out.println(personRepository.load(12L));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
