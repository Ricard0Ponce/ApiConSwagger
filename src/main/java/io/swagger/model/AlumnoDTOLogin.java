package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AlumnoDTOLogin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-03T04:47:25.291100373Z[GMT]")


public class AlumnoDTOLogin   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("apellidoPaterno")
  private String apellidoPaterno = null;

  @JsonProperty("apellidoMaterno")
  private String apellidoMaterno = null;

  public AlumnoDTOLogin id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * minimum: 100000
   * maximum: 900000
   * @return id
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
  @Min(100000) @Max(900000)   public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AlumnoDTOLogin nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public AlumnoDTOLogin apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

  /**
   * Get apellidoPaterno
   * @return apellidoPaterno
   **/
  @Schema(description = "")
  
    public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public AlumnoDTOLogin apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

  /**
   * Get apellidoMaterno
   * @return apellidoMaterno
   **/
  @Schema(description = "")
  
    public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlumnoDTOLogin alumnoDTOLogin = (AlumnoDTOLogin) o;
    return Objects.equals(this.id, alumnoDTOLogin.id) &&
        Objects.equals(this.nombre, alumnoDTOLogin.nombre) &&
        Objects.equals(this.apellidoPaterno, alumnoDTOLogin.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, alumnoDTOLogin.apellidoMaterno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, apellidoPaterno, apellidoMaterno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlumnoDTOLogin {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
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
