package org.openapitools.api;

import org.openapitools.model.Application;
import org.openapitools.model.ApplicationRequest;
import org.openapitools.model.ApplicationStatusTransitionRequest;
import org.openapitools.model.ErrorData;
import org.openapitools.model.Transition;
import org.openapitools.model.UpdateApplicationCrossSaleRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-02T19:55:19.584688500+03:00[Europe/Moscow]")
@Controller
public class ApplicationApiController implements ApplicationApi {

    private final NativeWebRequest request;

    @Autowired
    public ApplicationApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
