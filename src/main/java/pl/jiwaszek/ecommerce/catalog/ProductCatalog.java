package pl.jiwaszek.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProductCatalog {

    private HashMap<String, Product> products;

    public ProductCatalog() {
        this.products = new HashMap<>();
    }

    public String createProduct(String name) {
        Product product = new Product(UUID.randomUUID(), name);

        products.put(product.getId(), product);

        return product.getId();
    }
    public List<Product> allAvailableProducts() {
        return products.values()
                .stream()
                .collect(Collectors.toList());
    }

    public List<Product> allPublishedProducts() {
        return products.values()
                .stream()
//                .filter(Product::isOnline)
                .collect(Collectors.toList());
    }

    public void changePrice(String productId, BigDecimal newPrice) {
        Product product = products.get(productId);
        product.changePrice(newPrice);
    }

    public Optional<Product> findProducts(String productId) {
        return Optional.ofNullable(products.get(productId));
    }

    public void publishProduct() {
//        Product product = findProducts();
    }
}
