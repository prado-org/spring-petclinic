# Help

## Comandos Maven

```bash
./mvnw compile

./mvnw spring-boot:run

./mvnw spring-javaformat:apply

```

## Prompt para o Copilot

@workspace como adicionar o campo email ao model da tela Add Owner?
    Owner.java - src\main\java\org\springframework\samples\petclinic\owner\Owner.java

	@Column(name = "email")
	@NotBlank
	private String email;

	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


@workspace onde está o arquivo createOrUpdateOwnerForm.html
    createOrUpdateOwnerForm.html - src\main\resources\templates\owners\createOrUpdateOwnerForm.html
	<input
           th:replace="~{fragments/inputField :: input ('Email', 'email', 'text')}" />


-------------------------------------------------------------------------------------------
Se retornar esse erro -> Formatting violations found in the following files:
[ERROR]  * C:\Repos\GitHub\prado-org\spring-petclinic\src\main\java\org\springframework\samples\petclinic\owner\Owner.java
Executar esse commando -> ./mvnw spring-javaformat:apply
-------------------------------------------------------------------------------------------
	

@workspace como adicionar o campo email no banco de dados?

@workspace em qual arquivo eu configuro o perfil do banco de dados

@workspace em qual arquivo fica essas configurações spring.profiles.active

@workspace qual arquivo eu devo adicionar a alteração do banco de dados adicionando o campo email?
    no arquivo data.sql, selecionar o insert do owner e adicionar o email
    ALTER TABLE owners ADD COLUMN email VARCHAR(255);


gerar emails de exemplo, e adicione no script de insert
	src\main\resources\db\h2\data.sql


-------------------------------------------------------------------------------------------

@workspace onde se encontra a tela "Owner Information" que é visualizada após o cadastro de um novo owner

Adicione o campo email
	src\main\resources\templates\owners\ownerDetails.html

-------------------------------------------------------------------------------------------

como acessar o banco de dados h2
como adicionar a propriedade spring.h2.console.enabled=true
http://localhost:8080/h2-console
    Pegar o a url jdbc no log
    jdbc:h2:mem:3b3b3b3b-3b3b-3b3b-3b3b-3b3b3b3b3b3b
    ALTER TABLE owners ADD COLUMN email VARCHAR(255);
Quando parar a aplicação, a coluna será removida porque o banco de dados é em memória
    adicionar no arquivo schema.sql - ALTER TABLE owners ADD COLUMN email VARCHAR(255);
    adicionar no arquivo data.sql - adicionar o email para os owners
