package guru.springframework.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e){
        List<String> errors = new ArrayList<>(e.getConstraintViolations().size());

        e.getConstraintViolations().forEach(constraintViolation -> {
            errors.add(constraintViolation.getPropertyPath() + " : " + e.getMessage());
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<List> handleBindException(BindException ex){

       return new ResponseEntity(ex.getAllErrors(), HttpStatus.BAD_REQUEST);
    }

    //    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<List> validationErrorHandler(MethodArgumentNotValidException e) {
//
//
//        List<String> errores = new ArrayList<>();
//
//        List<FieldError> fieldErrors = e.getBindingResult().getAllErrors().stream()
//                .map(FieldError.class::cast)
//                .collect(Collectors.toList());
//
//        fieldErrors.forEach(fieldError -> {
//
//            errores.add( String.format("Bad Request %s : %s : Rejected value : ---> %s"
//                    ,fieldError.getField()
//                    ,fieldError.getDefaultMessage()
//                    ,fieldError.getRejectedValue()));
//        });
//
//        return new ResponseEntity<>(errores, HttpStatus.BAD_REQUEST);
//    }

}
