package vn.edu.hcmuaf.service;

public class ProductValue_util {
    public static String getProducerName(int producerId) {
        switch (producerId) {
            case 1: return "Bosh";
            case 2: return "Makute";
            case 3: return "DeWalt";
            case 4: return "Milwaukee";
            case 5: return "Tolsen";
            case 6: return "Classic";
            case 7: return "Sasuke";
            case 8: return "Huynhdai";
            case 9: return "Oshima";
            case 10: return "Gomes";
            default: return "";
        }
    }

    public static String getCategoryName(int categoryId) {
        switch (categoryId) {
            case 1: return "Máy khoan pin";
            case 2: return "Máy khoan bê tông, Máy khoan búa";
            case 3: return "Máy khoan động lực";
            case 4: return "Máy khoan cầm tay gia đình";
            case 5: return "Máy khoan mini";
            case 6: return "Pin máy khoan";
            case 7: return "Sạc pin máy khoan";
            case 8: return "Mũi khoan";
            default: return "";
        }
    }
}

