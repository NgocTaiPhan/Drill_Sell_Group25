package vn.edu.hcmuaf.serice;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.util.List;

public class ProducersService {

    public static List<Products> findProductWidthProducersID(int producersId) {

        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.productName,  FROM products JOIN producers ON products.producerId = producers.id WHERE producers.id =?")
                    .bind(0, producersId)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static void main(String[] args) {
        System.out.println(ProducersService.findProductWidthProducersID(2));
    }

}
