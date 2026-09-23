# Sistema de Agendamento e Controle de Serviços para Salão de Beleza

## Sobre o projeto

Este projeto foi desenvolvido como parte do Projeto Integrado do curso de Análise e Desenvolvimento de Sistemas da UNIFEOB.

A proposta é desenvolver um sistema simples para auxiliar no cadastro de clientes, serviços e agendamentos de um salão de beleza. O sistema funciona pelo terminal e permite organizar os principais dados relacionados aos atendimentos.

## Funcionalidades

O sistema possui as seguintes funções:

- Cadastro de clientes;
- Cadastro de serviços;
- Realização de agendamentos;
- Listagem de clientes;
- Listagem de serviços;
- Listagem de agendamentos;
- Cancelamento de agendamentos;
- Verificação de horários já ocupados;
- Consulta de horários disponíveis.

O sistema também impede que dois agendamentos sejam realizados para a mesma data e horário.

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Programação Orientada a Objetos
- Lógica de Programação

## Conceitos utilizados

Durante o desenvolvimento foram utilizados conceitos trabalhados nas disciplinas do Projeto Integrado, como:

- Variáveis e tipos de dados;
- Estruturas condicionais;
- Estruturas de repetição;
- Métodos;
- Classes e objetos;
- Encapsulamento;
- Herança;
- Polimorfismo;
- Listas para armazenamento dos dados.

## Estrutura do projeto

O projeto é dividido nas seguintes classes:

*Pessoa:* contém os dados básicos de uma pessoa, como nome e telefone.

*Cliente:* representa os clientes do salão e utiliza herança da classe Pessoa.

*Servico:* armazena informações dos serviços, como nome, preço e duração.

*Agendamento:* relaciona um cliente a um serviço, juntamente com a data e o horário.

*SistemaAgendamento:* concentra as operações de cadastro, consulta, listagem, cancelamento e controle dos agendamentos.

*Main:* contém o menu principal e a interação com o usuário.

## Funcionamento

Ao iniciar o programa, é apresentado um menu com as opções disponíveis. O usuário pode cadastrar clientes e serviços e, depois, utilizar essas informações para realizar os agendamentos.

Os dados são armazenados durante a execução do programa. O sistema verifica se o horário escolhido já está ocupado antes de realizar um novo agendamento.

## Objetivo

O objetivo do projeto é aplicar na prática os conceitos de Lógica de Programação e Programação Orientada a Objetos na criação de uma solução simples para uma situação relacionada à organização de atendimentos em um salão de beleza.

## Estudante

*Nome:* Dauana Silva Silvério do Rosário  
*RA:* 26001615
