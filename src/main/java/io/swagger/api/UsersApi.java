/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
import io.swagger.model.UserInput;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-21T22:00:36.997790207Z[GMT]")
@Validated
public interface UsersApi {

    @Operation(summary = "Create a new user", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "User created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<User> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UserInput body);


    @Operation(summary = "Delete a user", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "User deleted"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "ID of the user to delete", required=true, schema=@Schema()) @PathVariable("userId") Long userId);


    @Operation(summary = "Get a user by ID", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "User retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserById(@Parameter(in = ParameterIn.PATH, description = "ID of the user to retrieve", required=true, schema=@Schema()) @PathVariable("userId") Long userId);


    @Operation(summary = "Get a list of users", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of users", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> getUsers();


    @Operation(summary = "Update a user", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "User updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<User> updateUser(@Parameter(in = ParameterIn.PATH, description = "ID of the user to update", required=true, schema=@Schema()) @PathVariable("userId") Long userId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UserInput body);

}

