# SAMPLE-APP

 Aplicação com CRUD básico de Cidade e Cliente
 
# Arquitetura
 - Java utilizando Spring Boot
 - REST
 - H2 DB em memória
 - Swagger
 
# Executando a aplicação
### Pré-requisitos
 - [Java (JDK8)](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) - Deve estar instalado e configurado para compilar e rodar a aplicação
 - [Maven](https://maven.apache.org/install.html)
 
### Subindo o projeto
 
 Após baixar o projeto em uma pasta no computador e de ter instalado os pré-requisitos, abra um terminal e vá até a pasta raiz do projeto, em seguida execute:
 
 	mvn clean install
 
 O comando acima gerará o artefato para que suba a aplicação localmente, após a conclusão do processo acima, execute o comando abaixo para iniciar a aplicação:
 
 	java -jar target/sample-app-0.0.1-SNAPSHOT.jar
 	
 Se tudo ocorrer bem você já poderá acessar a documentação feita com o swagger no endereço:
 
 http://localhost:8080/swagger-ui.html
 
 
