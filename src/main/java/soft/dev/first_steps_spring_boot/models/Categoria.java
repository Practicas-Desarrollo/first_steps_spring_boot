package soft.dev.first_steps_spring_boot.models;

import java.util.UUID;

public class Categoria {
  private UUID id;
  private String nombre;
  private int garantia;

  public Categoria(UUID id, String nombre, int garantia) {
    this.id = id;
    this.nombre = nombre;
    this.garantia = garantia;
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

  public int getGarantia() {
    return garantia;
  }

  public void setGarantia(int garantia) {
    this.garantia = garantia;
  }
}
