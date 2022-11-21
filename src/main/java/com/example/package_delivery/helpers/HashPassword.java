package com.example.package_delivery.helpers;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class HashPassword {
    static Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id, 32, 64);

    public static String hashPassword(String password) {
        return argon2.hash(2, 15 * 1024, 1, password.toCharArray());
    }

    public static Boolean verifiedPassword(String HashPassword, String password) {
        return argon2.verify(HashPassword, password.toCharArray());
    }
}
