package pl.jiwaszek.ecommerce.catalog;

import java.util.UUID;
import java.math.BigDecimal;

public class Product {
    private final String id;
    private final String name;
    public Product(UUID id, String name) {
        this.id = id.toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void changePrice(BigDecimal price) {

    }
}
