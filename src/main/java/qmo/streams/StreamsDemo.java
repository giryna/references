package qmo.streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import qmo.streams.models.product.Product;
import qmo.streams.models.product.ProductType;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsDemo {

    private static By productsLocator = By.id("productID");
    private static By checkbox = By.id("productID");

    public static List<Product> getProductsFor(ProductType productType) {
        List<WebElement> products = getVisibleElements(productsLocator);

        List<String> productNames = new ArrayList<>();
        for (WebElement product : products) {
            productNames.add(product.getText());
        }

        List<Product> filteredProducts = new ArrayList<>();
        for (String string : productNames) {
            if (string.equals(productType.toString())) {
                filteredProducts.add(new Product(string));
            }
        }

        return filteredProducts;
    }

    public static List<Product> getProductsFor8(ProductType productType) {
        return getVisibleElements(productsLocator)
                .stream()
                .map(WebElement::getText)
                .map(Product::new)
                .filter(product -> productType.equals(product.getProductType()))
                .collect(toList());
    }

    public static List<String> getCheckedCheckboxLabels() {
        List<WebElement> checkboxes = getVisibleElements(checkbox);

        List<String> checkboxLabels = new ArrayList<>();
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkboxLabels.add(checkbox.getText());
            }
        }

        return checkboxLabels;
    }

    public static List<String> getCheckedCheckboxLabels8() {
        return getVisibleElements(checkbox)
                .stream()
                .filter(WebElement::isSelected)
                .map(WebElement::getText)
                .collect(toList());
    }

    private static List<WebElement> getVisibleElements(By locator) {
        return new FirefoxDriver().findElements(locator);
    }
}
