package com.example.demo;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase se lee el archivo CSV y se extrae la información como una nueva lista
 * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
 *  * muestran como un todo
 * @author Gabriela Quesada Sancho
 */

public class ManipularCSV {

    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    public String uno[] = new String[0];
    public ArrayList<String> lista_junta = new ArrayList<String>();

    /**
     * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
     *  * muestran como un todo
     *  Este metodo se encarga de leer el archivo y alamacenarlo en una variable
     * @param nombreArchivo
     */
    void leerArchivo(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null){
                partes = linea.split(",");
                lista_div();
                //ListaJunta();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes=null;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * En cada una de las clase y de los metodos se observa encapsulamiento ya que estas contienen valores que se
     *  * muestran como un todo
     *  Debido a que en la variable la informacion obtenida del archivo CSV se alamacena como un solo String
     *  se utiliza em metodo lista_div la cual aprovecha que este archivo divide sus celdas con ; para poder alamacenar
     *  las distintas casillas por separado
     */

    public void lista_div() {

        for (int i = 0; i < partes.length; i++) {

            String filas = partes[i];
            uno = filas.split(";");
            lista_junta.addAll(List.of(uno));
            //System.out.println(lista_junta.get(2));
        }
        //return lista_junta;
    }
}
