package pl.jiwaszek.ecommerce.sales;

import java.math.BigDecimal;

public class Offer {
    public int getItemsCount() {
        return 1;
    }

    public BigDecimal getTotal() {
        return BigDecimal.valueOf(100);
    }
}
