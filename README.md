# Spring Data JPA -- Projeto Decola Tech - DIO + AVANADE

Este projeto é um exemplo de aplicação Spring Boot que utiliza Spring Data JPA para realizar operações de CRUD (Create, Read, Update, Delete) em uma entidade `User`. A aplicação está configurada para usar um banco de dados H2 em memória, o que facilita o desenvolvimento e testes.

## Estrutura do Projeto

### Entidade User

A entidade `User` representa um usuário no sistema. Ela é mapeada para a tabela `users` no banco de dados. A classe `User` possui os seguintes campos:

- `userId`: Identificador único do usuário.  
- `username`: Nome de usuário.  
- `name`: Nome completo do usuário.  
- `password`: Senha do usuário.  

### Repositório UserRepository

O repositório `UserRepository` é uma interface que estende `JpaRepository`, fornecendo métodos padrão para operações de CRUD na entidade `User`.

### Classe StartApp

A classe `StartApp` é um `CommandLineRunner` que é executado quando a aplicação é iniciada. Ela cria um novo usuário, salva no banco de dados e imprime todos os usuários armazenados.
