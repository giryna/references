package qmo.lombok;

import lombok.experimental.var;
import lombok.val;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import qmo.streams.models.product.Product;
import qmo.streams.models.product.ProductType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeInference {

    private By productsLocator;

    public List<Product> getProductsFor(ProductType productType) {

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

    public List<Product> getProductsForTI(ProductType productType) {

        val products = getVisibleElementsFor(productsLocator);
        val filteredProducts = new ArrayList<Product>();

        for (val productElement : products) {
            val productName = productElement.getText();
            val productTypeString = getTypeFrom(productName);

            if (productTypeString.equals(productType.toString())) {
                val product = new Product(productName);
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    private static String getTypeFrom(String productName) {
        return "";
    }

    private static List<WebElement> getVisibleElementsFor(By locator) {
        return new FirefoxDriver().findElements(locator);
    }
}
