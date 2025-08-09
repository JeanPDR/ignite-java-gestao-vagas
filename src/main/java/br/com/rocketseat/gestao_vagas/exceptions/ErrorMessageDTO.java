package br.com.rocketseat.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {

    public ErrorMessageDTO(String field, String message) {
        this.field = field;
        this.message = message;
    }

     private String field;
     private String message;
     
}
