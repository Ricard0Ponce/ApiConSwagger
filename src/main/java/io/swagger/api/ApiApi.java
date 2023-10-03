/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.47).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Alumno;
import io.swagger.model.AlumnoDTOLogin;
import io.swagger.model.AlumnoDTOid;
import io.swagger.model.AlumnosLoginBody;
import io.swagger.model.Cita;
import io.swagger.model.CitaDTOid;
import io.swagger.model.Error204Alumno;
import io.swagger.model.Error204Cita;
import io.swagger.model.Error204Psiquiatra;
import io.swagger.model.Error403AlumnoID;
import io.swagger.model.Error404AlumnoID;
import io.swagger.model.Error404Cita;
import io.swagger.model.Error404CitaID;
import io.swagger.model.Error404Psiquiatra;
import io.swagger.model.Error500Alumno;
import io.swagger.model.Error500Cita;
import io.swagger.model.Error500Psiquiatra;
import io.swagger.model.IdCitasBody;
import io.swagger.model.Model204CitaDelete;
import io.swagger.model.PsiquiatraDTO;
import io.swagger.model.PsiquiatrasLoginBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-03T04:47:25.291100373Z[GMT]")
@Validated
public interface ApiApi {

    @Operation(summary = "Crear un nuevo alumno", description = "Crea un alumno", tags = { "Alumnos" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlumnoDTOLogin.class))),

            @ApiResponse(responseCode = "204", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error204Alumno.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Alumno.class))) })
    @RequestMapping(value = "/api/alumnos", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<AlumnoDTOLogin> createAlumno(
            @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Alumno body);

    @Operation(summary = "Crear una nueva cita", description = "", tags = { "Citas" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = IdCitasBody.class))),

            @ApiResponse(responseCode = "404", description = "No Content", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404Cita.class))) })
    @RequestMapping(value = "/api/alumnos/{id}/citas", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<IdCitasBody> createCita(
            @DecimalMin("100000") @DecimalMax("900000") @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema(allowableValues = {
                    "900000", "100000" })) @PathVariable("id") String id,
            @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody IdCitasBody body);

    @Operation(summary = "Eliminar cita por id", description = "", tags = { "Citas" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "No Content", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Model204CitaDelete.class))),

            @ApiResponse(responseCode = "404", description = "No Content", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404CitaID.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Cita.class))) })
    @RequestMapping(value = "/api/alumnos/{id}/citas/{id}", produces = {
            "application/json" }, method = RequestMethod.DELETE)
    ResponseEntity<Model204CitaDelete> deleteCitaById(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Long id);

    @Operation(summary = "Regresa la lista de alumnos", description = "Regresa todos los Alumnos", tags = { "Alumnos" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AlumnoDTOid.class)))),

            @ApiResponse(responseCode = "204", description = "Ok No Content", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error204Alumno.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Alumno.class))) })
    @RequestMapping(value = "/api/alumnos", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<List<AlumnoDTOid>> getAllAlumnos();

    @Operation(summary = "Regresa todas las citas", description = "", tags = { "Citas" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Cita.class)))),

            @ApiResponse(responseCode = "204", description = "No se encontraron citas", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error204Cita.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Cita.class))) })
    @RequestMapping(value = "/api/citas", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<List<Cita>> getAllCita();

    @Operation(summary = "Regresa todos los psiquiatras", description = "", tags = { "Psiquiatra" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PsiquiatraDTO.class)))),

            @ApiResponse(responseCode = "204", description = "No se encontraron Psiquiatras", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error204Psiquiatra.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Psiquiatra.class))) })
    @RequestMapping(value = "/api/psiquiatras", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<List<PsiquiatraDTO>> getAllPsiquiatras();

    @Operation(summary = "Regresa un Alumno por id", description = "Regresa al alumno con el id especificado.", tags = {
            "Alumnos" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlumnoDTOid.class))),

            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404AlumnoID.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Alumno.class))) })
    @RequestMapping(value = "/api/alumnos/{id}", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<AlumnoDTOid> getAlumnoById(
            @DecimalMin("100000") @DecimalMax("900000") @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema(allowableValues = {
                    "100000", "900000" })) @PathVariable("id") String id);

    @Operation(summary = "Regresa cita por id", description = "", tags = { "Citas" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CitaDTOid.class))),

            @ApiResponse(responseCode = "404", description = "No se encontro la cita", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404CitaID.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Cita.class))) })
    @RequestMapping(value = "/api/alumnos/{id}/citas/{id}", produces = {
            "application/json" }, method = RequestMethod.GET)
    ResponseEntity<CitaDTOid> getCitaById(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Long id);

    @Operation(summary = "Regresa un psicologo registrado", description = "Obtiene un objeto especificando matricula y password. La respuesta es un psicologo con sus atributos", tags = {
            "Psiquiatra" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PsiquiatraDTO.class))),

            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404Psiquiatra.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Psiquiatra.class))) })
    @RequestMapping(value = "/api/psiquiatras/login", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<PsiquiatraDTO> getLoginPsicologo(
            @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody PsiquiatrasLoginBody body);

    @Operation(summary = "Regresa un Psiquiatra por id", description = "", tags = { "Psiquiatra" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PsiquiatraDTO.class))),

            @ApiResponse(responseCode = "404", description = "No se encontro la cita", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404Psiquiatra.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Psiquiatra.class))) })
    @RequestMapping(value = "/api/psiquiatras/{id}", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<PsiquiatraDTO> getPsiquiatraById(
            @DecimalMin("100000") @DecimalMax("900000") @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema(allowableValues = {
                    "100000", "900000" })) @PathVariable("id") String id);

    @Operation(summary = "Iniciar sesión de un alumno", description = "Permite a un alumno iniciar sesión proporcionando su matrícula y contraseña.", tags = {
            "Alumnos" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlumnoDTOLogin.class))),

            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error403AlumnoID.class))),

            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404AlumnoID.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Alumno.class))) })
    @RequestMapping(value = "/api/alumnos/login", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<AlumnoDTOLogin> loginAlumno(
            @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody AlumnosLoginBody body);

    @Operation(summary = "Actualiza una cita por id", description = "", tags = { "Citas" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cita.class))),

            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error404CitaID.class))),

            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error500Cita.class))) })
    @RequestMapping(value = "/api/alumnos/{id}/citas/{id}", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.PUT)
    ResponseEntity<Cita> updateCitaById(
            @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("id") Long id,
            @Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Cita body);

}