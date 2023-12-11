package vn.edu.hcmuaf.serice;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.db.DbController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {

    private static Map<String, String> tmpUser = new HashMap<>();

    static {
        tmpUser.put("admin@gmail.com", "admin");
        tmpUser.put("ThuyTrang@gmail.com", "123");
    }

    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User checkLogin(String username, String password) {
        List<User> users = DbController.me().get().withHandle(handle -> {
            return handle.createQuery("select * from users where username = ?")
                    .bind(0, username)
                    .mapToBean(User.class).collect(Collectors.toList());
        });
        if (users.size() != 1) return null;
        User u = users.get(0);
        if (username.equals(u.getUsername().equals(u.getPassword()))) {
            return u;
        }
        return null;
    }
}
