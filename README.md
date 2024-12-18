<h1 align="center">
  TODO List
</h1>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

O projeto foi elaborado [nesse vídeo](https://youtu.be/IjProDV001o).

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Tarefa
- 
$ Metodo Post http://localhost:8080/todos

 ![Post-Todo ](https://github.com/user-attachments/assets/521ac654-0a4c-42e3-b739-98b284ae8237)

```

- Listar Tarefas
```
$  Metodo Get http://localhost:8080/todos)
![Get-Todo ](https://github.com/user-attachments/assets/ea4a5436-64e8-47bb-b220-14116f1f833a)


```

- Atualizar Tarefa
```
$ Metodo Put http://localhost:8080/todos/1
![Put-Tudo](https://github.com/user-attachments/assets/1607af3d-96c2-432f-a8b4-a69015c55065)


```

- Remover Tarefa
```
Metodo Delete http://localhost:8080/todos/1
![Delete-Todo ](https://github.com/user-attachments/assets/5330e54e-059d-48b8-883b-c2ad86ab826d)

```
