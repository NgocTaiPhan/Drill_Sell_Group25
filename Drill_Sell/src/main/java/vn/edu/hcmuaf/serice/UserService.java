package vn.edu.hcmuaf.serice;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.db.DbController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {

    private static UserService instance;

    private UserService() {}

    public static UserService getInstance() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User checkLogin(String username, String password) {
        List<User> users = DbController.me().get().withHandle(handle -> {
            return handle.createQuery("select users.username from users where username = ?")
                    .bind(0, username)
                    .mapToBean(User.class).collect(Collectors.toList());
        });
        if (users.size() != 1) return null;
        User u = users.get(0);
        return (password.equals(u.getPassword())) ? u : null;
    }


}

