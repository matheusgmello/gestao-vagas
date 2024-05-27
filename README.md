# Gestão Vagas 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

A API simula a funcionalidade de um sistema de controle de empresas, vagas e aplicações, utilizando os principais pacotes do Spring Boot para persistência, segurança e autorização. Usuários autenticados podem buscar e se candidatar a vagas de empresas parceiras, enquanto usuários com privilégios de ADMIN podem cadastrar novas empresas e vagas na API.

Utilizei Swagger para realizar a documentação completa dos endpoints e JWT para garantir a segurança dos endpoints.

## Tabela de Conteúdos

- [Instalação](#instalação)
- [Utilização](#utilização)
- [Endpoints](#api-endpoints)
- [Monitoramento](#monitoramento)
- [Tecnologias](#tecnologias)
- [Conecte-se](#conecte-se-comigo)


## Instalação

**Clone o projeto e acesse a pasta**

```bash
git@github.com:matheusgmello/gestao-vagas.git
```
- Instale as dependências com o Maven.
- Configure as variáveis de ambiente no arquivo `application.properties`.
- Suba o Docker `docker compose up -d`

## Utilização

- Rode a aplicação com o Maven.
- A API vai estar disponivel em `http://localhost:8080`

## API Endpoints

- Acesse a documentação dos Endpoints através do Swagger `http://localhost:8080/swagger-ui.html`.

## Monitoramento

- Para monitorar métricas do sistema acesse o Prometheus em `http://localhost:9090`.
- Para acessar o Grafana e ver as dashboards, acesse `http://localhost:3000`.

## Tecnologias e Práticas adotadas

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

### Práticas Adotadas

- [Qualidade de Código](https://aws.amazon.com/pt/what-is/code-quality/)
- [UseCases](https://www.avellareduarte.com.br/fases-projetos/conceituacao/demandas-do-publico/pesquisas-de-usuarios-atividades-2/casos-de-uso-use-cases/)
- [JSON Web Token](https://www.treinaweb.com.br/blog/o-que-e-jwt)

## Conecte-se comigo
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/matheusgmello)
[![Reddit](https://img.shields.io/badge/Reddit-%23FF4500.svg?style=for-the-badge&logo=Reddit&logoColor=white)](https://www.reddit.com/user/math7zw)
[![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)](https://github.com/matheusgmello/)