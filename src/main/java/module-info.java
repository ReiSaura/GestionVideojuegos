module es.cifpcarlos3.gestionvideojuegos {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.cifpcarlos3.gestionvideojuegos to javafx.fxml;
    exports es.cifpcarlos3.gestionvideojuegos;
}