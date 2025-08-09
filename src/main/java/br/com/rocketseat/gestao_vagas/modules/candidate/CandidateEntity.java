package br.com.rocketseat.gestao_vagas.modules.candidate;

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

  @NotBlank()
  @Pattern(regexp= "\\S+", message= "O Campo [username] não pode contém espaços em branco")
  private String username;

  @Email(message= "O Campo [email] dever ser um email válido")
  private String email;

  @Length(min= 6, message= "O Campo(senha) deve ter no mínimo 6 caracteres")
  private String password;
  private String description;
  private String curriculum;
}
