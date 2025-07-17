package br.com.matheus.front_gestao_vagas.modules.company.dto;

import lombok.Data;

@Data
public class CreateCompanyDTO {
    
    private String username;
    private String email;
    private String website;
    private String description;
    private String name;
    private String password;
}
