package vn.edu.hcmuaf.service;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.db.DbController;

public class UserService {

    private static UserService instance;

    private UserService() {
    }

    public static UserService getInstance() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User getUser(String username, String password) {
        String query = "SELECT fullname, address, phone, email, username, passwords, sex, yearOfBirth FROM users WHERE username = ? AND passwords = ?";
        Jdbi jdbi = DbController.me().get();
        try (Handle handle = jdbi.open()) {
            return handle.createQuery(query)
                    .bind(0, username)
                    .bind(1, password)
                    .mapToBean(User.class)
                    .findFirst()
                    .orElse(null);
        }
    }

    public void addUser(User newUser) {
        String insertQuery = "INSERT INTO users (fullname, address, phone, email, username, passwords, sex, yearOfBirth) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Jdbi jdbi = DbController.me().get();
        try (Handle handle = jdbi.open()) {
            handle.createUpdate(insertQuery)
                    .bind(0, newUser.getFullname())
                    .bind(1, newUser.getAddress())
                    .bind(2, newUser.getPhone())
                    .bind(3, newUser.getEmail())
                    .bind(4, newUser.getUsername())
                    .bind(5, newUser.getPasswords())
                    .bind(6, newUser.getSex())
                    .bind(7, newUser.getYearOfBirth())
                    .execute();
        }
    }

    public static void main(String[] args) {
        UserService.getInstance().addUser(new User("P","123","4343434","123@gmail.com","p12","123","Nữ","2003"));
    }


}
