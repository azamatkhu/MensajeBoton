package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Button buton = new Button("Haz clic aqui");

        // ActionEvent para asignar la accion al boton
        buton.setOnAction(event -> {
            System.out.println("Has hecho clic");
        });

        Scene scene = new Scene(buton, 400, 200);

        stage.setTitle("Ejercicio 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}