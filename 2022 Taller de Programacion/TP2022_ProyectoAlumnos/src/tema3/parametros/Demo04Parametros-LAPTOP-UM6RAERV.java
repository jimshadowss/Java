/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.TP2022ProyectoAlumnos.TP2022_ProyectoAlumnos.src.tema3.parametros;

/**
 *
 * @author Victoria
 */
public class Demo04Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.setTitulo("JAVA");
        l1.setPrecio(100);
        // ...
        Libro l2 = new Libro();
        l2.setTitulo("PASCAL");
        l2.setPrecio(50);
        // ...
        // System.out.println(l2.getTitulo());
        // System.out.println(l2.getPrecio());
        l1.copiateEn(l2);
        System.out.println(l2.getTitulo());
        System.out.println(l2.getPrecio());

    }

}
