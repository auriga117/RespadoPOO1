/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author retr0
 */
public class Sobre extends Entregable {
    private String tipo; //aereo o de manila
    private String contenido; //articulo pequeño o documentos
    private double peso;

    /**
     * constructor de una de las clases hijas   
     * @param tipo
     * @param contenido
     * @param peso
     * @param codReferencia
     * @param estadoEntrega
     * @param descripcion 
     */
    public Sobre(String tipo, String contenido, double peso, String codReferencia, boolean estadoEntrega, String descripcion, String remitente) {
        super(codReferencia, estadoEntrega, descripcion, remitente);
        setTipo(tipo);
        setContenido(contenido);
        setPeso(peso);
    }
    
    /**
     * 
     * @return el tipo del sobre
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * setter del tipo
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     * @return el contenido del sobre
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * setter del contenido
     * @param contenido 
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * 
     * @return  el peso del sobre
     */
    public double getPeso() {
        return peso;
    }

    /**
     * setter del peso
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    /**
     * metodo del padre, calcula el impuesto del hijo
     * @return el impuesto
     */
    @Override
    public double calcularImpuesto() {
        String s="";
        double result = 0;
        if(tipo.equals("Aereo") && contenido.equals("Documentacion")){
            result = 0;
            s="Sobre Aereo \ny con Documentacion.\n Impuesto = 0";
        }
        else if(tipo.equals("Aereo") && contenido.equals("Articulo Pequeño")){
            result = 1;
            s="Sobre Aereo \ny con Articulo pequeño.\n Impuesto = 1";
        }
        else if(tipo.equals("Manila") && contenido.equals("Documentacion")){
            result = 1;
            s="Sobre Manila \ny con Documentacion.\n Impuesto = 1";
        }
        else if(tipo.equals("Manila") && contenido.equals("Articulo Pequeño")){
            result = 2;
            s="Sobre Manila \ny con Articulo Pequeño.\n Impuesto = 2";
        }
        this.impuesto=s;
        return result;
    }
    
    
    
    /**
     * toString de la clase
     * @return 
     */
    @Override
    public String toString(){
        String msg = "\tSobre\n";
        msg += "\tCodigo: " + super.getCodReferencia() + "\n";
        msg += "\tTipo: " + getTipo() + "\n";
        msg += "\tContenido: " + getContenido() + "\n";
        msg += "\tPeso: " + + getPeso() + " gramos" + "\n";
        if(super.getEstadoEntrega()){
            msg += "\tEstado:"  + " Entregado\n";
            msg += "\tFecha de entrega: "+ super.fechaEntrega +"\n";
            msg += "\tHora de entrega: "+ super.horaEntrega +"\n";
        }
        else{
            msg += "\tEstado:" + " No Entregado\n";
        }
        msg += "\tFecha recepcion: " + super.fechaRecepcion + "\n";
        msg += "\tDescripcion: " + super.getDescripcion() + "\n";
        msg += "\tRemitente: " + remitente.toString() + "\n";
        return msg;
    }
    
    @Override
    public String toList() {
        String msg="";
        msg+="Codigo: "+this.codReferencia;
        msg+=";Sobre de: "+this.remitente;
        msg+=" Impuesto: "+String.valueOf(calcularImpuesto());
        return msg;
    }
    
}
