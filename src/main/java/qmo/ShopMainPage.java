package qmo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ShopMainPage {

    private static By productLocator = By.id("productID");

    public static List<Product> getProductsFor(ProductType productType) {
        return getVisibleElements(productLocator)
                .stream()
                .map(WebElement::getText)
                .map(Product::new)
                .filter(product -> product.getProductType().equals(productType))
                .collect(toList());
    }

    public static List<ProductType> getProductTypeFor(ProductType productType) {
        return getVisibleElements(productLocator)
                .stream()
                .map(WebElement::getText)
                .map(Product::new)
                .map(Product::getProductType)
                .flatMap(Stream::of)
                .filter(type -> type.equals(productType))
                .collect(toList());
    }

    public static List<Product> getProductsForOLD(ProductType productType) {
       List<WebElement> products = getVisibleElements(productLocator);

       List<String> productNames = new ArrayList<>();
       for(WebElement product : products){
           productNames.add(product.getText());
       }

       List<Product> filteredProducts = new ArrayList<>();
       for(String string : productNames){
           if(string.equals(productType.toString())) {
               filteredProducts.add(new Product(string));
           }
       }

       return filteredProducts;
    }

    private static List<WebElement> getVisibleElements(By locator) {
        return new FirefoxDriver().findElements(locator);
    }
}
