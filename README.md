# A nice tour - API

## Descrição
Este é um projeto de back-end/API para um sistema de planejamento de viagem. O sistema permite que os usuários planejem suas viagens, confirmação de lugares e datas, envio de convite por e-mail aos amigos que estarão presente, dados sobre as experiências turísticas que serão realizadas.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para criação de aplicações Java.
- **Flyway**: Ferramenta para versionamento e migração do banco de dados.
- **Maven**: Gerenciador de dependências e automação de build.
- **H2**: Banco de dados em memória para desenvolvimento e testes.
- **Lombok**: Biblioteca que simplifica a escrita de código Java.

## Instalação e Configuração
### Pré-requisitos
- Java JDK 21
- Maven 3.6+

### Passos para Instalação
1. Clone o repositório:
    ```bash
    git clone https://github.com/ranieriiuri/anicetourproject-api.git
    cd seu-repositorio
    ```

2. Compile e empacote o projeto:
    ```bash
    mvn clean package
    ```

3. Verifique se o arquivo JAR foi criado no diretório `target`:
    ```bash
    ls target/
    ```
    Você deve ver um arquivo chamado `anicetour-api-0.0.1-SNAPSHOT.jar` na lista. Se não, verifique as mensagens de erro no comando `mvn clean package`.

4. Execute a aplicação:
    ```bash
    java -jar target/anicetour-api-0.0.1-SNAPSHOT.jar
    ```

## Uso
A aplicação estará disponível em `http://localhost:8080`. Você pode acessar a documentação da API (em breve) em `http://localhost:8080/swagger-ui.html`.

## Estrutura do Projeto
- **src/main/java**: Código fonte principal.
- **src/main/resources**: Arquivos de configuração e scripts de banco de dados.
- **src/test**: Código de testes.

## Contribuição
1. Faça um fork do projeto.
2. Crie um branch para sua feature: `git checkout -b minha-feature`.
3. Faça commit das suas alterações: `git commit -am 'Adiciona nova feature'`.
4. Faça push para o branch: `git push origin minha-feature`.
5. Envie um Pull Request.

## Features Faltantes
Veja a lista de features a serem desenvolvidas no arquivo [extraFeatures.md](./extraFeatures.md).

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.
