package br.com.matheusgmello.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

  private UUID id;
  private String name;

  @NotBlank
  @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
  private String username;

  @Email(message = "O campo [email] deve conter um endereço válido")
  private String email;

  @Length(min = 10, max = 100, message = "A senha deve conter no mínimo 10 caracteres")
  private String password;
  private String description;
  private String curriculum;
}