module br.edu.ifsp.ead02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.ifsp.ead02 to javafx.fxml;
    exports br.edu.ifsp.ead02;
}