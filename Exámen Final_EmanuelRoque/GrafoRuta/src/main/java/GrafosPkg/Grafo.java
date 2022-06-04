/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafosPkg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
//import java.util.Vector;

/**
 *
 * @author Ruldin Ayala
 */
public class Grafo {
    String[]  nodos;  // Letras de identificación de nodo
    int[][] grafo;  // Matriz de distancias entre nodos
    String  rutaMasCorta;                           // distancia más corta
    int     longitudMasCorta = Integer.MAX_VALUE;   // ruta más corta
    List<Nodo>  listos=null;                        // nodos revisados de Dijkstra

    // construye el grafo con la serie de identificadores de nodo en una sola cadena
    public Grafo(String serieNodos) {
        nodos = serieNodos.split("-"); //el toCharArray devuelve un vector con las letras del string que le enviemos
        grafo = new int[nodos.length][nodos.length];
    }

    // asigna el tamaño de la arista entre dos nodos
    //esto es para meter las distancias a la tabla
    public void agregarRuta(String origen, String destino, int distancia) {
        int n1 = posicionNodo(origen);
        int n2 = posicionNodo(destino);
        grafo[n1][n2]=distancia;
        grafo[n2][n1]=distancia;
    }

    // retorna la posición en el arreglo de un nodo específico
    private int posicionNodo(String nodo) {
        for(int i=0; i<nodos.length; i++) {
            if(nodos[i].equals(nodo)) return i;
        }
        return -1;
    }
    
    
    
    // Encuentra la ruta más corta desde un nodo origen a un nodo destino
    public String encontrarRutaMinimaDijkstra(String inicio, String fin) {
        // calcula la ruta más corta del inicio a los demás
        encontrarRutaMinimaDijkstra(inicio);
        // Recupera el nodo final de la lista de terminados
        Nodo tmp = new Nodo(fin);//se guarda el nodo final en tmp
        if(!listos.contains(tmp)) {//si listos no contiene a tmp //el contains es para ver si en la lista existe tmp
            System.out.println("Error, nodo no alcanzable");
            return "Adios";
        }

        tmp = listos.get(listos.indexOf(tmp));//devuelve el indice de tmp de la lista (Indice Fin)
        int distancia = tmp.distancia;  //guarda la distancia del nodo final
        // crea una pila para almacenar la ruta desde el nodo final al origen
        Stack<Nodo> pila = new Stack<Nodo>();//se usa un stack para dejar hasta abajo al fin e ir subiendo hasta llegar al origen
        while(tmp != null) {
            pila.add(tmp);//agrego a la pila tmp que sería el fin
            tmp = tmp.procedencia;//Se agrega en tmp la  procedencia osea de donde viene
        }
        String ruta = "";
        // Hace que recorra la pila para armar la ruta en el orden correcto
         while(!pila.isEmpty()) ruta+=(pila.pop().nombre + (pila.size()>0 ?" - ":"."));
        return distancia + " Km" + ": " + ruta;
    }

    // encuentra la ruta más corta desde el nodo inicial a todos los demás
    public void encontrarRutaMinimaDijkstra(String inicio) {
        Queue<Nodo>   cola = new PriorityQueue<Nodo>(); // cola de prioridad (Recordando primero que entra, primero que sale)
        Nodo            ni = new Nodo(inicio);          // nodo inicial se crea nada mas con el nombre
        listos = new LinkedList<Nodo>();// Aca la lista de nodos ya revisados
        cola.add(ni);                   // AGregamos el nodo inicial a la cola de prioridad
        while(!cola.isEmpty()) {        // Minetras la cola no esta vacia
             Nodo tmp = cola.poll();  // Pues elimina la cabeza de la cola o sea saca el primer elemento
            listos.add(tmp);            // lo manda a la lista de terminados
            int p = posicionNodo(tmp.nombre);   //busca la posicion del nodo donde está el nombre de la cabeza 
            for(int j=0; j<grafo[p].length; j++) { //revisa las filas del nodo tmp // O sea los nodos hijos
                if(grafo[p][j]==0) continue;        // si no hay conexión entre los nodos no lo evalua
                if(estaTerminado(j)) continue;      // si ya fue agregado a la lista de terminados
                Nodo nod = new Nodo(nodos[j],tmp.distancia+grafo[p][j],tmp); //crea un nodo mandandole los datos de nombre, distancia y procedencia
           // si no está en la cola de prioridad, lo agrega
                if(!cola.contains(nod)) {
                    cola.add(nod);
                    continue;
                }
                // si ya está en la cola de prioridad pues actualiza la distancia menor
                for(Nodo x: cola) {
                    // si la distancia en la cola es mayor que la distancia calculada
                    if(x.nombre.equals(nod.nombre) && x.distancia > nod.distancia) {
                        cola.remove(x); // pues remueve el nodo de la cola
                        cola.add(nod);  // tmabien agrega el nodo con la nueva distancia
                        //por eso se usa la cola de prioridad, para poder sacar un dato por o y
                        //motivo de alguna conidicon no importando si le toca salir 
                        break;          // no sigue revisando
                    }
                }
            }
        }
    }

    // verifica si un nodo ya está en lista de terminados
    public boolean estaTerminado(int j) {
        Nodo tmp = new Nodo(nodos[j]);
        return listos.contains(tmp);
    }

    // Encuentra la ruta mínima por fuerza bruta
    public void encontrarRutaMinimaFuerzaBruta(String inicio, String fin) {
        int p1 = posicionNodo(inicio);
        int p2 = posicionNodo(fin);
        // cola que almacena cada ruta que está siendo evaluada
        Stack<Integer> resultado = new Stack<Integer>();
        resultado.push(p1);
        recorrerRutas(p1, p2, resultado);
    }

    // Recorre recursivamente las rutas entre un nodo inicial y un nodo final almacenando en una cola cada nodo visitado
    private void recorrerRutas(int nodoI, int nodoF, Stack<Integer> resultado) {
        // si el nodo inicial es igual al final se evalúa la ruta en revisión
        if(nodoI==nodoF) {
            int respuesta = evaluar(resultado);
            if(respuesta < longitudMasCorta) {
                longitudMasCorta = respuesta;
                rutaMasCorta     = "";
                for(int x: resultado) rutaMasCorta+=(nodos[x]+" ");
            }
            return;
        }
        // Si el nodoInicial no es igual al final se crea una lista con todos los nodos adyacentes al nodo inicial que no estén en la ruta en evaluación
        List<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i<grafo.length;i++) {
            if(grafo[nodoI][i]!=0 && !resultado.contains(i))lista.add(i);//Agrega las rutas al grafo
        }
        // se recorren todas las rutas formadas con los nodos adyacentes al inicio
        for(int nodo: lista) {
            resultado.push(nodo);
            recorrerRutas(nodo, nodoF, resultado);
            resultado.pop();
        }
    }
    
    

    // Evalua la longitud de una ruta indicada
    // metodo que hace la suma de las distancias, hace la ruta y pues devuelve los kilometros de distancia
    public int evaluar(Stack<Integer> resultado) {
        int  resp = 0;
        int[]   r = new int[resultado.size()];
        int     i = 0;
        for(int x: resultado) r[i++]=x;
        for(i=1; i<r.length; i++) resp+=grafo[r[i]][r[i-1]];
        return resp;
    }

}
