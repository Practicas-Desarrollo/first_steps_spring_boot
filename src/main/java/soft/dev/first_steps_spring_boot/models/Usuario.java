package soft.dev.first_steps_spring_boot.models;

import java.util.UUID;

public class Empleado extends Persona {
  private String username;
  private String password;
  private int estado;

  public Empleado(UUID id, String nombre, String apellidoPaterno,
                  String apellidoMaterno, String genero, Rol tipo,
                  String username, String password, int estado) {
    super(id, nombre, apellidoPaterno,
            apellidoMaterno, genero, tipo);
    this.username = username;
    this.password = password;
    this.estado = estado;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getEstado() {
    return this.estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
}
