package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AlumnoDTOid
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-03T04:47:25.291100373Z[GMT]")


public class AlumnoDTOid   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nombres")
  private String nombres = null;

  @JsonProperty("apellidoPaterno")
  private String apellidoPaterno = null;

  @JsonProperty("apellidoMaterno")
  private String apellidoMaterno = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("genero")
  private String genero = null;

  @JsonProperty("telefonoMovil")
  private String telefonoMovil = null;

  public AlumnoDTOid id(Integer id) {
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

  public AlumnoDTOid nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }

  /**
   * Get nombres
   * @return nombres
   **/
  @Schema(description = "")
  
    public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public AlumnoDTOid apellidoPaterno(String apellidoPaterno) {
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

  public AlumnoDTOid apellidoMaterno(String apellidoMaterno) {
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

  public AlumnoDTOid email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AlumnoDTOid genero(String genero) {
    this.genero = genero;
    return this;
  }

  /**
   * Get genero
   * @return genero
   **/
  @Schema(description = "")
  
    public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public AlumnoDTOid telefonoMovil(String telefonoMovil) {
    this.telefonoMovil = telefonoMovil;
    return this;
  }

  /**
   * Get telefonoMovil
   * @return telefonoMovil
   **/
  @Schema(description = "")
  
    public String getTelefonoMovil() {
    return telefonoMovil;
  }

  public void setTelefonoMovil(String telefonoMovil) {
    this.telefonoMovil = telefonoMovil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlumnoDTOid alumnoDTOid = (AlumnoDTOid) o;
    return Objects.equals(this.id, alumnoDTOid.id) &&
        Objects.equals(this.nombres, alumnoDTOid.nombres) &&
        Objects.equals(this.apellidoPaterno, alumnoDTOid.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, alumnoDTOid.apellidoMaterno) &&
        Objects.equals(this.email, alumnoDTOid.email) &&
        Objects.equals(this.genero, alumnoDTOid.genero) &&
        Objects.equals(this.telefonoMovil, alumnoDTOid.telefonoMovil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombres, apellidoPaterno, apellidoMaterno, email, genero, telefonoMovil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlumnoDTOid {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    genero: ").append(toIndentedString(genero)).append("\n");
    sb.append("    telefonoMovil: ").append(toIndentedString(telefonoMovil)).append("\n");
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
