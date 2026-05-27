AppLogin 🔐📱
📌 Sobre o Projeto

O AppLogin é um aplicativo Android desenvolvido em Java no Android Studio com integração ao banco de dados SQLite.

##O sistema permite:

Cadastro de usuários;

Armazenamento de login e senha;

Autenticação de usuários;

Navegação entre telas;

Validação de login diretamente no banco de dados.

O projeto foi desenvolvido utilizando conceitos de Activities, SQLite, intents, validações e autenticação.

🎯 Objetivo

Criar uma aplicação mobile simples e funcional que permita:

-Registrar usuários;

-Salvar dados em banco SQLite;

-Realizar login autenticado;

-Trabalhar conceitos de persistência de dados e autenticação.

🛠️ Tecnologias Utilizadas

-Java

-Android Studio

-XML

-SQLite

-Android SDK

-AppCompat
📂 Estrutura do Projeto

O projeto possui as seguintes classes:

-Classe	Função

-MainActivity-Tela inicial

LoginActivity-Tela de autenticação

RegistrarActivity-Tela de cadastro

DBHelper- Banco de dados SQLite

📱 Telas do Aplicativo

🏠 Tela Inicial

A tela principal possui:

-Logo personalizada;

-Botão Entrar;

-Botão Registrar;

-Layout personalizado;

Cores e imagens.

Função:

Direcionar o usuário para:

-Tela de Login;

-Tela de Cadastro.

📝 Tela de Cadastro

A tela de cadastro permite:

-Inserir nome;

-Inserir login;

-Inserir senha;

-Confirmar senha;

-Salvar usuário no banco.

🔐 Tela de Login

A tela de autenticação permite:

-Inserir login;

-Inserir senha;

-Validar usuário no banco SQLite.

🗄️ Banco de Dados SQLite

O aplicativo utiliza o banco:

BancoDados.db

Tabela criada:

utilizador

Campos:

Campo	Tipo

username	TEXT

password	TEXT

⚙️ Classe DBHelper

A classe DBHelper é responsável por:

Criar o banco de dados;

Criar a tabela;

Inserir usuários;

Validar login;

Atualizar estrutura do banco.

📋 Funcionalidades

✅ Cadastro de Usuário

O sistema:

Verifica se os campos estão vazios;

Verifica se as senhas coincidem;

Salva os dados no banco SQLite.

✅ Validação de Login

O sistema:

Consulta o banco;

Verifica login e senha;

Retorna:

“OK” para login válido;

“ERRO” para login inválido.

📐 Estrutura da Tabela

Tabela SQL criada automaticamente:

CREATE TABLE utilizador(

    username TEXT PRIMARY KEY,
    
    password TEXT
    
);

🔍 Método de Validação

Consulta SQL utilizada:

Select * from utilizador where username=? and password=?

📲 Navegação Entre Telas

MainActivity

Responsável por abrir:

LoginActivity;

RegistrarActivity.

Utilizando:

Intent

🧠 Conceitos Trabalhados

Durante o desenvolvimento foram utilizados:

SQLite;

CRUD básico;

Login e autenticação;

Programação Orientada a Objetos;

Activities;

Intents;

Toast;

XML;

Eventos de clique;

Persistência de dados.

🖼️ Personalização Visual

O projeto permite:

Adicionar logos;

Modificar cores;

Inserir imagens;

Personalizar botões;

Trabalhar layouts modernos.

📦 Fluxo do Sistema

#3Cadastro

Usuário acessa atela Registrar;

Preenche login e senha;

O sistema valida os dados;

O usuário é salvo no banco.

##Login

Usuário acessa a tela Login;

Insere login e senha;

O sistema consulta o banco;

Caso os dados estejam corretos:

Login autorizado;

Exibe mensagem “Login OK”.

▶️ Como Executar o Projeto

Abrir o Android Studio;

Selecionar “Open Project”;

Abrir a pasta AppLogin;

Esperar sincronizar o Gradle;

Executar no:

Emulador Android;

Ou celular físico.

📋 Exemplo de Funcionamento

##Cadastro

Campo -	Exemplo
Usuário	- admin
Senha - 123456

##Login

Campo - Exemplo
Usuário - admin
Senha - 123456

Resultado:

✅ Login autenticado com sucesso.

⚠️ Validações Implementadas

O aplicativo verifica:

Usuário vazio;

Senha vazia;

Senhas diferentes;

Login inválido;

Usuário inexistente.


✅ Resultado Esperado

O aplicativo deverá:

Cadastrar usuários;

Salvar no banco SQLite;

Validar login;

Autenticar usuários;

👨‍💻 Desenvolvedor

Projeto desenvolvido para fins acadêmicos utilizando Java, XML e SQLite no Android Studio.

Navegar entre telas;
Funcionar corretamente em emuladores e celulares Android.
