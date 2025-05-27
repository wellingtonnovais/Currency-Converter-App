# Conversor de Moedas

Bem-vindo(a) ao Conversor de Moedas! Uma aplicação de console simples em Java para facilitar suas conversões financeiras, utilizando dados em tempo real de uma API de câmbio.

---

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg?style=flat-square&logo=java)](https://www.java.com/)
[![Gson](https://img.shields.io/badge/Gson-2.10.1-green.svg?style=flat-square&logo=json)](https://github.com/google/gson)
[![API Status](https://img.shields.io/badge/ExchangeRate--API-Online-brightgreen.svg?style=flat-square)](https://www.exchangerate-api.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)](LICENSE) 
[![Em desenvolvimento](https://img.shields.io/badge/Em%20desenvolvimento-yellow)](https://shields.io/)---

## 🚀 Funcionalidades

Este projeto oferece uma maneira prática de converter moedas, com as seguintes características:

* Conversões Pré-definidas: Escolha entre 16 pares de moedas populares, como BRL-USD, EUR-BRL, JPY-USD e muito mais.
* Conversões Customizadas (Opção 17): Flexibilidade para converter entre quaisquer duas moedas válidas, basta inserir seus códigos de três letras (ex: BRL, USD, EUR, JPY, ARS, etc.).
* Histórico de Conversões (Opção 18): Mantenha um registro de todas as transações realizadas durante a sessão atual do aplicativo.
* Validação de Entrada Robusta: Mensagens de erro claras para entradas inválidas (caracteres não numéricos, valores negativos, etc.), garantindo uma experiência de usuário mais suave.
* Interface Intuitiva: Um menu de console interativo que guia o usuário através das opções disponíveis.

## 🛠️ Tecnologias Utilizadas

* Linguagem: Java 17+
* API Externa: [ExchangeRate-API](https://www.exchangerate-api.com/) (para taxas de câmbio em tempo real)
* Manipulação de JSON: [Google Gson](https://github.com/google/gson)
* Controle de Versão: Git

## 👨‍💻 Como Compilar e Rodar

### Pré-requisitos

Certifique-se de ter o seguinte instalado em sua máquina:

* Java Development Kit (JDK) 17 ou superior.
* Conexão ativa com a internet (necessária para as chamadas à API).
* Biblioteca Google Gson: Faça o download do arquivo .jar (por exemplo, gson-2.10.1.jar) em [https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar) e salve-o em uma pasta lib na raiz do seu projeto.

### Compilação

Abra o terminal na raiz do seu projeto e execute o comando:

`bash
javac -d out -cp "lib/*" src/com/currencyconverter/main/Main.java src/com/currencyconverter/choice/*.java src/com/currencyconverter/exchange/*.java src/com/currencyconverter/menu/*.java src/com/currencyconverter/requestapi/*.java src/com/currencyconverter/requestapi/handlingapi/*.java src/com/currencyconverter/requestapi/history/*.java src/com/currencyconverter/requestapi/self/*.java

 * javac -d out: Indica que os arquivos .class compilados serão colocados na pasta out.
 * -cp "lib/*": Adiciona todos os arquivos JAR dentro da pasta lib ao classpath, garantindo que a biblioteca Gson seja encontrada.
Execução
Após a compilação bem-sucedida, execute o programa com:
java -cp "out:lib/*" com.currencyconverter.main.Main

 * out:lib/*: Define o classpath, incluindo a pasta out (onde estão seus .class) e todos os JARs em lib.
🤝 Contato
Para dúvidas, sugestões ou colaborações, sinta-se à vontade para entrar em contato:
Wellington Novais 
📸 Sobre o Autor
<p align="center">
<img src="photo_2025-05-27_18-28-17.jpg" alt="Wellington Novais" width="200"/>
<br>
<em>Desenvolvido com paixão por Wellington Novais.</em>
</p>
📝 Licença
Este projeto está licenciado sob a Licença MIT.

---
