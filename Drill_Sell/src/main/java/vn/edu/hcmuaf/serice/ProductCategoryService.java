package vn.edu.hcmuaf.serice;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.util.List;

public class ProductCategoryService {
   public static List<Products> finProductHandDrill(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=4 ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }


    public static List<Products> finProductHammerDrill(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=2  ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductZBattery(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=6 ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductZCharger(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=7 ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductZCountersink(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=8 ORDER BY RAND() LIMIT 6;")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductBatteryDrill(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId  WHERE product_categorys.id=1 ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductMiniDrill(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=5 ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }


    public static List<Products> finProductMovers(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=3 ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }




    public static void main(String[] args) {
        System.out.println(ProductCategoryService.finProductHandDrill());
        System.out.println("----------------------");
        System.out.print(ProductCategoryService.finProductBatteryDrill());
        System.out.println("----------------------");
        System.out.println(ProductCategoryService.finProductMiniDrill());
        System.out.println("----------------------");
        System.out.println(ProductCategoryService.finProductHammerDrill());
        System.out.println("----------------------");
        System.out.println(ProductCategoryService.finProductMovers());
        System.out.println("----------------------");
        System.out.println(ProductCategoryService.finProductZBattery());
        System.out.println("----------------------");
        System.out.println(ProductCategoryService.finProductZCharger());
        System.out.println("----------------------");
        System.out.println(ProductCategoryService.finProductZCountersink());
    }
}
