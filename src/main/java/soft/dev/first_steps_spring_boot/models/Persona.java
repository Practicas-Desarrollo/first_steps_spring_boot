package soft.dev.first_steps_spring_boot.models;

import java.util.UUID;

public class Persona {
  private UUID id;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String genero;
  private Rol tipo;

  public Persona(UUID id, String nombre, String apellidoPaterno,
                 String apellidoMaterno, String genero, Rol tipo) {
    this.id = id;
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.genero = genero;
    this.tipo = tipo;
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

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public Rol getTipo() {
    return tipo;
  }

  public void setTipo(Rol tipo) {
    this.tipo = tipo;
  }
}
