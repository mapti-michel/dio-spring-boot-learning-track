# Budgeting API — Spring AI

Projeto desenvolvido como desafio final do módulo **Spring AI**, da trilha DIO Spring Boot.

A aplicação tem como objetivo oferecer um assistente financeiro capaz de interpretar solicitações em linguagem natural, registrar transações e consultar despesas por categoria, utilizando recursos de Inteligência Artificial.

## Objetivo

Desenvolver uma API REST que integre Spring AI a um fluxo de processamento de áudio e ferramentas de manipulação de transações financeiras.

### Fluxo da aplicação

1. Receber um arquivo de áudio enviado pelo usuário.
2. Converter o áudio em texto utilizando um modelo de transcrição.
3. Interpretar a solicitação por meio de um modelo de linguagem.
4. Acionar ferramentas (*Tool Calling*) para registrar ou consultar transações.
5. Gerar uma resposta em áudio no formato MP3.

## Tecnologias utilizadas

- Java 25
- Spring Boot 4.0.5
- Spring AI 2.0.0-M4
- Gradle
- Spring Data JPA
- MySQL
- Docker Compose
- JUnit 5
- OpenAI API

## Arquitetura

O projeto utiliza uma organização em camadas:

| Camada | Responsabilidade |
|---|---|
| `domain` | Entidades e regras de negócio |
| `application` | Casos de uso da aplicação |
| `infrastructure` | Persistência, configurações e integrações externas |

Essa separação favorece a organização, a manutenção e a evolução do código.

## Funcionalidades

- Registro de transações financeiras.
- Consulta de transações por categoria.
- Validação dos dados no domínio.
- Integração com modelos de IA para transcrição, interpretação e geração de áudio.
- Utilização de ferramentas (*Tool Calling*) para executar operações financeiras.

## Categorias de transações

Atualmente, o domínio contempla as seguintes categorias:

- `GROCERIES` — compras e mercado.
- `PHARMA` — farmácia.
- `AUTO` — despesas automotivas.

## Configuração do ambiente

### Pré-requisitos

- JDK 25.
- Docker Desktop.
- Chave de API da OpenAI.

### Variável de ambiente

Configure a variável `OPENAI_API_KEY` com uma chave válida da API OpenAI.

Não compartilhe ou versione chaves de API no repositório.

### Banco de dados

O projeto utiliza MySQL, configurado por meio do arquivo `compose.yml`.

Para iniciar o banco de dados:

```bash
docker compose up -d
```

A aplicação utiliza a porta `3307` do host para acessar o MySQL.

## Testes

Os testes de domínio verificam a criação de transações e a rejeição de dados inválidos.

Para executar especificamente os testes de `TransactionTest`:

```powershell
.\gradlew.bat test --tests "dio.budgeting.domain.TransactionTest"
```

### Validações implementadas

- Criação de transação com dados válidos.
- Rejeição de descrição vazia.
- Rejeição de categoria nula.

**Resultado da execução:** 3 testes executados, sem falhas.

## Evolução do projeto

O projeto permanece em evolução, com possibilidades de aprimoramento na cobertura de testes, validação dos fluxos de integração e expansão das funcionalidades.

## Autor

Desenvolvido por **Michel Pereira** como parte dos estudos e desafios práticos da trilha de desenvolvimento Java e Spring Boot da DIO.

