package models;
import java.time.LocalDateTime;

public class Transaccion {

    private Integer id;
    private String nombre;
    private Double monto;
    private LocalDateTime fechaCreacion;
    private String tipoPago;
    private String categoria;
    private String Lugar;

    public Transaccion (){
    }

    public Transaccion(Integer id, String nombre, Double monto, LocalDateTime fechaCreacion, String tipoPago, String categoria, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
        this.fechaCreacion = fechaCreacion;
        this.tipoPago = tipoPago;
        this.categoria = categoria;
        Lugar = lugar;
    }

    //getters y stters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }
}
