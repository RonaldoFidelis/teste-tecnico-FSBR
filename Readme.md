<h1 align=center> Teste-Tecnico Desenvolvedor Java Jr</h1>

<br>

[Utilizando CRUD.webm](https://github.com/user-attachments/assets/cd7a9ad3-23dc-4ae3-9a6d-423fd7bd37b1)

<br>

## Objetivo

- Você foi designado para desenvolver uma aplicação web que gerencia um cadastro de clientes. A aplicação deve permitir realizar operações básicas de CRUD (Create, Read, Update e Delete) e integrar-se com o serviço ViaCEP para consulta de endereços via CEP. A seguir, estão os requisitos da aplicação.

## Requisitos do Teste:

### Funcionalidades

- **Create**:Permita que o usuário cadastre um novo cliente através de um formulário. O formulário deve incluir um campo para CEP.
  
- **Read**:Exiba uma lista de todos os clientes cadastrados em uma tabela, sendo possível consultar por nome (ou parte dele).
  
- **Update**:Permita que o usuário edite as informações de um cliente existente.
  
- **Delete**:Permita que o usuário remova um cliente da lista.

### Integração com ViaCEP

- Ao inserir o CEP, a aplicação deve consultar o serviço ViaCEP e preencher automaticamente os campos de endereço, bairro, cidade e estado.

### Interface

- Utilize JavaServer Faces (JSF) para a construção da interface do usuário.
- As páginas devem ser responsivas e de fácil navegação.

> **Obs.**: Não precisa se preocupar com a estética, apenas o suficiente para conseguir usar a aplicação.

### Persistência

- Utilize Java Persistence API (JPA) para gerenciar a persistência dos dados.
- A aplicação deve se conectar a um banco de dados H2 em memória para armazenamento dos dados.

### Validações

- Implemente validações básicas nos campos do formulário, garantindo que todos os dados obrigatórios sejam preenchidos e que o email seja único.

### Documentação

- Inclua um README explicando como configurar e executar a aplicação, além de uma breve descrição das funcionalidades implementadas.

## Descrição das funcionalidades :

- **Cadastro de Clientes**: Permite o registro de novos clientes, coletando informações como nome, e-mail, telefone, endereço, bairro, cidade e estado.

- **Edição de Clientes**: Os usuários podem selecionar um cliente existente para editar suas informações. Após a edição, as informações são atualizadas no banco de dados.

- **Exclusão de Clientes**: Os clientes podem ser removidos do sistema. Após a exclusão, a lista de clientes é atualizada automaticamente para refletir a remoção.

- **Listagem de Clientes**: O sistema exibe uma lista de todos os clientes cadastrados, permitindo a filtragem e busca por nome ou e-mail.

- **Validação de Dados**: Valida se os campos obrigatórios estão preenchidos antes do envio do formulário. Caso contrário, mensagens de erro são exibidas ao usuário.

- **Integração com ViaCep**: Utiliza a API do ViaCep para preencher automaticamente os campos de endereço com base no CEP informado, facilitando o cadastro de clientes.
Aqui está uma versão aprimorada das instruções:

## Como executar o projeto:

### Pré-requisitos
- Java 8 ou superior
- Banco de dados H2
- Apache Tomcat 9.0 ou superior

### Passos para execução:

1. **Instale o Banco de Dados H2:** Baixe e configure o H2 conforme a documentação oficial.

2. **Instale o Apache Tomcat:**
   - Baixe o Tomcat 9.0 ou superior.
   - Extraia o conteúdo do arquivo baixado em um diretório de sua preferência.

3. **Copie o arquivo `.war`:**
   - Coloque o arquivo `.war` do projeto na pasta `webapps` dentro do diretório de instalação do Tomcat.

4. **Inicie o Tomcat:**
   - Acesse o diretório `bin` dentro da pasta do Tomcat e execute o comando de inicialização adequado para o seu sistema operacional:
     - No Windows:
       ```bash
       startup.bat
       ```
       ou
        ```bash
       .\startup.bat
       ```
     - No Linux/Mac:
       ```bash
       ./startup.sh
       ```

5. **Acesse o Projeto:**
   - Abra um navegador e acesse o projeto pelo link: [http://localhost:8080/nome-do-arquivo-war](http://localhost:8080/nome-do-arquivo-war).

## 🚀 Tecnologias utilizadas:

* **[Java 8](https://www.java.com/pt-BR/download/help/java8_pt-br.html)** 
* **[JSF](https://www.ibm.com/docs/pt-br/was-nd/8.5.5?topic=files-javaserver-faces)**
* **[JPA](https://www.ibm.com/docs/pt-br/was/8.5.5?topic=SSEQTP_8.5.5/com.ibm.websphere.nd.multiplatform.doc/ae/cejb_persistence.htm)**
* **[JDBC](https://www.ibm.com/docs/bg/i/7.3?topic=java-jdbc)**
* **[H2 DATABASE](https://www.h2database.com/html/main.html)**
* **[HIBERNATES](https://hibernate.org/)**
* **[API ViaCEP](https://viacep.com.br/)**
* **[Tomcat](https://tomcat.apache.org/)**

## 📝 Maiores aprendizados:

- Configurar ambiente de desenvolvimento Java Web com JSF e Maven, gerenciar depências e Persistência de dados com JPA.

## Contato:

- **Contatos:**
    - <a href="mailto:ronaldofidelis.ti@gmail.com" target="_blank">E-mail</a>
    - <a href="https://github.com/RonaldoFidelis" target="_blank">GitHub</a>
