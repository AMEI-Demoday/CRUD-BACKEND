## Modo de Uso

Siga os passos abaixo para configurar e executar o projeto:

1. Baixe o arquivo do projeto e abra a sua IDE de preferência. Recomendamos o uso do IntelliJ IDEA.

<hr>

2. Abra o arquivo `application.properties` localizado na pasta do projeto. Configure as informações do seu banco de dados, incluindo o nome do banco, o usuário e a senha.

![image](https://github.com/AMEI-Demoday/CRUD-BACKEND/assets/124836944/03ae529f-7b99-40ed-9286-928078885ca0)

<hr>

3. Procure pelo arquivo `AmeitesteApplication.java`. Ele está localizado na pasta `src/main/java`. Ao encontrá-lo, clique no botão "Run" para iniciar a aplicação.

![image](https://github.com/AMEI-Demoday/CRUD-BACKEND/assets/124836944/d0317005-a5df-4f8f-8ea0-5828e1b152ee)

<hr>

5. Aguarde até que o console exiba a mensagem "Started AmeitesteApplication". Isso indica que a aplicação foi iniciada com sucesso.

![image](https://github.com/AMEI-Demoday/CRUD-BACKEND/assets/124836944/198a1720-f14d-4e77-81a4-dab7c2fe3a9a)

<hr>

7. Agora você pode acessar a aplicação através do seu navegador. Digite o endereço `http://localhost:8080/usuario/` na barra de URL e pressione Enter.

   ![image](https://github.com/AMEI-Demoday/CRUD-BACKEND/assets/124836944/93684dbd-0536-4b72-8fec-31dd00e9901f)

<hr>

Pronto! Agora você pode utilizar a aplicação e explorar suas funcionalidades. Certifique-se de ter configurado corretamente o banco de dados para evitar problemas de conexão.

## Backend

Para o desenvolvimento do backend, utilizamos Java em conjunto com o framework Spring Boot. O Spring Boot nos permite criar uma aplicação Java robusta e escalável, facilitando a integração com o banco de dados MySQL. Com o Spring Boot, implementamos as funcionalidades de CRUD (Create, Read, Update, Delete), permitindo cadastrar, deletar, listar e alterar registros no banco de dados.

## Comunicação Frontend-Backend

Para a comunicação entre o frontend e o backend, utilizamos o comando Fetch. Com o Fetch, podemos realizar requisições HTTP do frontend para o backend, permitindo o acesso e manipulação dos dados armazenados no banco de dados MySQL.

Estrutura de Arquivos

- `src/`: Diretório contendo os arquivos do backend em Java.

