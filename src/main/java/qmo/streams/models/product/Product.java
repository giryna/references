package qmo.streams.models.product;

import lombok.Data;

import java.util.function.Predicate;

@Data
public class Product {
    private final String name;
    private ProductType productType;

    public Product(String name) {
        this.name = name;
        this.productType = ProductType.NEW;
    }

    public static Predicate<Product> isUnreleased() {
        return product -> ProductType.UNRELEASED
                .toString()
                .equals(product.getProductType().toString());
    }

    ;
}
