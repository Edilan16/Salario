# Salario

Projeto em Java para simular o cálculo de salário líquido de um funcionário, aplicando imposto e aumento percentual.

## Funcionalidades
- Cadastrar funcionário (nome, salário bruto e imposto)
- Calcular salário líquido (salário bruto - imposto)
- Aplicar aumento salarial com base em uma porcentagem
- Exibir os dados atualizados do funcionário

## Conceitos utilizados
- Programação Orientada a Objetos (classe `Funcionario`)
- Métodos (`NetSalary()`, `IncreaseSalary()` e `toString()`) 
- Entrada de dados via `Scanner`
- Encapsulamento (estrutura separada em `entities`)

## Como executar
1. Abra o projeto em uma IDE Java (ex.: Eclipse/IntelliJ).
2. Execute a classe `aplication.Program`.
3. Informe nome, salário bruto, imposto e a porcentagem de aumento quando solicitado.

## Estrutura
- `src/aplication/Program.java`: classe principal (entrada do programa)
- `src/entities/Funcionario.java`: entidade do funcionário e regras de cálculo do salário
