<h1 align=center> Teste-Tecnico Desenvolvedor Java Jr</h1>

<br>

[testecrud.webm](https://github.com/user-attachments/assets/a6253cc9-b1c1-4442-a961-170b23422c1b)


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

# Como executar o projeto

## Pré-requisitos
- Java 8 ou superior
- Banco de dados H2
- Apache Tomcat 9.0 ou superior

## Passos para execução

### 1. **Instale o Banco de Dados H2**:
   - Baixe e configure o H2 conforme a [documentação oficial](https://h2database.com/html/main.html).

### 2. **Instale o Apache Tomcat**:
   - Baixe o Tomcat 9.0 ou superior.
   - Extraia o conteúdo do arquivo baixado em um diretório de sua preferência.

### 3. **Abrir o Eclipse**:
   - Abra o Eclipse no seu workspace.

### 4. **Adicionar o Apache Tomcat ao Eclipse**:
   1. No menu superior, vá até **Window** > **Preferences**.
   2. No painel à esquerda, expanda **Server** e selecione **Runtime Environments**.
   3. Clique em **Add External Server...** (Adicionar novo servidor).
   4. Na lista, selecione **Apache Tomcat v9.0** (ou a versão que você baixou) e clique em **Next**.
   5. Em **Tomcat installation directory**, clique em **Browse...** e selecione o diretório onde você extraiu o Tomcat.
   6. Clique em **Finish** para concluir a configuração.

### 5. **Definir Tomcat como servidor de execução**:
   1. Na tela **Servers** (normalmente localizada na parte inferior do Eclipse), clique com o botão direito e selecione **New** > **Server**.
   2. Selecione a versão do Tomcat que você configurou (exemplo: **Apache Tomcat v9.0**).
   3. Clique em **Next**.
   4. Selecione o seu workspace ou o projeto que você deseja executar no Tomcat e clique em **Finish**.

### 6. **Instale o Java 8 ou superior**:
   - O projeto foi desenvolvido com o Java 8.

### 7. **Git Clone**:
   - Faça um **git clone** do projeto em uma pasta de sua preferência.

```bash
git clone https://github.com/RonaldoFidelis/teste-tecnico-FSBR.git
```

### 8. **Importar o Projeto Maven no Eclipse**:
   1. Abra o Eclipse.
   2. Selecione ou crie um novo workspace.
   3. Vá para o menu **File** > **Import**.
   4. Na janela de importação, expanda a opção **Maven**.
   5. Selecione **Existing Maven Projects** e clique em **Next**.
   6. Clique em **Browse...** e selecione a pasta onde você clonou ou salvou o projeto Maven.
   7. O Eclipse deve automaticamente encontrar o arquivo `pom.xml` do projeto Maven.
   8. Selecione o `pom.xml` e clique em **Finish**.

### 9. **Rodar o Projeto**:
   1. Vá até a pasta `src > webapp > index.xhtml`.
   2. Clique com o botão direito em cima do arquivo **index.xhtml**.
   3. Selecione **Run As** > **Run on Server**.

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
