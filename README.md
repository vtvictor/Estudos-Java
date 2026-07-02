# Estudos-Java

Coleção de projetos e exercícios em Java para aprendizado e prática de conceitos de programação orientada a objetos, estruturas de dados, algoritmos e boas práticas de desenvolvimento.

## Estrutura do repositório

Cada pasta representa um conjunto de exercícios ou um mini-projeto independente. Alguns exemplos:

- `Exemplos/` – pequenos programas ilustrando conceitos básicos (laços, condições, manipulação de strings, etc.)
- `POO/` – exemplos de herança, polimorfismo, encapsulamento e interfaces.
- `Colecoes/` – uso de listas, mapas, sets e filas da API Java Collections.
- `Threads/` – exemplos de concorrência e sincronização.
- ... e outros tópicos conforme a evolução dos estudos.

## Como usar

Cada projeto pode ser aberto diretamente em sua IDE favorita (IntelliJ IDEA, Eclipse, NetBeans, VS Code) ou compilado e executado via linha de comando.

### Compilando e executando via terminal

Para um arquivo `.java` contendo um método `public static void main(String[] args)`:

```bash
javac NomeDoArquivo.java
java NomeDoArquivo
```

Se o projeto utilizar múltiplas classes, compile todos os arquivos do pacote:

```bash
javac *.java
java NomeDaClassePrincipal
```

### Dependências

A maioria dos exemplos depende apenas do JDK padrão. Quando houver necessidade de bibliotecas externas, elas serão listadas em um arquivo `README` dentro da pasta específica ou comentadas no código-fonte.

## Boas práticas seguidas

- Código formatado de acordo com as convenções do Google Java Style (ou Oracle Code Conventions).
- Cada classe contém um comentário Javadoc descrevendo seu propósito.
- Métodos públicos possuem Javadoc com descrição de parâmetros e retorno (quando aplicável).
- Evita-se uso de variáveis de instância públicas; encapsulamento adequado.
- Nomes de variáveis, métodos e classes são descritivos e seguem o padrão `camelCase` para variáveis/métodos e `PascalCase` para classes.

## Licença

Este repositório é destinado a fins educacionais. Sinta-se livre para usar, modificar e compartilhar o código conforme necessário.
