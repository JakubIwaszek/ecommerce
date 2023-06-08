module pl.jiwaszek.ecommerce {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.jiwaszek.ecommerce to javafx.fxml;
    exports pl.jiwaszek.ecommerce;
}