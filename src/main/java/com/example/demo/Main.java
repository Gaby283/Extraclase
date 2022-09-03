package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * La clase Main es quien se encarga de llamar a las demás clases
 * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
 * muestran como un todo
 */
public class Main extends Application {
    public static void main(String[] args){
        ManipularCSV archivo= new ManipularCSV(); //aquí se creó el objeto

        archivo.leerArchivo(".\\notas\\Notas_Estudiantes.csv");
        launch(args);

        HelloController posicionf = new HelloController();
        posicionf.posiciones();
    }

    /**
     * El metodo start se encarga de configurar la ventana que se muestra al usuario
     * @param primaryStage
     * @throws Exception
     *Contamos con sobreescritura ya que el override es una nueva implementacion de un método heredado
     * por lo que evidentemente tambien contamos con herencia
     * Al ser un mismo metodo modificado tambien se tiene polimorfismo
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Sistema de Notas");
        primaryStage.setScene(new Scene(root,723,505));
        primaryStage.show();

    }

}
