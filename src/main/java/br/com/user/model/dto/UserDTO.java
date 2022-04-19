package br.com.user.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
public class UserDTO {
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private Date birthDate;

    @NotBlank
    private String email;

    @NotBlank
    private String phone;

    @NotBlank
    private String cep;

    @NotBlank
    private String street;

    @NotBlank
    private String number;

    @NotBlank
    private String complement;

    @NotBlank
    private String district;

    @NotBlank
    private String city;

    @NotBlank
    private String state;
}
