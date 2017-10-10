package qmo;

import lombok.*;

import java.util.function.Predicate;

@RequiredArgsConstructor
@Getter
public class Product {
    private final String name;
    private ProductType productType;

    public static Predicate<Product> isUnreleased() {
        return product -> ProductType.UNRELEASED
                .toString()
                .equals(product.getProductType().toString());
    };
}
