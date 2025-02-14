ToDo List API - Gerenciador de Tarefas
Este projeto é uma aplicação de gerenciamento de tarefas (To-Do List) desenvolvida com Spring Boot, JPA e H2 Database. A API permite realizar operações básicas de CRUD (Create, Read, Update, Delete) em tarefas, como adicionar, listar, marcar como concluída e excluir tarefas.

Funcionalidades
A API oferece os seguintes endpoints:

GET /api/tarefas: Lista todas as tarefas.
POST /api/tarefas: Adiciona uma nova tarefa.
PUT /api/tarefas/{id}/concluir: Marca uma tarefa como concluída.
DELETE /api/tarefas/{id}: Exclui uma tarefa.
Tecnologias Usadas
Spring Boot: Framework principal para o backend.
Spring Data JPA: Para interação com o banco de dados.
H2 Database: Banco de dados em memória para desenvolvimento.
Postman/Insomnia: Ferramentas para testar os endpoints da API.
Pré-Requisitos
Antes de rodar o projeto, você precisa ter o seguinte instalado:

Java 11 ou superior: JDK para rodar a aplicação.
Maven: Ferramenta de gerenciamento de dependências (se você usar o Maven).
IDE: Uma IDE de sua escolha (IntelliJ, Eclipse, etc.).
Como Rodar o Projeto
Clone o repositório

bash
Copiar
git clone https://github.com/seu-usuario/todolist-api.git
cd todolist-api
Instale as dependências e execute o projeto

Se estiver usando Maven, você pode rodar o seguinte comando para instalar as dependências e iniciar a aplicação:

bash
Copiar
mvn spring-boot:run
Isso iniciará o servidor na porta 8080 (por padrão).

Acessando o console do H2

A aplicação configura o banco de dados H2 em memória. Para visualizar o banco de dados, acesse o console do H2 no navegador:

bash
Copiar
http://localhost:8080/h2-console
Use as seguintes configurações para conectar ao banco de dados:

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: password
Testando os Endpoints
Você pode testar os seguintes endpoints usando o Postman ou Insomnia.

1. GET /api/tarefas
Retorna todas as tarefas.

URL: http://localhost:8080/api/tarefas
Método: GET
2. POST /api/tarefas
Cria uma nova tarefa. Envie os dados da tarefa em formato JSON.

URL: http://localhost:8080/api/tarefas

Método: POST

Body (JSON):

json
Copiar
{
  "descricao": "Estudar Spring Boot",
  "status": "PENDENTE"
}
3. PUT /api/tarefas/{id}/concluir
Marca uma tarefa como concluída.

URL: http://localhost:8080/api/tarefas/{id}/concluir
Método: PUT
Parâmetro: Substitua {id} pelo ID da tarefa que você deseja marcar como concluída.
4. DELETE /api/tarefas/{id}
Exclui uma tarefa.

URL: http://localhost:8080/api/tarefas/{id}
Método: DELETE
Parâmetro: Substitua {id} pelo ID da tarefa que você deseja excluir.
Estrutura do Projeto
A estrutura do projeto é organizada da seguinte maneira:

bash
Copiar
todolist-api/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   └── br/
 │   │   │       └── com/
 │   │   │           └── todolist/
 │   │   │               ├── controller/          # Contém os controladores da API
 │   │   │               ├── domain/              # Enums e classes de domínio
 │   │   │               ├── model/               # Entidades JPA
 │   │   │               ├── repository/          # Interfaces de repositório
 │   │   │               └── Service/             # Lógica de negócios
 │   │   └── resources/
 │   │       └── application.properties            # Arquivo de configurações
 └── pom.xml                                         # Dependências e configuração do Maven
Contribuições
Se você deseja contribuir para este projeto, sinta-se à vontade para fazer um fork do repositório, criar uma branch com sua melhoria ou correção e enviar um pull request.
