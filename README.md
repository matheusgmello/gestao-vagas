# Gestão de Vagas 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

O projeto simula a funcionalidade de um sistema de gestão de empresas, vagas e aplicações de vagas, semelhante ao LinkedIn, que foi construído utilizando Spring Boot, abrangendo persistência, segurança e autorização.
Candidatos podem se candidatar e buscar vagas de emprego ou optar por criar sua própria empresa, liberando a opção de publicação de novas vagas.

Dentro do projeto, há documentação realizada com Swagger e métricas monitoradas com Prometheus e Grafana.

## Tabela de Conteúdos

- [Instalação](#instalação)
- [Utilização](#utilização)
- [Rotas](#rotas)
- [Monitoramento](#monitoramento)
- [Web](#web)
- [Tecnologias](#tecnologias)
- [Práticas-Adotadas](#práticas-adotadas)
- [Autor](#conecte-se-comigo)


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

## Rotas

- Acesse a documentação dos Endpoints através do Swagger `http://localhost:8080/swagger-ui.html`.

## Monitoramento

- Para monitorar métricas do sistema acesse o Prometheus em `http://localhost:9090`.
- Para acessar o Grafana e ver as dashboards, acesse `http://localhost:3000`.

## Web
Para acessar a versão web do projeto: [Gestão-Vagas](https://github.com/matheusgmello/front-gestao-vagas), é necessário baixar a versão web e realizar o passo a passo.

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

## Práticas Adotadas

- [Qualidade de Código](https://aws.amazon.com/pt/what-is/code-quality/)
- [UseCases](https://www.avellareduarte.com.br/fases-projetos/conceituacao/demandas-do-publico/pesquisas-de-usuarios-atividades-2/casos-de-uso-use-cases/)
- [JSON Web Token](https://www.treinaweb.com.br/blog/o-que-e-jwt)

## Conecte-se comigo
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/matheusgmello)
