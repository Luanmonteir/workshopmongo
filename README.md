# Workshop MongoDB

Este projeto faz parte de um workshop prático com foco em criação de uma API RESTful utilizando **Java com Spring Boot** e **MongoDB** como banco de dados NoSQL.  
**Projeto desenvolvido para fins de estudo.**

## 📊 Tecnologias Utilizadas

- **Linguagem:** Java  
- **Framework:** Spring Boot  
- **Banco de Dados:** MongoDB  
- **Dependências:** Spring Data MongoDB, Spring Web  
- **Ferramenta de Build:** Maven  

## 🎯 Funcionalidades

- ✅ Cadastro de usuários e posts  
- ✅ Busca por usuário e por posts  
- ✅ Atualização e exclusão de dados  
- ✅ Relacionamento entre documentos (usuários e posts)  

## 🚀 Como Executar o Projeto

1. **Clone o repositório**  
   ```bash
   git clone https://github.com/Luanmonteir/workshopmongo.git
Importe o projeto em sua IDE (Eclipse, IntelliJ, etc.)

Certifique-se de que o MongoDB está instalado e em execução

Execute a aplicação Spring Boot (classe WorkshopmongoApplication)

Acesse a API:

Via navegador ou Postman:

http://localhost:8080/users

http://localhost:8080/posts

📅 Endpoints Principais
GET /users – Lista todos os usuários

POST /users – Cria um novo usuário

GET /posts – Lista todos os posts

POST /posts – Cria um novo post

GET /users/{id} – Detalha um usuário com seus posts

👥 Contribuição
Contribuições são bem-vindas! Para isso:

Faça um fork do repositório

Crie uma branch:

bash
Copiar
Editar
git checkout -b minha-feature
Faça o commit das suas alterações:

bash
Copiar
Editar
git commit -m "Minha contribuição"
Faça o push para a sua branch:

bash
Copiar
Editar
git push origin minha-feature
Abra um Pull Request
