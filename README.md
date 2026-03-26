##  Versão Monolítica

Nesta versão, todo o código está concentrado em uma única classe (`SistemaLojaMonolitico`), incluindo:
- Entrada de dados
- Processamento
- Saída de dados

Isso dificulta manutenção e reutilização.

---

##  Versão Modularizada

Nesta versão, o sistema foi dividido em classes:

- `Produto` → representa os dados
- `CalculadoraService` → regras de negócio
- `Main` → execução do sistema

Essa abordagem melhora a organização, manutenção e reutilização do código.
#  Sistema de Loja em Java

##  Descrição
Este projeto consiste no desenvolvimento de um sistema simples em Java para cálculo do valor total de produtos, considerando quantidade e aplicação de desconto.

O objetivo principal é demonstrar a diferença entre uma abordagem simples (quase monolítica) e a utilização de conceitos básicos de organização em classes, seguindo princípios da Programação Orientada a Objetos.

---

##  Objetivo
- Aplicar conceitos de Java
- Praticar Programação Orientada a Objetos (POO)
- Demonstrar organização de código
- Utilizar Git e GitHub para versionamento

---

##  Funcionalidades
- Cadastro de produto (nome, preço e quantidade)
- Cálculo automático do valor total
- Aplicação de desconto de 10% para compras acima de 10 unidades
- Exibição do resumo da compra

---

##  Tecnologias Utilizadas
- Java
- IntelliJ IDEA
- Git
- GitHub

---

##  Estrutura do Projeto

- `Main.java` → Classe principal (execução do sistema)
- `Produto.java` → Representa os dados do produto
- `CalculadoraService.java` → Responsável pelas regras de cálculo

---

## Como Executar

1. Abra o projeto no IntelliJ
2. Execute a classe `Main`
3. Insira os dados solicitados no terminal

---

##  Conceitos Aplicados
- Programação Orientada a Objetos
- Separação de responsabilidades
- Lógica condicional
- Entrada e saída de dados

---

##  Exemplo de Execução

Nome: Camisa

Preço: 50

Quantidade: 12

Produto: Camisa

Total: R$ 540.0
