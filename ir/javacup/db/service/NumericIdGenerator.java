package ir.javacup.db.service;

import ir.javacup.db.service.interfaces.IdGenerator;

import java.util.Random;

public class NumericIdGenerator implements IdGenerator<Long> {
    @Override
    public Long generate() {
        Random random = new Random();
        return random.nextLong();
    }
}
