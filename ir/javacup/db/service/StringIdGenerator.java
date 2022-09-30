package ir.javacup.db.service;

import ir.javacup.db.service.interfaces.IdGenerator;

import java.nio.charset.Charset;
import java.util.Random;

public class StringIdGenerator implements IdGenerator<String> {

    @Override
    public String generate() {
        byte[] array = new byte[10];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }
}
