package com.example.demo;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * La clase HelloController administra las columnas de la tabla y asigna valores para cada una respectivamente
 * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
 *  * muestran como un todo
 * @author Gabriela Quesada Sancho
 */

public class HelloController implements Initializable {
    public TableView<Products> tableview;
    public TableColumn<Products,String> colCarne;
    public TableColumn<Products,String> colNombre;
    public TableColumn<Products,String> colCorreo;
    public TableColumn<Products,String> colTel;
    public TableColumn<Products,String> colNickname;
    public TableColumn<Products,String> colTipo;
    public TableColumn<Products,Float> colPExam;
    public TableColumn<Products,Float> colPQuiz;
    public TableColumn<Products,Float> colPTarea;
    public TableColumn<Products,Float> colPro1;
    public TableColumn<Products,Float> colPro2;
    public TableColumn<Products,Float> colPro3;
    public TableColumn<Products,Float> colPProyectos;
    public TableColumn<Products,Float> colPromEQT;
    public TableColumn<Products,Float> colNotFin;

    /**
     * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
     *  * muestran como un todo
     *  Además es un claro ejemplo de atributos ya que cada columna son caracteristicas del estudiante y de sobre-
     *  escritura ya que el override es una nueva implementacion de un método heredado por lo que evidentemente
     *  tambien contamos con herencia
     *  Al ser un mismo metodo modificado tambien se tiene polimorfismo
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colCarne.setCellValueFactory(new PropertyValueFactory<>("productCarne"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("productNombre"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("productCorreo"));
        colTel.setCellValueFactory(new PropertyValueFactory<>("productTel"));
        colNickname.setCellValueFactory(new PropertyValueFactory<>("productNickname"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("productTipo"));
        colPExam.setCellValueFactory(new PropertyValueFactory<>("productPExam"));
        colPQuiz.setCellValueFactory(new PropertyValueFactory<>("productPQuiz"));
        colPTarea.setCellValueFactory(new PropertyValueFactory<>("productPTarea"));
        colPro1.setCellValueFactory(new PropertyValueFactory<>("productPro1"));
        colPro2.setCellValueFactory(new PropertyValueFactory<>("productPro2"));
        colPro3.setCellValueFactory(new PropertyValueFactory<>("productPro3"));
        colPProyectos.setCellValueFactory(new PropertyValueFactory<>("productPProyectos"));
        colPromEQT.setCellValueFactory(new PropertyValueFactory<>("productPromEQT"));
        colNotFin.setCellValueFactory(new PropertyValueFactory<>("productNotFin"));
        tableview.setItems(observableList);
    }

    ManipularCSV manipularCSV;
    public void posiciones(){
        //manipularCSV = new ManipularCSV();
       // ArrayList<String> lista_final = manipularCSV.lista_div();
        //System.out.println(lista_final);
    }

    /**
     * Aquí se puede observar la Abstracción ya que se muestra el comportamiento de dicho objeto pero realmente no
     * representa el objeto como tal
     * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
     *  * muestran como un todo
     *  Aquí se asignan valores a las casillas de las columnas
     *  Además es un claro ejemplo de atributos ya que cada columna son caracteristicas del estudiante, tambien en el
     *  tipo de estudiante podemos notar sobrecarga ya que sus acciones se definen según el atributo que este posea
     */
    ObservableList<Products> observableList= FXCollections.observableArrayList(
            /**
             * Podemos notar que se cada fila o cada producto es una instancia ya que cada una es un objeto como tal
             * con atributos propios y se residen en su "molde" el cual sería la clase
             */
            new Products("2022049180","Gabriela Quesada Sancho","gaquesada@estudiantec.cr","86988040","Gaby","A",70,70,70,70,70,70,70,70,70),
            new Products("1","2","3","4","5","B",6,7,8,9,10,11,12,13,14)
            );
}