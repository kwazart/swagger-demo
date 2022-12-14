/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import org.openapitools.model.Application;
import org.openapitools.model.ApplicationRequest;
import org.openapitools.model.ApplicationStatusTransitionRequest;
import org.openapitools.model.ErrorData;
import org.openapitools.model.Transition;
import org.openapitools.model.UpdateApplicationCrossSaleRequest;
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
@Tag(name = "Application", description = "the application API")
@RequestMapping("${openapi.open.base-path:/api/v1}")
public interface ApplicationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /application : Метод получения списка заявок по параметрам
     *
     * @param applicationRequest  (optional)
     * @return Успешное выполнение (status code 200)
     *         or Ошибка (status code 400)
     */
    @Operation(
        operationId = "addApplication",
        summary = "Метод получения списка заявок по параметрам",
        tags = { "Application" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешное выполнение", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Application.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Ошибка", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorData.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/application",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<Application>> addApplication(
        @Parameter(name = "ApplicationRequest", description = "") @Valid @RequestBody(required = false) ApplicationRequest applicationRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : \"г. Москва, ул. Островитянова, д.10, кв.101\", \"clientFullName\" : \"Иванов Иван Иванович\", \"companyName\" : \"ООО Ромашка\", \"callCounter\" : 2, \"productName\" : \"Вклад\", \"startMeetingTime\" : \"08:00\", \"phone\" : \"749567356665\", \"meetingDate\" : \"02.11.2022\", \"endMeetingTime\" : \"840\", \"comment\" : \"Буду до 13%00\", \"applicationId\" : 34786, \"isGroup\" : false, \"status\" : \"CONTACT_CLIENT\", \"applications\" : [ null, null ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /application/{applicationId}/cross-sale : Метод обновления кросс-продаж в заявке (по идентификатору)
     *
     * @param applicationId Номер заявки (required)
     * @param updateApplicationCrossSaleRequest  (optional)
     * @return Успешное выполнение (status code 200)
     *         or Ошибка (status code 400)
     */
    @Operation(
        operationId = "updateApplicationCrossSale",
        summary = "Метод обновления кросс-продаж в заявке (по идентификатору)",
        tags = { "Application" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешное выполнение"),
            @ApiResponse(responseCode = "400", description = "Ошибка", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorData.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/application/{applicationId}/cross-sale",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateApplicationCrossSale(
        @Parameter(name = "applicationId", description = "Номер заявки", required = true) @PathVariable("applicationId") Integer applicationId,
        @Parameter(name = "UpdateApplicationCrossSaleRequest", description = "") @Valid @RequestBody(required = false) UpdateApplicationCrossSaleRequest updateApplicationCrossSaleRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /application/{applicationId}/photo : Метод добавления/обновления фото в заявке (по идентификатору)
     *
     * @param applicationId Номер заявки (required)
     * @param contentLength Суммарный объем передаваемых данных (required)
     * @param contentType Тип содержимого с границей (required)
     * @param contentDisposition Инструкция (в данном случае указывает на загрузку файла) (required)
     * @return Успешное выполнение (status code 200)
     *         or Ошибка (status code 400)
     */
    @Operation(
        operationId = "updateApplicationPhoto",
        summary = "Метод добавления/обновления фото в заявке (по идентификатору)",
        tags = { "Application" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешное выполнение"),
            @ApiResponse(responseCode = "400", description = "Ошибка", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorData.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/application/{applicationId}/photo",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> updateApplicationPhoto(
        @Parameter(name = "applicationId", description = "Номер заявки", required = true) @PathVariable("applicationId") Integer applicationId,
        @NotNull @Parameter(name = "Content-Length", description = "Суммарный объем передаваемых данных", required = true) @RequestHeader(value = "Content-Length", required = true) Integer contentLength,
        @NotNull @Parameter(name = "Content-Type", description = "Тип содержимого с границей", required = true) @RequestHeader(value = "Content-Type", required = true) String contentType,
        @NotNull @Parameter(name = "Content-Disposition", description = "Инструкция (в данном случае указывает на загрузку файла)", required = true) @RequestHeader(value = "Content-Disposition", required = true) Boolean contentDisposition
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /application/{applicationId}/status-transition : Метод обновления статуса заявки по идентификатору
     *
     * @param applicationId Номер заявки (required)
     * @param applicationStatusTransitionRequest  (optional)
     * @return Данные об изменении статуса и сопутствующих параметров (status code 200)
     *         or Ошибка (status code 400)
     */
    @Operation(
        operationId = "updateApplicationStatus",
        summary = "Метод обновления статуса заявки по идентификатору",
        tags = { "Application" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Данные об изменении статуса и сопутствующих параметров", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Transition.class))
            }),
            @ApiResponse(responseCode = "400", description = "Ошибка", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorData.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/application/{applicationId}/status-transition",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Transition> updateApplicationStatus(
        @Parameter(name = "applicationId", description = "Номер заявки", required = true) @PathVariable("applicationId") Integer applicationId,
        @Parameter(name = "ApplicationStatusTransitionRequest", description = "") @Valid @RequestBody(required = false) ApplicationStatusTransitionRequest applicationStatusTransitionRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"endGroupStatus\" : \"CONTACT_CLIENT\", \"comment\" : \"Любые дополнения\", \"callCounter\" : 2, \"endStatus\" : \"CONTACT_CLIENT\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
