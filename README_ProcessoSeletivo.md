
# Processo Seletivo

Este projeto simula um processo seletivo em Java, com funcionalidades como análise de salário pretendido, seleção de candidatos com base em critérios definidos e tentativa de contato com os selecionados.

## 📋 Funcionalidades

- **Análise de candidatos** com base no salário pretendido.
- **Seleção de até 5 candidatos** que aceitam um salário igual ou inferior ao valor base.
- **Simulação de ligações telefônicas** com até 3 tentativas por candidato.
- **Impressão de candidatos selecionados.**

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/developercarloslima/Sistema-de-validacao-de-candidato.git
```

2. Compile o projeto:

```bash
javac ProcessoSeletivo.java
```

3. Execute o programa:

```bash
java ProcessoSeletivo
```

## 📌 Estrutura do Código

### `main`

Percorre os candidatos e tenta contato com cada um, simulando uma ligação com até 3 tentativas.

### `ligandoParaCandidatosSelecionados(String candidato)`

Simula uma tentativa de contato com um candidato. A ligação pode ou não ser atendida, com base em um valor aleatório.

### `selecaoCandidatos()`

Seleciona candidatos cujo salário pretendido seja igual ou inferior ao salário base (`R$ 2000.00`), até um total de 5 candidatos.

### `valorPretendido()`

Gera um valor aleatório entre R$ 1800.00 e R$ 2200.00 como salário pretendido de um candidato.

### `imprimirCandidatosSelecionados(String[] candidatosSelecionados)`

Imprime uma lista fixa de candidatos selecionados. (Nota: A lista é estática e não reflete os selecionados reais da lógica de seleção.)

### `analisarCandidato(double salarioPretendido)`

Compara o salário pretendido com o salário base e imprime a ação a ser tomada.

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **API de Threads (`ThreadLocalRandom`)**
- **Estruturas de controle (`if`, `while`, `do-while`)**

## ✅ Possíveis Melhorias

- Permitir que o método `imprimirCandidatosSelecionados` use uma lista real de selecionados.
- Armazenar candidatos aprovados em uma lista dinâmica.
- Separar responsabilidades com POO (classes para Candidato, Processo, etc).


---

Desenvolvido com 💻 por [Carlos Lima](https://github.com/developercarloslima)
