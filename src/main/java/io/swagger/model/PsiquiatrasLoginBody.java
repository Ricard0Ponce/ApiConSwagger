package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PsiquiatrasLoginBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-03T04:47:25.291100373Z[GMT]")


public class PsiquiatrasLoginBody   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("password")
  private String password = null;

  public PsiquiatrasLoginBody id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * minimum: 100000
   * maximum: 900000
   * @return id
   **/
  @Schema(description = "")
  
  @Min(100000) @Max(900000)   public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PsiquiatrasLoginBody password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PsiquiatrasLoginBody psiquiatrasLoginBody = (PsiquiatrasLoginBody) o;
    return Objects.equals(this.id, psiquiatrasLoginBody.id) &&
        Objects.equals(this.password, psiquiatrasLoginBody.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsiquiatrasLoginBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
