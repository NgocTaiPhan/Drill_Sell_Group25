package vn.edu.hcmuaf.bean;

import vn.edu.hcmuaf.db.DbController;

import java.util.List;
import java.util.stream.Collectors;

public class
User {
    private int id,
         boxsell;
    private String fullname,

            address,
            phone,
            email,
            username,
            password,
            sex,
            yearOfBirth;



    public User() {
    }

    public User(int id, String fullname, String address, String phone, String email, String username, String password, String sex, String yearOfBirth, int boxsell) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.boxsell = boxsell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getboxsell() {
        return boxsell;
    }

    public void setboxsell(int boxsell) {
        this.boxsell = boxsell;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                '}';
    }


    public static void main(String[] args) {
        List<User> users =  DbController.me().get().withHandle(handle -> {
            return handle.createQuery("select users.username from users ").mapToBean(User.class).collect(Collectors.toList());
        });


        System.out.println(users);

    }
}