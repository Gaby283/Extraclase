package com.example.demo;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *En esta clase se configuran todas las columnas que utiliza la tabla, se declaran, se meten las columnas en los
 * objetos para inicializar los valores y se establecen sus respectivos valores
 * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
 * muestran como un todo
 */

public class Products {
    private SimpleStringProperty productCarne;
    private SimpleStringProperty productNombre;
    private SimpleStringProperty productCorreo;
    private SimpleStringProperty productTel;
    private SimpleStringProperty productNickname;
    private SimpleStringProperty productTipo;
    private SimpleFloatProperty productPExam;
    private SimpleFloatProperty productPQuiz;
    private SimpleFloatProperty productPTarea;
    private SimpleFloatProperty productPro1;
    private SimpleFloatProperty productPro2;
    private SimpleFloatProperty productPro3;
    private SimpleFloatProperty productPProyectos;
    private SimpleFloatProperty productPromEQT;
    private SimpleFloatProperty productNotFin;

    /**
     * Se meten en los objetos y se inicializan los valores
     * @param productCarne
     * @param productNombre
     * @param productCorreo
     * @param productTel
     * @param productNickname
     * @param productTipo
     * @param productPExam
     * @param productPQuiz
     * @param productPTarea
     * @param productPro1
     * @param productPro2
     * @param productPro3
     * @param productPProyectos
     * @param productPromEQT
     * @param productNotFin
     */
    public Products(String productCarne, String productNombre, String productCorreo, String productTel, String productNickname, String productTipo, float productPExam, float productPQuiz, float productPTarea, float productPro1, float productPro2, float productPro3, float productPProyectos, float productPromEQT, float productNotFin) {
        this.productCarne = new SimpleStringProperty(productCarne);
        this.productNombre = new SimpleStringProperty(productNombre);
        this.productCorreo = new SimpleStringProperty(productCorreo);
        this.productTel = new SimpleStringProperty(productTel);
        this.productNickname = new SimpleStringProperty(productNickname);
        this.productTipo = new SimpleStringProperty(productTipo);
        this.productPExam = new SimpleFloatProperty(productPExam);
        this.productPQuiz = new SimpleFloatProperty(productPQuiz);
        this.productPTarea = new SimpleFloatProperty(productPTarea);
        this.productPro1 = new SimpleFloatProperty(productPro1);
        this.productPro2 = new SimpleFloatProperty(productPro2);
        this.productPro3 = new SimpleFloatProperty(productPro3);
        this.productPProyectos = new SimpleFloatProperty(productPProyectos);
        this.productPromEQT = new SimpleFloatProperty(productPromEQT);
        this.productNotFin = new SimpleFloatProperty(productNotFin);
    }

    /**
     * Se utilizan los metodos con set y get para establecer los distintos valores que ingresa
     * el usuario a cada columna y obtener cada columna
     * @return
     */
    //Carné----------------------------------------------------------------------

    public String getProductCarne() {
        return productCarne.get();
    }

    public void setProductCarne(String productCarne) {
        this.productCarne = new SimpleStringProperty(productCarne);
    }
    //Nombre---------------------------------------------------------------------
    public String getProductNombre() {
        return productNombre.get();
    }

    public void setProductNombre(String productNombre) {
        this.productNombre = new SimpleStringProperty(productNombre);
    }
    //Correo---------------------------------------------------------------------
    public String getProductCorreo() {
        return productCorreo.get();
    }

    public void setProductCorreo(String productCorreo) {
        this.productCorreo = new SimpleStringProperty(productCorreo);
    }
    //Telefono-------------------------------------------------------------------
    public String getProductTel() {
        return productTel.get();
    }

    public void setProductTel(String productTel) {
        this.productTel = new SimpleStringProperty(productTel);
    }
    //Nickname------------------------------------------------------------------
    public String getProductNickname() {
        return productNickname.get();
    }

    public void setProductNickname(String productNickname) {
        this.productNickname = new SimpleStringProperty(productNickname);
    }
    //Tipo----------------------------------------------------------------------
    public String getProductTipo() {
        return productTipo.get();
    }

    public void setProductTipo(String productTipo) {
        this.productTipo = new SimpleStringProperty(productTipo);
    }
    //Promedio Examen-----------------------------------------------------------
    public float getProductPExam() {
        return productPExam.get();
    }

    public void setProductPExam(float productPExam) {
        this.productPExam = new SimpleFloatProperty(productPExam);
    }
    //Promedio Quiz-------------------------------------------------------------
    public float getProductPQuiz() {
        return productPQuiz.get();
    }

    public void setProductPQuiz(float productPQuiz) {
        this.productPQuiz = new SimpleFloatProperty(productPQuiz);
    }
    //Promedio Tarea------------------------------------------------------------
    public float getProductPTarea() {
        return productPTarea.get();
    }

    public void setProductPTarea(float productPTarea) {
        this.productPTarea = new SimpleFloatProperty(productPTarea);
    }
    //Proyecto 1----------------------------------------------------------------
    public float getProductPro1() {
        return productPro1.get();
    }

    public void setProductPro1(float productPro1) {
        this.productPro1 = new SimpleFloatProperty(productPro1);
    }
    //Proyecto 2----------------------------------------------------------------
    public float getProductPro2() {
        return productPro2.get();
    }

    public void setProductPro2(float productPro2) {
        this.productPro2 = new SimpleFloatProperty(productPro2);
    }
    //Proyecto 3---------------------------------------------------------------
    public float getProductPro3() {
        return productPro3.get();
    }

    public void setProductPro3(float productPro3) {
        this.productPro3 = new SimpleFloatProperty(productPro3);
    }
    //Promedio Proyectos-------------------------------------------------------
    public float getProductPProyectos() {
        return productPProyectos.get();
    }

    public void setProductPProyectos(float productPProyectos) {
        this.productPProyectos = new SimpleFloatProperty(productPProyectos);
    }
    //Promedio Examenes, Quices, Tareas---------------------------------------
    public float getProductPromEQT() {
        return productPromEQT.get();
    }

    public void setProductPromEQT(float productPromEQT) {
        this.productPromEQT = new SimpleFloatProperty(productPromEQT);
    }
    //Nota Final--------------------------------------------------------------
    public float getProductNotFin() {
        return productNotFin.get();
    }

    public void setProductNotFin(float productNotFin) {
        this.productNotFin = new SimpleFloatProperty(productNotFin);
    }
}
