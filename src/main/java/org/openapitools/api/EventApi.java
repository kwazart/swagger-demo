/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ErrorData;
import org.openapitools.model.Event;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
@Validated
@Tag(name = "Event", description = "the event API")
@RequestMapping("${openapi.open.base-path:/api/v1}")
public interface EventApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /event : Метод передачи события из МП МБ в АС МБ
     *
     * @param event  (optional)
     * @return Успешное выполнение (status code 200)
     *         or Ошибка (status code 400)
     */
    @Operation(
        operationId = "createEvent",
        summary = "Метод передачи события из МП МБ в АС МБ",
        tags = { "Event" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешное выполнение"),
            @ApiResponse(responseCode = "400", description = "Ошибка", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorData.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/event",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createEvent(
        @Parameter(name = "Event", description = "") @Valid @RequestBody(required = false) Event event
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
