package qmo.streams;

import qmo.streams.models.product.Product;
import qmo.streams.models.product.ProductType;

import java.util.List;

public class StreamsClass {

    public static void main(String[] args) {
        List<Product> list = StreamsDemo.getProductsFor8(ProductType.UNRELEASED);
        System.out.println(list);
    }

}
