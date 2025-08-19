# 💰 Conversor de Moedas - Desafio Alura

## 📜 Descrição do Projeto
Projeto de um conversor de moedas interativo que roda no console, desenvolvido em Java. O programa consome a API da [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real, permitindo a conversão entre diversas moedas de forma dinâmica e atualizada.

Este projeto foi desenvolvido como parte do Desafio de Programação do programa ONE (Oracle Next Education) em parceria com a Alura.

**Status:** Concluído ✔️

---

## ✨ Funcionalidades

- **Menu Interativo:** Interface de texto simples e intuitiva para o usuário.
- **Conversões Disponíveis:**
    - Dólar (USD) ↔ Real Brasileiro (BRL)
    - Dólar (USD) ↔ Peso Argentino (ARS)
    - Dólar (USD) ↔ Peso Colombiano (COP)
- **Taxas de Câmbio em Tempo Real:** Conexão direta com uma API para garantir que os valores de conversão estejam sempre atualizados.
- **Tratamento de Erros:** O programa é robusto contra entradas inválidas (texto em vez de números) e falhas de conexão com a API, informando o usuário sobre o problema.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17:** Linguagem principal do projeto.
- **Maven:** Gerenciador de dependências.
- **Biblioteca Gson:** Utilizada para fazer o parse da resposta JSON da API de forma eficiente.
- **Java HTTP Client:** Cliente nativo do Java para realizar as requisições à API.

---

## 🚀 Como Executar o Projeto

**Pré-requisitos:** JDK 17 (ou superior) e Maven instalados.

1. **Clone o repositório:**
   ```bash
   git clone (https://github.com/leonardoferrza/Conversor-de-moedas-java.git)
   ```
2.  **Obtenha uma chave de API:**
    * Cadastre-se gratuitamente em [ExchangeRate-API](https://www.exchangerate-api.com/).
    * Copie sua chave de API pessoal.

3.  **Configure a chave no código:**
    * Abra o arquivo `src/main/java/com/example/conversordemoedas/ApiConnector.java`.
    * Substitua o texto da sua chave na variável `apiKey`.

4.  **Execute a aplicação:**
    * Abra o projeto em sua IDE (IntelliJ, Eclipse, etc.).
    * Execute o método `main` na classe `Main.java`.

---

## 🧑‍💻 Autor

**Leonardo Ferrza**

* LinkedIn: [leonardoferrza](https://www.linkedin.com/in/leonardoferrza)
* GitHub: [leonardoferrza](https://github.com/leonardoferrza)