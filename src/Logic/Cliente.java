/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import java.awt.PopupMenu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author retr0
 */
public class Cliente {
    private static int cantidadClientes = 0;
    private String idCliente;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String sexo;
    private String fechaNacimiento;
    private Tipo tipo;
    private Casillero casillero;
    
    public Cliente(){
        
    }
    /**
     * constructor de la clase
     * @param nombre
     * @param correo
     * @param telefono
     * @param direccion
     * @param sexo
     * @param fechaNacimiento
     * @param casillero 
     */
    public Cliente(String nombre, String correo, String telefono, String direccion, String sexo, String fechaNacimiento, Casillero casillero) {
        cantidadClientes++;
        idCliente = String.valueOf(cantidadClientes);
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = Tipo.NORMAL;
        this.casillero = casillero;
    }

    /**
     * es un metodo de la clase
     * @return la cantidad de clientes
     */
    public static int getCantidadClientes() {
        return cantidadClientes;
    }

    /**
     * 
     * @return el id del cliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * setter del id de cliente
     * @param idCliente 
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * 
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter del nombre del cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return el correo del cliente
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * 
     * @param email
     * @return true si es valido el correo, false, de lo contrario 
     */
    public boolean validarCorreo(String email){
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
        
    
    /**
     * setter del correo
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo; 
    }

    /**
     * 
     * @return el numero de telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * setter del telefono
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        if(telefono.length()!=8){
            System.out.println("Numero de telefono ingresado no valido");
            this.telefono= "00000000";
        }else{
           this.telefono = telefono; 
        }
        
    }

    /**
     * 
     * @return la direccion del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * setter de la direccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return el sexo del cliente
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * setter del sexo
     * @param sexo 
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * 
     * @return la fecha de nacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * setter de la fecha de nacimiento
     * @param fechaNacimiento 
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * 
     * @return el tipo del cliente
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * setter del tipo 
     * @param tipo 
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     * @return el casillero
     */
    public Casillero getCasillero() {
        return casillero;
    }

    /**
     * setter del casillero
     * @param casillero 
     */
    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }
    
    /**
     * TOSTRING DE LA CLASE 
     * @return el string del cliente
     */
    public String toString(){
        String msg = "";
        msg += "Nombre: " + nombre + "\n";
        msg += "\t" + "ID: " + idCliente + "\n";
        msg += "\t" + "Correo: " + correo + "\n";
        msg += "\t" + "Direccion: " + direccion + "\n";
        msg += "\t" + "Telefono: " + telefono + "\n";
        msg += "\t" + "Sexo: " + sexo + "\n";
        msg += "\t" + "Fecha de nacimiento: " + fechaNacimiento + "\n";
        msg += "\t" + "Tipo: " + tipo.name() + "\n";
        msg += "\t" + "Casillero: #" + casillero.getIdCasillero() + "\n";
        return msg;
    }
    
    /**
     * modifica el cliente
     * @param nombre
     * @param correo
     * @param telefono
     * @param direccion 
     */
    public void modificarCliente(String nombre, String correo, String telefono, String direccion){
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
        setDireccion(direccion);
    } 

    /**
     * 
     * @return el string que va al list de awt
     */
    public String toLst() {
        String msg = "";
        msg += "Nombre: " + nombre + "    ";
        msg +=  "ID: " + idCliente + "    ";
        msg += "Correo: " + correo ;
        return msg;
    }
    
    
}
