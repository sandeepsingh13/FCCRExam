package com.example.exam;

import java.util.ArrayList;
import java.util.List;

public class UserDataSource {
    private static UserDataSource instance = null;
    List<User> users;

    private UserDataSource() {
        users = new ArrayList<>();

        //for (int i = 0; i < 10; i++) {
            User user = new User();
            // Put random values, but id must be unique
            user.id = 1;
            user.name = "sandeep";
            user.password = "abc" ;
           user.id = 2;
           user.name = "jaskaran";
           user.password = "abc" ;
        user.id = 3;
        user.name = "sahil";
        user.password = "abc" ;
        user.id = 4;
        user.name = "amar";
        user.password = "abc" ;
        user.id = 5;
        user.name = "me";
        user.password = "abc" ;
        user.id = 6;
        user.name = "you";
        user.password = "abc" ;
        user.id = 7;
        user.name = "we";
        user.password = "abc" ;
        user.id = 8;
        user.name = "wher";
        user.password = "abc" ;
        user.id = 9;
        user.name = "then";
        user.password = "abc" ;

        user.id = 10;
        user.name = "when";
        user.password = "abc" ;

            users.add(user);
        }
   // }

    static UserDataSource getInstance() {
        if (instance == null) {
            instance = new UserDataSource();
        }
        return instance;
    }
}
