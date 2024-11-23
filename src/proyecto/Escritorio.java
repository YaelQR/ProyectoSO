/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yael Quintanilla
 */
public class Escritorio {
    
    private int []recursos;
    private int []disponibles;
    private int [][]solicitud;
    private int [][]asignacion;
    
    
    

    /**
     * @return the recursos
     */
    public int[] getRecursos() {
        return recursos;
    }

    /**
     * @param recursos the recursos to set
     */
    public void setRecursos(int[] recursos) {
        this.recursos = recursos;
    }

    /**
     * @return the disponibles
     */
    public int[] getDisponibles() {
        return disponibles;
    }

    /**
     * @param disponibles the disponibles to set
     */
    public void setDisponibles(int[] disponibles) {
        this.disponibles = disponibles;
    }

    /**
     * @return the solicitud
     */
    public int[][] getSolicitud() {
        return solicitud;
    }

    /**
     * @param solicitud the solicitud to set
     */
    public void setSolicitud(int[][] solicitud) {
        this.solicitud = solicitud;
    }

    /**
     * @return the asignacion
     */
    public int[][] getAsignacion() {
        return asignacion;
    }

    /**
     * @param asignacion the asignacion to set
     */
    public void setAsignacion(int[][] asignacion) {
        this.asignacion = asignacion;
    }
    
    
    
}
