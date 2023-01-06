# voteSystem

Projeto para votação de associados

# Tecnologias utilizadas

- [`Java 19`] - Java Development Kit 19
- [`Spring boot 3.0`] - Framework base para a API
- [`H2`] - Banco em mémoria

# Endpoints

A `voteSystem` disponibiliza os seguintes `endpoints` em sua `API`

## 1 - Criação de associados

Endpoint para realizar criar um associdado

- PATH: **POST /api/v1/associate**
- Headers:
    - Content-Type: `application/json`
- Body:
  - **name="name" value: {String}**

- Exemplo - curl

```
curl --location --request POST 'localhost:8080/api/v1/associate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Carlos Antunes""
}'
```

## 2 - Listar todos associados

Endpoint para realizar a listagem de todos os associados

- PATH: **get /api/v1/associate**


- Exemplo - curl
```
curl --location --request GET 'localhost:8080/api/v1/associate' \
```

## 3 - Criação de pauta

Endpoint para realizar criar uma pauta

- PATH: **POST /api/v1/schedule**
- Headers:
    - Content-Type: `application/json`
- Body:
  - **name="name" value: {String}**

- Exemplo - curl

```
curl --location --request POST 'localhost:8080/api/v1/schedule' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Bolsa Escola"
}'
```

## 4 - Listar todas as pautas

Endpoint para realizar a listagem de todos os associados

- PATH: **get /api/v1/schedule**


- Exemplo - curl
```
curl --location --request GET 'localhost:8080/api/v1/schedule' \
```

## 5 - Criar uma sessão de votação

Endpoint para realizar uma sessão de votação

- PATH: **POST /api/v1/session**
- Headers:
    - Content-Type: `application/json`
- Body:
  - **scheduleId=id value: {Int}**
  - **operatingTime=1 value: {Int}** -> Tempo em minutos

- Exemplo - curl

```
curl --location --request POST 'localhost:8080/api/v1/session' \
--header 'Content-Type: application/json' \
--data-raw '{
  "scheduleId": 1
  }'
```
```
curl --location --request POST 'localhost:8080/api/v1/session' \
--header 'Content-Type: application/json' \
--data-raw '{
  "scheduleId": 1,
  "operatingTime": 10 
}'
```

## 6 - Exibir resultado de uma votação

Endpoint para realizar a listagem de todos os associados

- PATH: **get /api/v1/associate**


- Exemplo - curl
```
curl --location --request GET 'localhost:8080/api/v1/associate' \
```
