/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafosPkg;

import java.util.Objects;

/**
 *
 * @author Ruldin Ayala
 * Preguntas:
 * Para qué sirve la implementación Comparable?
 * y porqué es de tipo Nodo
 */
//la interface comparable sirve  para poder comparar objetos
public class Nodo implements Comparable<Nodo> {
    String nombre;
    int  distancia   = Integer.MAX_VALUE; //le colocamos el valor mas alto para comparar y así obtener el camino mas corto
    Nodo procedencia = null;
    
    public Nodo(String x, int d, Nodo p) { 
        nombre=x; distancia=d; procedencia=p; 
    }
    
    public Nodo(String x) { 
        this(x, 0, null); //crea un nodo que contenga absolutamente el nombre sin conectarse a nada
    }
    
    @Override
    public int compareTo(Nodo tmp) { 
        return this.distancia-tmp.distancia; 
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo other = (Nodo) obj;

        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }

        return true;
    }
    

}
