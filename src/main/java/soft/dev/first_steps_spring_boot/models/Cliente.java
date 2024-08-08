package soft.dev.first_steps_spring_boot.models;

import java.util.UUID;

public class Cliente extends Persona {
  private UUID codigoCliente;
  private int ci;
  private int nit;

  public Cliente(UUID id, String nombre, String apellidoPaterno,
                 String apellidoMaterno, String genero, Rol tipo,
                 UUID codigoCliente, int ci, int nit) {
    super(id, nombre, apellidoPaterno, apellidoMaterno, genero, tipo);
    this.codigoCliente = codigoCliente;
    this.ci = ci;
    this.nit = nit;
  }

  public UUID getCodigoCliente() {
    return codigoCliente;
  }

  public void setCodigoCliente(UUID codigoCliente) {
    this.codigoCliente = codigoCliente;
  }

  public int getCi() {
    return ci;
  }

  public void setCi(int ci) {
    this.ci = ci;
  }

  public int getNit() {
    return nit;
  }

  public void setNit(int nit) {
    this.nit = nit;
  }
}
