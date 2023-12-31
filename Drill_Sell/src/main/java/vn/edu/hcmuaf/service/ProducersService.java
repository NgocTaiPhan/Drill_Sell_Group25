package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.util.List;

public class ProducersService {

    public static List<Products> findProductWidthProducersID(int producersId) {

        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.*, producers.nameProducer \n" +
                            "FROM products\n" +
                            "JOIN producers\n" +
                            "ON products.producerId = producers.id\n" +
                            "WHERE producerId = ?;\n")
                    .bind(0, producersId)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static void main(String[] args) {
        System.out.println(ProducersService.findProductWidthProducersID(2));
    }
}
