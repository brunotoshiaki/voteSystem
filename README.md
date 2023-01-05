# voteSystem

Projeto para votação de associados

# Tecnologias utilizadas

- [`Java 19`] - Java Development Kit 19
- [`Spring boot 3.0`] - Framework base para a API
- ['H2'] - Banco em mémoria

# Endpoints

A `voteSystem` disponibiliza os seguintes `endpoints` em sua `API`

## 1 - Criação de associados

Endpoint para realizar criar um associdado

- PATH: **POST /api/v1/associate**
- Headers:
    - Content-Type: `application/json`
- Body:
    - **name="Carlos Antunes""**

- Exemplo - curl

```
curl --location --request POST 'localhost:8080/api/v1/associate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Carlos Antunes""
}'
```