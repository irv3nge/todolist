# ToDo List API - Gerenciador de Tarefas

## Descrição

Este projeto é uma aplicação de **gerenciamento de tarefas (To-Do List)** desenvolvida com **Spring Boot**, **JPA** e **H2 Database**. A API oferece uma interface simples para adicionar, listar, marcar como concluída e excluir tarefas. Utilizando o H2, que é um banco de dados em memória, a aplicação é perfeita para ambientes de desenvolvimento e testes.

## Funcionalidades

A API oferece os seguintes endpoints:

- **GET /api/tarefas**: Lista todas as tarefas.
- **POST /api/tarefas**: Adiciona uma nova tarefa.
- **PUT /api/tarefas/{id}/concluir**: Marca uma tarefa como concluída.
- **DELETE /api/tarefas/{id}**: Exclui uma tarefa.

## Tecnologias Usadas

- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **Spring Data JPA**: Para persistência de dados no banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para armazenamento durante o desenvolvimento.
- **Postman/Insomnia**: Ferramentas para testar os endpoints da API.

## Pré-Requisitos

Antes de rodar o projeto, você precisa ter o seguinte instalado:

- **Java 11 ou superior**: JDK para rodar a aplicação.
- **Maven**: Ferramenta de gerenciamento de dependências (caso use Maven).
- **IDE**: Uma IDE de sua escolha (IntelliJ, Eclipse, etc.).

## Como Rodar o Projeto

### 1. Clone o Repositório

```bash
git clone https://github.com/irv3nge/todolist.git
cd todolist-api
```

### 2. Instale as Dependências e Execute o Projeto

Se estiver utilizando o Maven, execute o seguinte comando para rodar o projeto:

```bash
mvn spring-boot:run
```

Isso iniciará o servidor na porta `8080` por padrão.

### 3. Acessando o Console do H2

Para visualizar o banco de dados em memória, acesse o **console do H2** no navegador:

```bash
http://localhost:8080/h2-console
```

- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`

## Testando os Endpoints

Você pode testar os seguintes endpoints utilizando **Postman** ou **Insomnia**.

### 1. **GET /api/tarefas** - Listar todas as tarefas

- **Método**: GET
- **URL**: `http://localhost:8080/api/tarefas`

### 2. **POST /api/tarefas** - Adicionar uma nova tarefa

- **Método**: POST
- **URL**: `http://localhost:8080/api/tarefas`
- **Body (JSON)**:

```json
{
  "descricao": "Estudar Spring Boot",
  "status": "PENDENTE"
}
```

### 3. **PUT /api/tarefas/{id}/concluir** - Marcar uma tarefa como concluída

- **Método**: PUT
- **URL**: `http://localhost:8080/api/tarefas/{id}/concluir`
  - Substitua `{id}` pelo ID da tarefa que você deseja marcar como concluída.

### 4. **DELETE /api/tarefas/{id}** - Excluir uma tarefa

- **Método**: DELETE
- **URL**: `http://localhost:8080/api/tarefas/{id}`
  - Substitua `{id}` pelo ID da tarefa que você deseja excluir.

## Estrutura do Projeto

A estrutura do projeto está organizada da seguinte maneira:

```bash
todolist-api/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   └── br/
 │   │   │       └── com/
 │   │   │           └── todolist/
 │   │   │               ├── controller/          # Controladores da API
 │   │   │               ├── domain/              # Enums e classes de domínio
 │   │   │               ├── model/               # Entidades JPA
 │   │   │               ├── repository/          # Interfaces de repositório
 │   │   │               └── Service/             # Lógica de negócios
 │   │   └── resources/
 │   │       └── application.properties            # Configurações do Spring Boot
 └── pom.xml                                         # Dependências do Maven
```

## Contribuições

Se você deseja contribuir para este projeto, siga as etapas abaixo:

1. Faça um **fork** do repositório.
2. Crie uma **branch** para sua alteração.
3. Realize as modificações desejadas.
4. Envie um **pull request**.

## Licença

Este projeto está licenciado sob a **MIT License**. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Esse modelo de README está mais estruturado, com cabeçalhos claros, uso de listas e blocos de código formatados para tornar a leitura mais fluida e agradável. Ele também foi organizado para facilitar a navegação através das seções, como instruções para rodar o projeto, testar os endpoints e entender a estrutura do código. 

Sinta-se à vontade para fazer ajustes conforme necessário, mas já deve estar visualmente mais atraente e informativo para quem for consultar o repositório.
