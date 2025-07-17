package br.com.matheus.front_gestao_vagas.modules.candidate.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.matheus.front_gestao_vagas.modules.candidate.dto.CreateCandidateDTO;

@Service
public class CreateCandidateService {

    @Value("${host.api.gestao.vagas}")
    private String hostAPIGestaoVagas;
    
    public void execute(CreateCandidateDTO createCandidateDTO) {
        
            RestTemplate rt = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<CreateCandidateDTO> request = new HttpEntity<>(createCandidateDTO ,headers);

            var url = hostAPIGestaoVagas.concat("/candidate/");

            var result = rt.postForObject(url, request, String.class);
            System.out.println(result);
    }
}
