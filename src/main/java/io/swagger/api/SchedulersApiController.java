package io.swagger.api;

import io.swagger.model.Scheduler;
import io.swagger.model.SchedulerInput;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-21T22:00:36.997790207Z[GMT]")
@RestController
public class SchedulersApiController implements SchedulersApi {

    private static final Logger log = LoggerFactory.getLogger(SchedulersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SchedulersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Scheduler> createScheduler(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SchedulerInput body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Scheduler>(objectMapper.readValue("{\n  \"date\" : \"2023-08-18T00:00:00.000+00:00\",\n  \"id\" : 1,\n  \"message\" : {\n    \"userSender\" : {\n      \"name\" : \"Rodrigo Manrique da Penha\",\n      \"id\" : 1,\n      \"birthDate\" : \"2000-07-04T00:00:00.000+00:00\",\n      \"email\" : \"rodrigomanriquep@gmail.com\",\n      \"status\" : \"ACTIVE\"\n    },\n    \"date\" : \"2023-08-18T00:00:00.000+00:00\",\n    \"subject\" : \"Important Announcement\",\n    \"id\" : 1,\n    \"body\" : \"This is an important message.\"\n  },\n  \"user\" : {\n    \"name\" : \"Rodrigo Manrique da Penha\",\n    \"id\" : 1,\n    \"birthDate\" : \"2000-07-04T00:00:00.000+00:00\",\n    \"email\" : \"rodrigomanriquep@gmail.com\",\n    \"status\" : \"ACTIVE\"\n  },\n  \"status\" : \"PENDING\"\n}", Scheduler.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Scheduler>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Scheduler>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Scheduler>> getSchedulers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Scheduler>>(objectMapper.readValue("[ {\n  \"date\" : \"2023-08-18T00:00:00.000+00:00\",\n  \"id\" : 1,\n  \"message\" : {\n    \"userSender\" : {\n      \"name\" : \"Rodrigo Manrique da Penha\",\n      \"id\" : 1,\n      \"birthDate\" : \"2000-07-04T00:00:00.000+00:00\",\n      \"email\" : \"rodrigomanriquep@gmail.com\",\n      \"status\" : \"ACTIVE\"\n    },\n    \"date\" : \"2023-08-18T00:00:00.000+00:00\",\n    \"subject\" : \"Important Announcement\",\n    \"id\" : 1,\n    \"body\" : \"This is an important message.\"\n  },\n  \"user\" : {\n    \"name\" : \"Rodrigo Manrique da Penha\",\n    \"id\" : 1,\n    \"birthDate\" : \"2000-07-04T00:00:00.000+00:00\",\n    \"email\" : \"rodrigomanriquep@gmail.com\",\n    \"status\" : \"ACTIVE\"\n  },\n  \"status\" : \"PENDING\"\n}, {\n  \"date\" : \"2023-08-18T00:00:00.000+00:00\",\n  \"id\" : 1,\n  \"message\" : {\n    \"userSender\" : {\n      \"name\" : \"Rodrigo Manrique da Penha\",\n      \"id\" : 1,\n      \"birthDate\" : \"2000-07-04T00:00:00.000+00:00\",\n      \"email\" : \"rodrigomanriquep@gmail.com\",\n      \"status\" : \"ACTIVE\"\n    },\n    \"date\" : \"2023-08-18T00:00:00.000+00:00\",\n    \"subject\" : \"Important Announcement\",\n    \"id\" : 1,\n    \"body\" : \"This is an important message.\"\n  },\n  \"user\" : {\n    \"name\" : \"Rodrigo Manrique da Penha\",\n    \"id\" : 1,\n    \"birthDate\" : \"2000-07-04T00:00:00.000+00:00\",\n    \"email\" : \"rodrigomanriquep@gmail.com\",\n    \"status\" : \"ACTIVE\"\n  },\n  \"status\" : \"PENDING\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Scheduler>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Scheduler>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
