<div>
  <table>
  <tr>
    <td><img src="images/cover.png" alt="Home page do projeto"></td>
  </table>
  </tr>
</div>

# Gestão de Vagas 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

Este projeto é um sistema de gestão de empresas e vagas, inspirado no LinkedIn. <br>
Permite que candidatos e empresas se cadastrem. Empresas podem publicar vagas, e candidatos podem aplicar suas candidaturas.<br>
Com uma interface interativa, você pode consultar vagas, perfis, empresas e acompanhar suas aplicações.


## Tabela de Conteúdos

- [Instalação](#instalação)
- [Rotas](#rotas)
- [Monitoramento](#monitoramento)
- [Web](#web)
- [Tecnologias](#tecnologias)


## Instalação

**Clone o projeto e acesse a pasta**

```bash
git@github.com:matheusgmello/gestao-vagas.git
```
- Instale as dependências com o Maven.
- Configure as variáveis de ambiente no arquivo `application.properties`.
- Suba o Docker `docker compose up -d`


- Rode a aplicação com o Maven.
- A API vai estar disponivel em `http://localhost:8080`

## Rotas

- Acesse a documentação dos Endpoints através do Swagger `http://localhost:8080/swagger-ui.html`.
- Mais [detalhes](https://github.com/matheusgmello/gestao-vagas/blob/main/backend/README.md)
## Monitoramento

- Para monitorar métricas do sistema acesse o Prometheus em `http://localhost:9090`.
- Para acessar o Grafana e ver as dashboards, acesse `http://localhost:3000`.

## Web
- Instale as dependências com o Maven.
- Suba a aplicação com o Maven via terminal (`mvn spring-boot:run`)
- Acesse (`http://localhost:8082`)

- Mais [detalhes](https://github.com/matheusgmello/gestao-vagas/blob/main/frontend/README.md)

## Tecnologias

- [Java](https://jdk.java.net/17/)
- [Spring Actuator](https://www.baeldung.com/spring-boot-actuators)
- [Spring Validation](https://spring.io/guides/gs/validating-form-input)
- [Spring Security](https://spring.io/projects/spring-security)
- [Docker](https://www.docker.com/)
- [PostgreSQL](https://www.postgresql.org/download/)
- [Swagger](https://swagger.io/)
- [Mockito](https://site.mockito.org/)
- [JUnit](https://junit.org/junit5/)
- [SonarQube](https://www.sonarsource.com/products/sonarqube/)
- [Jaccoco](https://www.eclemma.org/jacoco/)
- [Prometheus](https://prometheus.io/)
- [Grafana](https://grafana.com/)

## Conecte-se comigo
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/matheusgmello)
