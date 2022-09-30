package ir.javacup.db;

public class Main {
    public static void main(String[] args) {
        IEntity<String> user = new User();
        IdGenerator<String> stringIdGenerator = new StringIdGenerator();
    }
}
