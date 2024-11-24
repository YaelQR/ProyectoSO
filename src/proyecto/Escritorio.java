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
    private Proceso []listos;

    public Escritorio() {
    }

    public Escritorio(int[] recursos, int[] disponibles, int[][] solicitud, int[][] asignacion, Proceso[] listos) {
        this.recursos = recursos;
        this.disponibles = disponibles;
        this.solicitud = solicitud;
        this.asignacion = asignacion;
        this.listos = listos;
    }
    
    //algoritmos para deteccion
    
    public void deteccion(){
        
        boolean []procesosSA=new boolean[solicitud.length];
        int proceso;
        boolean safe=true;
        
        //Primer paso
        procesosSA=marcar(procesosSA);
        
        //Segundo paso
        int []T=disponibles;
        //System.out.println("---------------------"); //Eliminar
        //Tercer paso
        do{
            proceso=encontrarProceso(procesosSA,T);
            //System.out.println("Proceso "+proceso+" se saco"); //Eliminar
            if(proceso==-1){
                System.out.println("Interbloqueo Detectado");
                safe=false;
            }  
            else{
                procesosSA[proceso]=true;
                T=agregarR(T,proceso);
            }
        }while(safe);
        
        //System.out.println("---------------------"); //Eliminar
        
        if(!safe){
            encontrarInterbloqueos(procesosSA);
        }
        
    }
    
    public boolean []marcar(boolean []procesosSA){
        boolean flag;
        
        for(int i=0; i<asignacion.length; i++){
            
            if( !(procesosSA[i]) ){
               flag=true;
                for(int j=0; j<asignacion[i].length; j++){
                    if(asignacion[i][j]>0){
                        flag=false;
                        break;
                    }    
                }
                procesosSA[i]=flag;

                //String res = (flag)? "Proceso "+i+" se marco":"Proceso "+i+" no se marco"; //Eliminar
                //System.out.println(res); //Eliminar 
            }
            
        }
        return procesosSA;
    }
    
    public int encontrarProceso(boolean []procesosSA, int []T){
        boolean valido=false;
        for(int i=0; i<solicitud.length; i++){
            
            if(procesosSA[i]==false){
                //Eliminar
                /*System.out.println("Vector T");
                imprime(T);
                System.out.println("Proceso "+i);
                imprime(solicitud[i]);*/
                
                valido=true;
                for(int j=0; j<solicitud[i].length; j++){
                    if(solicitud[i][j] > T[j]){
                        valido=false;
                    }
                }
                //System.out.println(valido+"\n"); //Eliminar
            }
            
            if(valido)
                return i;
        }
        
        return -1;
    } 
    
    public int []agregarR(int []T, int proceso){
        
        for(int j=0; j<asignacion[proceso].length; j++){
            T[j]+=asignacion[proceso][j];
        }
        
        return T;
    }
    
    public void encontrarInterbloqueos(boolean []procesosSA){
        
        for(int i=0; i<procesosSA.length; i++){
            if(!procesosSA[i])
                System.out.println("Proceso "+i+" en interbloqueo");
            else
                System.out.println("Proceso "+i+" no esta en interbloqueo");
        }
        
    }
    
    public void imprime(int []vector){
        for(int i=0; i<vector.length; i++){
            System.out.print(vector[i]+", ");
        }
        System.out.println("");
    }
    
    //Algoritmos para prediccion
    
    
    
    //Algoritmos para recuperacion
    
    //Recuperar recursos de un proceso
    public int []recuperaRecursos(int p, int []recursos){
        
        for(int j=0; j<asignacion[p].length; j++){
            recursos[j]+=asignacion[p][j];
        }
        
        return recursos;
    }
    
    public void recuperacionD(boolean []procesosSA){
        
        int p;
        int min;
        
        for(int i=0; i<procesosSA.length; i++){
            if( !(procesosSA[i]) ){
                
            }
        }
        
        
    }
    
    
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

    /**
     * @return the listos
     */
    public Proceso[] getListos() {
        return listos;
    }

    /**
     * @param listos the listos to set
     */
    public void setListos(Proceso[] listos) {
        this.listos = listos;
    }
    
    
    
}
