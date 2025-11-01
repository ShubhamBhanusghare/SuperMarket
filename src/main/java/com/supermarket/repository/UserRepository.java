package com.supermarket.repository;

import com.supermarket.model.Admin;
import com.supermarket.model.Cashier;
import com.supermarket.model.Roles;
import com.supermarket.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String, User> userMap = new HashMap<>();

    public UserRepository() {
        try {
            loadUsersFromFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isUserExists(String username){
        return userMap.containsKey(username);
    }
    public User findByUsername(String username)
    {
        return userMap.get(username);
    }

    public void addUser(User user){
        if (user != null && !userMap.containsKey(user.getUserName())) {
            userMap.put(user.getUserName(), user);
        }
        else{
            System.out.println("User cannot be added");
        }
    }

    public void deleteUser(String userName){
        if (userName != null) {
            userMap.remove(userName);
        }
    }



    public Collection<User> getAllUsers() {
        return userMap.values();
    }


    private void loadUsersFromFile() throws IOException {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("users.csv")) {
            if (inputStream == null) {
                System.err.println("users.csv not found in resources!");
                return;
            }
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length < 4) continue;

                    String id = parts[0].trim();
                    String username = parts[1].trim();
                    String password = parts[2].trim();
                    String role = parts[3].trim().toUpperCase();

                    User user = createUserByRole(id, username, password, role);
                    if (user != null) userMap.put(username, user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private User createUserByRole(String id, String username, String password, String role) {
        switch (role) {
            case "ADMIN": return new Admin(id, username, password);
            case "CASHIER": return new Cashier(id, username, password);
            //case "CUSTOMER": return new Customer(id, username, password);
            default: return null;
        }
    }



}
