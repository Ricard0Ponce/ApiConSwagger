package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdCitasBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-03T04:47:25.291100373Z[GMT]")


public class IdCitasBody   {
  @JsonProperty("matricula")
  private Integer matricula = null;

  @JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("hora")
  private String hora = null;

  @JsonProperty("motivoCita")
  private String motivoCita = null;

  @JsonProperty("discapacidad")
  private Boolean discapacidad = null;

  @JsonProperty("comunidadIndigena")
  private Boolean comunidadIndigena = null;

  @JsonProperty("migrante")
  private Boolean migrante = null;

  public IdCitasBody matricula(Integer matricula) {
    this.matricula = matricula;
    return this;
  }

  /**
   * Matricula del Alumno
   * minimum: 100000
   * maximum: 900000
   * @return matricula
   **/
  @Schema(description = "Matricula del Alumno")
  
  @Min(100000) @Max(900000)   public Integer getMatricula() {
    return matricula;
  }

  public void setMatricula(Integer matricula) {
    this.matricula = matricula;
  }

  public IdCitasBody fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
   **/
  @Schema(description = "")
  
  @Pattern(regexp="^\\d{2}/\\d{2}/\\d{4}$")   public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public IdCitasBody hora(String hora) {
    this.hora = hora;
    return this;
  }

  /**
   * Hora de la cita (opcional)
   * @return hora
   **/
  @Schema(description = "Hora de la cita (opcional)")
  
    public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public IdCitasBody motivoCita(String motivoCita) {
    this.motivoCita = motivoCita;
    return this;
  }

  /**
   * Motivo de la cita (tipo string)
   * @return motivoCita
   **/
  @Schema(description = "Motivo de la cita (tipo string)")
  
    public String getMotivoCita() {
    return motivoCita;
  }

  public void setMotivoCita(String motivoCita) {
    this.motivoCita = motivoCita;
  }

  public IdCitasBody discapacidad(Boolean discapacidad) {
    this.discapacidad = discapacidad;
    return this;
  }

  /**
   * Indica si el alumno tiene discapacidad (true o false)
   * @return discapacidad
   **/
  @Schema(description = "Indica si el alumno tiene discapacidad (true o false)")
  
    public Boolean isDiscapacidad() {
    return discapacidad;
  }

  public void setDiscapacidad(Boolean discapacidad) {
    this.discapacidad = discapacidad;
  }

  public IdCitasBody comunidadIndigena(Boolean comunidadIndigena) {
    this.comunidadIndigena = comunidadIndigena;
    return this;
  }

  /**
   * Indica si el alumno pertenece a una comunidad indigena (true o false)
   * @return comunidadIndigena
   **/
  @Schema(description = "Indica si el alumno pertenece a una comunidad indigena (true o false)")
  
    public Boolean isComunidadIndigena() {
    return comunidadIndigena;
  }

  public void setComunidadIndigena(Boolean comunidadIndigena) {
    this.comunidadIndigena = comunidadIndigena;
  }

  public IdCitasBody migrante(Boolean migrante) {
    this.migrante = migrante;
    return this;
  }

  /**
   * Indica si el alumno es migrante (true o false)
   * @return migrante
   **/
  @Schema(description = "Indica si el alumno es migrante (true o false)")
  
    public Boolean isMigrante() {
    return migrante;
  }

  public void setMigrante(Boolean migrante) {
    this.migrante = migrante;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdCitasBody idCitasBody = (IdCitasBody) o;
    return Objects.equals(this.matricula, idCitasBody.matricula) &&
        Objects.equals(this.fecha, idCitasBody.fecha) &&
        Objects.equals(this.hora, idCitasBody.hora) &&
        Objects.equals(this.motivoCita, idCitasBody.motivoCita) &&
        Objects.equals(this.discapacidad, idCitasBody.discapacidad) &&
        Objects.equals(this.comunidadIndigena, idCitasBody.comunidadIndigena) &&
        Objects.equals(this.migrante, idCitasBody.migrante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matricula, fecha, hora, motivoCita, discapacidad, comunidadIndigena, migrante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdCitasBody {\n");
    
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    motivoCita: ").append(toIndentedString(motivoCita)).append("\n");
    sb.append("    discapacidad: ").append(toIndentedString(discapacidad)).append("\n");
    sb.append("    comunidadIndigena: ").append(toIndentedString(comunidadIndigena)).append("\n");
    sb.append("    migrante: ").append(toIndentedString(migrante)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
