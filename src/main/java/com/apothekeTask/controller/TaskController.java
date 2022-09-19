package com.apothekeTask.controller;

import com.apothekeTask.dto.MessageDTO;
import org.springframework.context.MessageSource;
import com.apothekeTask.model.SearchBody;
import com.apothekeTask.services.RepoService;
import com.apothekeTask.util.annotation.CustomerNameValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/")
public class TaskController {

    private RepoService repoService;

    @Autowired
    public TaskController(RepoService repoService) {
        this.repoService = repoService;
    }

    @Autowired
    private MessageSource messageSource;

    @PostMapping("/customSearch")
    public ResponseEntity<?> searchByRequest(@RequestBody @CustomerNameValidation List<SearchBody> searchBody) {
        return repoService.customSearch(searchBody);
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public MessageDTO handleValidationException(MethodArgumentNotValidException ex) {
        Locale locale = LocaleContextHolder.getLocale();
        String code = ex.getBindingResult().getFieldError().getDefaultMessage();
        return new MessageDTO(messageSource.getMessage(code, null, locale));
    }

}
