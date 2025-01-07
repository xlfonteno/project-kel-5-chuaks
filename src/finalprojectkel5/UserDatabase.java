/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectkel5;

import java.util.HashMap;

/**
 *
 * @author Lenovo X240
 */
public class UserDatabase {
    private static HashMap<String, String> users = new HashMap<>();
    // Menambah pengguna
    public static boolean addUser(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Username sudah ada
        }
        users.put(username, password);
        return true;
    }

    // Memeriksa login
    public static boolean checkLogin(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
