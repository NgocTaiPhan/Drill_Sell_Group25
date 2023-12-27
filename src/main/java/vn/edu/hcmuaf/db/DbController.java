package vn.edu.hcmuaf.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jdbi.v3.core.Jdbi;

import java.sql.SQLException;

public class DbController {

    private static final DbController instance = new DbController();
    private Jdbi jdbi;

    public static DbController me() {
        return instance;
    }

    private DbController() {
    }

    public Jdbi get() {
        if (jdbi == null) connect();
        return jdbi;
    }

    private void connect() {
        MysqlDataSource dataSource = new MysqlDataSource();
        System.out.println("jdbc:mysql://" + Db.host + ":" + Db.port + "/" + Db.dbName);
        dataSource.setURL("jdbc:mysql://" + Db.host + ":" + Db.port + "/" + Db.dbName);
        dataSource.setUser(Db.username);
        dataSource.setPassword(Db.password);
        try {
            dataSource.setUseCompression(true);
            dataSource.setAutoReconnect(true);
        } catch (SQLException e) {
            System.out.println("Không thể tìm thấy DB");
            throw new RuntimeException();
        }
        jdbi = Jdbi.create(dataSource);
        System.out.println("Đã kết nối database: " + Db.dbName);
    }


    public static void main(String[] args) {
DbController.me().connect();

    }

}
