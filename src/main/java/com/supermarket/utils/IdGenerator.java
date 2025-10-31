package com.supermarket.utils;

import java.util.HashSet;
import java.util.Set;

public class IdGenerator {

    private static final Set<String> userIds = new HashSet<>();
    private static int counter = 100;

    public static String generateProductId() {
        String id;
        do {
            id = "P" + counter++;
        }
        while (userIds.contains(id));
        userIds.add(id);
        return id;
    }
}
