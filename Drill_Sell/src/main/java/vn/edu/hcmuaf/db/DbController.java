package vn.edu.hcmuaf.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.reflect.ReflectionMappers;
import vn.edu.hcmuaf.bean.User;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class DbController {

    private static final DbController instance = new DbController();
    private Jdbi jdbi;

    public static DbController me(){
        return instance;
    }
    private DbController(){}
    public Jdbi get(){
        if(jdbi == null) connect();
        return jdbi;
    }

    private void connect() {
        MysqlDataSource dataSource = new MysqlDataSource();
        System.out.println("jdbc:mysql://" + Db.host + ":" + Db.port + "/" + Db.name);
        dataSource.setURL("jdbc:mysql://" + Db.host + ":" + Db.port + "/" + Db.name);
        dataSource.setUser(Db.username);
        dataSource.setPassword(Db.password);
        try {
            dataSource.setUseCompression(true);
            dataSource.setAutoReconnect(true);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        jdbi = Jdbi.create(dataSource);
    }









    public static void main(String[] args) {
        List<User> users =  DbController.me().get().withHandle(handle -> {
        return handle.createQuery("select * from users").mapToBean(User.class).collect(Collectors.toList());
        });


        System.out.println(users);


    }

}
