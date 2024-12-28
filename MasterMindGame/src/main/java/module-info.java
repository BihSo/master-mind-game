module loyalixa.oop.mastermindgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens loyalixa.oop.mastermindgame to javafx.fxml;
    exports loyalixa.oop.mastermindgame;
}