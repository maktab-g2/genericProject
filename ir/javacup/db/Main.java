package ir.javacup.db;

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
