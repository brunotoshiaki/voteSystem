package br.com.bruno.system.entrypoint.controller.request;


import javax.validation.constraints.NotBlank;


public record AssociateRequest(@NotBlank String name) {


}