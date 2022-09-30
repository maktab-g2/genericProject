package ir.javacup.db;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"maryam");
        System.out.println(map.remove(1));
    }
}
