package works.weave.socks.cart.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(IllegalAccessException ex, HttpServletResponse response) {
        response.setStatus(400);
        return ex.getMessage();
    }
}
