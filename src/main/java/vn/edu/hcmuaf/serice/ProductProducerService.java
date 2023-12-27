import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.util.List;

public class ProductProducerService {

    public static List<Products> finProductByBosh(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductByMakute(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductByDeWalt(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductByMilwaukee(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductByTolsen(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductByClassic(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductBySasuke(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductByHyundai(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductByOshima(String producerName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM products " +
                            "JOIN producers ON products.producerId = producers.id " +
                            "WHERE producers.nameProducer = :producerName " +
                            "ORDER BY RAND() LIMIT 12;")
                    .bind("producerName", producerName)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static void main(String[] args) {
        System.out.println(ProductProducerService.finProductByBosh("Bosh"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductByMakute("Makute"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductByDeWalt("DeWalt"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductByMilwaukee("Milwaukee"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductByTolsen("Tolsen"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductByClassic("Classic"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductBySasuke("Sasuke"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductByHyundai("huynhdai"));
        System.out.println("----------------------");
        System.out.println(ProductProducerService.finProductByOshima("Oshima"));
        System.out.println("----------------------");
    }
}
