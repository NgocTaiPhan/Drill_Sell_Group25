package vn.edu.hcmuaf.bean;

import vn.edu.hcmuaf.db.DbController;

import java.util.List;
import java.util.stream.Collectors;

public class Producers {
    private int id;
    private String nameProducer;

    public Producers(int id, String nameProducer) {
        this.id = id;
        this.nameProducer = nameProducer;
    }

    public Producers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    @Override
    public String toString() {
        return "Producres{" +
                "id=" + id +
                ", nameProducer='" + nameProducer + '\'' +
                '}'+ "\n";
    }


    public static void main(String[] args) {
//        List<Producers> producresList =  DbController.me().get().withHandle(handle -> {
//            return handle.createQuery("select * from producers WHERE producers.id = 02;").mapToBean(Producers.class).collect(Collectors.toList());
//        });




    }
}
