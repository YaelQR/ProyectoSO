/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yael Quintanilla
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int []recursos={2,1,1,2,1};
        int []disponibles={0,0,0,0,1};
        int [][]solicitud={
            {0,1,0,0,1},
            {0,0,1,0,1},
            {0,0,0,0,1},
            {1,0,1,0,1}
        };
        
        int [][]asignacion={
            {1,0,1,1,0},
            {1,1,0,0,0},
            {0,0,0,1,0},
            {0,0,0,0,0}
        };
        
        Proceso []listos=new Proceso[5];
        
        Escritorio escritorio1=new Escritorio(recursos,disponibles,solicitud,asignacion,listos);
        escritorio1.deteccion();
        
        
    }
    
}
