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

- **Java 17**: Utilizado como a linguagem principal para o backend.
- **Spring Boot 3**: Framework utilizado para simplificar o desenvolvimento de aplicativos Java.
- **PostgreSQL**: Banco de dados relacional escolhido para armazenar os dados dos alunos.
- **Spring Data JPA**: Uma parte integrante do ecossistema Spring, facilita a interação com bancos de dados relacionais.
- **Swagger**: Implementado para documentar a API de forma clara e interativa.
- **Railway**: Utilizado para o deploy do projeto.

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

<hr>

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
INSERT INTO aluno (nome, idade, nota_primeiro_semestre, nota_segundo_semestre, nome_professor, numero_sala)
VALUES
  ('Ana Silva', 22, 87.5, 92.0, 'Oliveira', 201),
  ('Carlos Santos', 21, 78.0, 85.5, 'Lima', 202),
  ('Camila Pereira', 23, 91.0, 88.5, 'Costa', 203),
  ('Diego Oliveira', 20, 82.5, 90.0, 'Silva', 204),
  ('Fernanda Lima', 22, 89.0, 87.5, 'Santos', 205),
  ('Gabriel Costa', 21, 85.5, 91.5, 'Pereira', 206),
  ('Isabel Santos', 23, 93.5, 94.0, 'Oliveira', 207),
  ('João Lima', 20, 80.0, 88.0, 'Costa', 208),
  ('Juliana Pereira', 22, 88.5, 89.5, 'Santos', 209),
  ('Lucas Costa', 21, 85.0, 90.5, 'Lima', 210),
  ('Mariana Oliveira', 23, 92.0, 93.0, 'Silva', 211),
  ('Pedro Santos', 20, 79.5, 86.0, 'Costa', 212),
  ('Raquel Lima', 22, 90.5, 91.0, 'Pereira', 213),
  ('Rafael Pereira', 21, 86.0, 89.0, 'Santos', 214),
  ('Sara Costa', 23, 94.0, 92.5, 'Lima', 215),
  ('Thiago Oliveira', 20, 81.5, 87.0, 'Silva', 216),
  ('Valentina Santos', 22, 87.0, 90.5, 'Pereira', 217),
  ('Vinícius Lima', 21, 84.5, 92.0, 'Costa', 218),
  ('Yasmin Pereira', 23, 91.5, 91.5, 'Santos', 219),
  ('Zé Carlos Costa', 20, 83.0, 88.5, 'Oliveira', 220);
```

![Tela do postgresql local](https://github.com/barbaradamasdev/springboot-postgresql-alunos/blob/local-db-postgres/db%20local.png?raw=true)
[Veja o video aqui](https://youtu.be/TYPDnAic9sI)


Esses desafios foram valiosos para o meu desenvolvimento profissional, proporcionando uma compreensão mais aprofundada da integração entre API REST e bancos de dados, bem como a importância de considerações específicas durante o processo de deploy em ambientes remotos.

Estou aberto a feedbacks e sugestões para aprimorar ainda mais o projeto, e estou comprometido em superar desafios futuros com uma abordagem mais informada e eficaz.
