package pl.jiwaszek.catalog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import pl.jiwaszek.ecommerce.catalog.ProductCatalog;
import pl.jiwaszek.ecommerce.catalog.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductCatalogTest {

    @Test
    void itAllowsToAddProduct() {
        ProductCatalog catalog = thereIsProductCatalog();

        String productId = catalog.createProduct("Lego set");

        List<Product> products = catalog.allAvailableProducts();
        List<Product> publishedProducts = catalog.allPublishedProducts();
        assert products.size() == 1;
        assert publishedProducts.size() == 0;
    }

    @Test
    void itAllowsToModifyPrice() {
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.createProduct("Lego set");

        catalog.changePrice(productId, BigDecimal.valueOf(21.37));

//        Product loaded = catalog.findProducts(productId);

//        assert loaded.getPrice().equals(BigDecimal.valueOf(21.37));
    }

    @Test
    void itDenyPublicationWithoutPriceAndAttributes() {
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.createProduct("Lego Set");

        assertThrows(CantPublishProductException.class () -> catalog.publish(productId));
    }

    private ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }
}
