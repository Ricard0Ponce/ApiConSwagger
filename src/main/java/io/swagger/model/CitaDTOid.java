package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CitaDTOid
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-03T04:47:25.291100373Z[GMT]")


public class CitaDTOid   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("matricula")
  private Object matricula = null;

  @JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("hora")
  private String hora = null;

  @JsonProperty("idPsiquiatra")
  private Long idPsiquiatra = null;

  @JsonProperty("motivoCita")
  private String motivoCita = null;

  @JsonProperty("discapacidad")
  private Boolean discapacidad = null;

  @JsonProperty("comunidadIndigena")
  private Boolean comunidadIndigena = null;

  @JsonProperty("migrante")
  private Boolean migrante = null;

  public CitaDTOid id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CitaDTOid matricula(Object matricula) {
    this.matricula = matricula;
    return this;
  }

  /**
   * Get matricula
   * @return matricula
   **/
  @Schema(description = "")
  
    public Object getMatricula() {
    return matricula;
  }

  public void setMatricula(Object matricula) {
    this.matricula = matricula;
  }

  public CitaDTOid fecha(String fecha) {
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

  public CitaDTOid hora(String hora) {
    this.hora = hora;
    return this;
  }

  /**
   * Get hora
   * @return hora
   **/
  @Schema(description = "")
  
    public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public CitaDTOid idPsiquiatra(Long idPsiquiatra) {
    this.idPsiquiatra = idPsiquiatra;
    return this;
  }

  /**
   * Get idPsiquiatra
   * @return idPsiquiatra
   **/
  @Schema(description = "")
  
    public Long getIdPsiquiatra() {
    return idPsiquiatra;
  }

  public void setIdPsiquiatra(Long idPsiquiatra) {
    this.idPsiquiatra = idPsiquiatra;
  }

  public CitaDTOid motivoCita(String motivoCita) {
    this.motivoCita = motivoCita;
    return this;
  }

  /**
   * Get motivoCita
   * @return motivoCita
   **/
  @Schema(description = "")
  
    public String getMotivoCita() {
    return motivoCita;
  }

  public void setMotivoCita(String motivoCita) {
    this.motivoCita = motivoCita;
  }

  public CitaDTOid discapacidad(Boolean discapacidad) {
    this.discapacidad = discapacidad;
    return this;
  }

  /**
   * Get discapacidad
   * @return discapacidad
   **/
  @Schema(description = "")
  
    public Boolean isDiscapacidad() {
    return discapacidad;
  }

  public void setDiscapacidad(Boolean discapacidad) {
    this.discapacidad = discapacidad;
  }

  public CitaDTOid comunidadIndigena(Boolean comunidadIndigena) {
    this.comunidadIndigena = comunidadIndigena;
    return this;
  }

  /**
   * Get comunidadIndigena
   * @return comunidadIndigena
   **/
  @Schema(description = "")
  
    public Boolean isComunidadIndigena() {
    return comunidadIndigena;
  }

  public void setComunidadIndigena(Boolean comunidadIndigena) {
    this.comunidadIndigena = comunidadIndigena;
  }

  public CitaDTOid migrante(Boolean migrante) {
    this.migrante = migrante;
    return this;
  }

  /**
   * Get migrante
   * @return migrante
   **/
  @Schema(description = "")
  
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
    CitaDTOid citaDTOid = (CitaDTOid) o;
    return Objects.equals(this.id, citaDTOid.id) &&
        Objects.equals(this.matricula, citaDTOid.matricula) &&
        Objects.equals(this.fecha, citaDTOid.fecha) &&
        Objects.equals(this.hora, citaDTOid.hora) &&
        Objects.equals(this.idPsiquiatra, citaDTOid.idPsiquiatra) &&
        Objects.equals(this.motivoCita, citaDTOid.motivoCita) &&
        Objects.equals(this.discapacidad, citaDTOid.discapacidad) &&
        Objects.equals(this.comunidadIndigena, citaDTOid.comunidadIndigena) &&
        Objects.equals(this.migrante, citaDTOid.migrante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matricula, fecha, hora, idPsiquiatra, motivoCita, discapacidad, comunidadIndigena, migrante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitaDTOid {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    idPsiquiatra: ").append(toIndentedString(idPsiquiatra)).append("\n");
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
