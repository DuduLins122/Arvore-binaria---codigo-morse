# Projeto: Árvore Binária - Código Morse

## Descrição

Este projeto consiste na implementação de uma árvore binária para representar o código Morse. Cada caminho da raiz até um nó folha corresponde a uma sequência de pontos (.) e traços (-) que representam letras e números conforme o padrão Morse internacional.

A árvore permite:
- Inserção automática de caracteres de acordo com seu código Morse;
- Busca de caracteres com base em uma string Morse;
- Decodificação de frases Morse com saída em texto comum.

---

## Regras de Implementação

- ❌ Não foi utilizado nenhum tipo de array, lista, StringBuilder ou estruturas prontas;
- ✅ Apenas `String`, `int`, `float` foram usados, conforme especificações;
- ✅ Uso de `.length()` apenas em manipulação de `String`;
- ❌ Não utilizamos `throws`, `exceptions` personalizados ou estruturas de tratamento avançadas;

---

## Estrutura

- `No.java` - Representa um nó da árvore.
- `ArvoreBinariaMorse.java` - Implementa as operações principais da árvore Morse.
- `Principal.java` - Classe principal para testes e demonstração das funcionalidades.

---

## Exemplo de Uso

```java
arvore.inserir("...", 'S');
arvore.inserir("---", 'O');
System.out.println(arvore.buscar("..."));         // Saída: S
System.out.println(arvore.decodificarFrase("... --- ...")); // Saída: SOS
```

---

## Como Rodar no IntelliJ

1. Abra o IntelliJ IDEA.
2. Crie um novo projeto Java.
3. Copie os arquivos `.java` da pasta para o diretório `src` do projeto.
4. Execute a classe `Principal`.

---

## Participantes

Todos os membros do grupo devem inserir seu nome aqui.

---

## Link do Projeto

- 🔗 GitHub: (adicione aqui o link do repositório)
- 🎥 YouTube: (adicione aqui o link do vídeo explicativo)
