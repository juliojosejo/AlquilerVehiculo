import java.util.Date;
import java.util.Scanner;

/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
    private String modelo;
    private String año;
    private String placa;
    private String tarifa;
    private String disponibilidad;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private String ubicacion;
    private String tipoVehiculo;

    public Vehiculo()
    {
    }
    public Vehiculo(String modelo,String año,String placa, String tarifa, String disponibilidad){
        this.modelo=modelo;
        this.año=año;
        this.placa=placa;
        this.tarifa=tarifa;
        this.disponibilidad=disponibilidad;
    }
    public Vehiculo(String modelo,String año,String placa, String tarifa, String disponibilidad, Date fechaInicio, Date fechaFinalizacion, String ubicacion, String tipoVehiculo){
        this.modelo=modelo;
        this.año=año;
        this.placa=placa;
        this.tarifa=tarifa;
        this.disponibilidad=disponibilidad;
        this.fechaInicio=fechaInicio;
        this.fechaFinalizacion=fechaFinalizacion;
        this.ubicacion=ubicacion;
        this.tipoVehiculo=tipoVehiculo;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getAño(){
        return this.año;
    }
    
    public void setAño(String año){
        this.año = año;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getTarifa(){
        return this.tarifa;
    }
    
    public void setTarifa(String tarifa){
        this.tarifa = tarifa;
    }
    
    public String getDisponibilidad(){
        return this.disponibilidad;
    }
    
    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    public Date getFechaInicio(){
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFinalizacion(){
        return this.fechaFinalizacion;
    }
    
    public void setFechaFinalizacion(Date fechaFinalizacion){
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    public String getUbicacion(){
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public String getTipoVehiculo(){
        return this.tipoVehiculo;
    }
    
    public void setTipoVehiculo(String tipoVehiculo){
        this.tipoVehiculo = tipoVehiculo;
    }
    public void buscarVehiculo(){
        System.out.println("Ingrese una fecha de inicio, de finalizacion, la ubicacion y el tipo de vehiculo: ");
        String teclado="";
        Scanner entrada= new Scanner(System.in);
        teclado = entrada.nextLine();
        
    }

}//End class