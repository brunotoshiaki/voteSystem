package br.com.bruno.system.entrypoint.controller.request;


import jakarta.validation.constraints.NotBlank;

public record ScheduleRequest(@NotBlank(message = "The full name is required.") String name) {

}
