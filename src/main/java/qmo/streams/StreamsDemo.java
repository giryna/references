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

    public static List<Product> getFilteredProductsFor(ProductType productType) {

        List<WebElement> products = getVisibleElementsFor(productsLocator);
        List<Product> filteredProducts = new ArrayList<>();

        for (WebElement productElement : products) {
             String productName = productElement.getText();
             String productTypeString = getTypeFrom(productName);

            if (productTypeString.equals(productType.toString())) {
                Product product = new Product(productName);
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    public static List<Product> getProductsFor8(ProductType productType) {
        return getVisibleElementsFor(productsLocator)
                .stream()
                .map(WebElement::getText)
                .filter(productName -> getTypeFrom(productName).equals(productType.toString()))
                .map(Product::new)
                .collect(toList());
    }

    private static String getTypeFrom(String productName) {
        return "";
    }

    public static List<String> getCheckedCheckboxLabels() {
        List<WebElement> checkboxes = getVisibleElementsFor(checkbox);

        List<String> checkboxLabels = new ArrayList<>();
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkboxLabels.add(checkbox.getText());
            }
        }

        return checkboxLabels;
    }

    public static List<String> getCheckedCheckboxLabels8() {
        return getVisibleElementsFor(checkbox)
                .stream()
                .filter(WebElement::isSelected)
                .map(WebElement::getText)
                .collect(toList());
    }

    private static List<WebElement> getVisibleElementsFor(By locator) {
        return new FirefoxDriver().findElements(locator);
    }
}
