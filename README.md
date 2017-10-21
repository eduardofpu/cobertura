# xy-inc | Backend Maker

Este projeto tem como objetivo fornecer uma interface amigável para criação rápida de serviços REST.


## Detalhes de Implementação
Neste tópico serão informados os softwares e frameworks, que foram utilizados e merecem destaque.
### Banco de Dados
* MongoDB versão 3.4.2.
### Backend
* Spring (Boot, MVC, Data);
* EmbedMongo e Flapdoodle (Instâncias e gestão do MongoDB embarcado);
* Maven.
### Frontend
* AngularJS;
* Bootstrap;

## Instalação/Execução
### Requisitos
* JDK 1.8
* Cliente git

### Procedimento de Instalação e Execução (Linux/OSx)
1. Baiar o código fonte:
        
        git clone https://github.com/edussm/xy-inc.git
2. Acessar a pasta do projeto:

        cd xy-inc
3. Compilar e efetuar testes unitários
    
        ./mvnw test
4. Executar
    
        ./mvnw spring-boot:run
ou
    
        ./mvnw clean package
        java -jar target/backend-maker-1.0.0-SNAPSHOT.jar
		
5. Executar a cobertura	

        ./mvn cobertura:cobertura
		
6. Executar site	

        ./mvn site

xy-inc\target\site\cobertura\index.html.  	
		
		
7. Acessar a interface no endereço: http://localhost:8080
        
        usuário: user
        senha: password
