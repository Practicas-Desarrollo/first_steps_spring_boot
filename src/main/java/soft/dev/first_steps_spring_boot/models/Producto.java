package soft.dev.first_steps_spring_boot.models;

import java.util.UUID;

public class Producto {
  private UUID id;
  private String nombre;
  private Double precio;
  private int estado;
  private int cantidad;
  private Categoria categoria;

  public Producto(UUID id, String nombre, Double precio,
                  int estado, int cantidad, Categoria categoria) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.estado = estado;
    this.cantidad = cantidad;
    this.categoria = categoria;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }
}
