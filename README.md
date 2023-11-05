# Projeto de Gestão Escolar + APIRest

Este é um projeto que visa desenvolver um sistema CRUD (Create, Read, Update, Delete) para gerenciar informações dos alunos de uma escola. O sistema armazenará dados essenciais, proporcionando uma visão abrangente das informações acadêmicas.


![Tela da aplicação](https://github.com/barbaradamasdev/springboot-postgresql-alunos/blob/master/image.png?raw=true)

## 🚀 Dados Armazenados
- *ID*: Identificador único do aluno.
- *Nome*: Nome completo do aluno.
- *Idade*: Idade do aluno.
- *Nota do Primeiro Semestre*: Desempenho acadêmico no primeiro semestre.
- *Nota do Segundo Semestre*: Desempenho acadêmico no segundo semestre.
- *Nome do Professor*: Nome do professor responsável.
- *Número da Sala*: Identificador da sala de aula.

```[
  {
    "idAluno": 0,
    "nome": "string",
    "idade": 0,
    "notaPrimeiroSemestre": 0,
    "notaSegundoSemestre": 0,
    "nomeProfessor": "string",
    "numeroSala": "string"
  }
]
```

### 👉🏼 Tecnologias utilizada:

- **Java 17**: Utilizado como a linguagem principal para o backend, oferecendo uma base sólida para o desenvolvimento do sistema.
- **Spring Boot 3**: Framework utilizado para simplificar o desenvolvimento de aplicativos Java, proporcionando recursos poderosos para a construção rápida de APIs REST eficientes.
- **PostgreSQL**: Banco de dados relacional escolhido para armazenar os dados dos alunos. Sua robustez e confiabilidade o tornam ideal para a gestão de informações críticas.
- **Spring Data JPA**: Uma parte integrante do ecossistema Spring, facilita a interação com bancos de dados relacionais, simplificando operações CRUD e consultas.
- **Swagger**: Implementado para documentar a API de forma clara e interativa, permitindo uma compreensão fácil dos endpoints disponíveis e facilitando testes.
- **Railway**: Utilizado para o deploy do projeto, oferecendo uma plataforma confiável e fácil de usar para hospedar aplicativos Java com facilidade de escalabilidade.

Estas tecnologias combinadas garantem um ambiente de desenvolvimento moderno e eficaz, proporcionando uma experiência sólida tanto para os desenvolvedores quanto para os usuários finais.

### 👩🏻‍💻 Endpoints
A API oferece uma variedade de endpoints para facilitar o gerenciamento de informações acadêmicas dos alunos. Aqui estão as operações disponíveis:

`GET` /alunos - Recupera a lista completa de alunos.

`GET` /alunos/id - Obtém detalhes específicos de um aluno com base no identificador único (id).

`POST` /alunos - Adiciona um novo aluno ao sistema.

`PUT` /alunos/id - Atualiza as informações de um aluno existente com base no identificador único (id).

`DELETE` /alunos/id - Remove um aluno específico com base no identificador único (id).

### 🚀 Deploy
- O deploy deste projeto está configurado para ser realizado no ambiente do Railway.

[https://springboot-postgresql-alunos-production.up.railway.app/swagger-ui/index.html#](https://springboot-postgresql-alunos-production.up.railway.app/swagger-ui/index.html#)


### 🚀🚀🚀 Desafios e Aprendizados na Implementação do Projeto
Durante a execução do meu primeiro projeto prático envolvendo o uso de uma API REST e banco de dados, enfrentei diversos desafios que proporcionaram um enriquecedor aprendizado.

Inicialmente, desenvolvi o projeto utilizando um banco de dados PostgreSQL local, obtendo sucesso, conforme evidenciado no video abaixo. Contudo, ao tentar fazer o deploy e transferir esse banco de dados para uma opção remota, encontrei obstáculos que não pude superar de maneira eficaz em tempo hábil para envio do desafio.

Diante desse cenário, optei por criar dois branches no repositório do projeto:

`Master Branch:`
- Configuração utilizando o PostgreSQL interno da plataforma Railway.
- No entanto, enfrentei dificuldades relacionadas a erros no protocolo HTTPS.

`Local-db-postgres Branch:`
- Utilizando o banco de dados local.
- Para facilitar a avaliação do projeto, segue alguns dos dados que utilizei:

```
[
  {
    "idAluno": "3ced60ae-7ebb-49e0-a0d1-585749125459",
    "nome": "Carlos Oliveira",
    "idade": 19,
    "notaPrimeiroSemestre": 88,
    "notaSegundoSemestre": 91.5,
    "nomeProfessor": "Mariana Souza",
    "numeroSala": "Sala 102"
  },
  {
    "idAluno": "322e0ad1-393c-4c38-837d-a87342f085a4",
    "nome": "Mariana Souza",
    "idade": 20,
    "notaPrimeiroSemestre": 95.2,
    "notaSegundoSemestre": 89.8,
    "nomeProfessor": "Rafael Pereira",
    "numeroSala": "Sala 103"
  },
  {
    "idAluno": "fc5773a2-832b-4ae9-be5a-a17f66e85dba",
    "nome": "Rafael Pereira",
    "idade": 22,
    "notaPrimeiroSemestre": 78.5,
    "notaSegundoSemestre": 85,
    "nomeProfessor": "Isabela Santos",
    "numeroSala": "Sala 104"
  }
]
```

![Tela do postgresql local](https://github.com/barbaradamasdev/springboot-postgresql-alunos/blob/local-db-postgres/db%20local.png?raw=true)
[Veja o video aqui](https://youtu.be/TYPDnAic9sI)


Esses desafios foram valiosos para o meu desenvolvimento profissional, proporcionando uma compreensão mais aprofundada da integração entre API REST e bancos de dados, bem como a importância de considerações específicas durante o processo de deploy em ambientes remotos.

Estou aberto a feedbacks e sugestões para aprimorar ainda mais o projeto, e estou comprometido em superar desafios futuros com uma abordagem mais informada e eficaz.
