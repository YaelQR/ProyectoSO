/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yael Quintanilla
 */
public class Proceso {
    private int id;
    private String nombre;
    private int []necesidades;
    private int priority;
    private int []asignacion;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the necesidades
     */
    public int[] getNecesidades() {
        return necesidades;
    }

    /**
     * @param necesidades the necesidades to set
     */
    public void setNecesidades(int[] necesidades) {
        this.setNecesidades(necesidades);
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * @return the asignacion
     */
    public int[] getAsignacion() {
        return asignacion;
    }

    /**
     * @param asignacion the asignacion to set
     */
    public void setAsignacion(int[] asignacion) {
        this.asignacion = asignacion;
    }
    
    
    
    
}
