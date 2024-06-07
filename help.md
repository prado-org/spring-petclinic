# Help

## Comandos Maven

```bash
./mvnw compile

./mvnw spring-boot:run
You can then access the Petclinic at http://localhost:8080

./mvnw spring-javaformat:apply

```

## Prompt para o Copilot

@workspace como adicionar o campo email ao model da tela Add Owner?
    Owner.java
    createOrUpdateOwnerForm.html 

@workspace onde está o arquivo createOrUpdateOwnerForm.html

@workspace como adicionar o campo email no banco de dados?

@workspace qual arquivo eu devo adicionar a alteração do banco de dados adicionando o campo email?
    no arquivo data.sql, selecionar o insert do owner e adicionar o email


@workspace adicionar o campo email na tela Owner Information
@workspace onde está localizado o arquivo ownerDetails.html?

@workspace onde está o método responsável por salvar um novo owner?



## Como acessar o banco de dados h2

```
como adicionar a propriedade spring.h2.console.enabled=true
http://localhost:8080/h2-console
    Pegar o a url jdbc no log
    jdbc:h2:mem:3b3b3b3b-3b3b-3b3b-3b3b-3b3b3b3b3b3b
    ALTER TABLE owners ADD COLUMN email VARCHAR(255);
Quando parar a aplicação, a coluna será removida porque o banco de dados é em memória
    adicionar no arquivo schema.sql - ALTER TABLE owners ADD COLUMN email VARCHAR(255);
    adicionar no arquivo data.sql - adicionar o email para os owners
```
