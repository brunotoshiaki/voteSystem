package br.com.bruno.system.entrypoint.controller.exception;

import java.time.LocalDateTime;

public record ErrorModel(int statusCode, LocalDateTime timestamp, String message) {

}
