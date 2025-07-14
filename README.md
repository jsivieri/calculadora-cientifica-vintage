# Calculadora Científica - Spring Boot

Este é um projeto Spring Boot que implementa uma calculadora científica completa com interface web e API REST.

## Funcionalidades

### Operações Básicas
- Adição (+)
- Subtração (-)
- Multiplicação (×)
- Divisão (÷)
- Porcentagem (%)

### Operações Científicas
- Potenciação (x^y)
- Raiz quadrada (√)
- Funções trigonométricas (sin, cos, tan)
- Logaritmos (log, ln)
- Fatorial (n!)
- Valor absoluto

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Web** - Para criar APIs REST
- **Spring Data JPA** - Para acesso a dados
- **H2 Database** - Banco de dados em memória para desenvolvimento
- **Maven** - Gerenciamento de dependências
- **HTML5, CSS3, JavaScript** - Interface web moderna

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── controller/     # Controllers REST (Calculator, User, Home)
│   │       ├── service/        # Lógica de negócio (CalculatorService)
│   │       ├── repository/     # Acesso a dados
│   │       ├── model/          # Entidades e DTOs
│   │       └── DemoApplication.java
│   └── resources/
│       ├── static/
│       │   └── index.html     # Interface da calculadora
│       ├── application.properties
│       └── data.sql           # Dados de teste
└── test/
    └── java/
        └── com/example/demo/
            ├── service/       # Testes da calculadora
            └── DemoApplicationTests.java
```

## Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+ (ou use o Maven Wrapper incluído)

### Executando a Aplicação

1. **Via Maven:**
   ```bash
   mvn spring-boot:run
   ```

2. **Via JAR:**
   ```bash
   mvn clean package
   java -jar target/demo-0.0.1-SNAPSHOT.jar
   ```

3. **Via IDE:**
   Execute a classe `DemoApplication.java`

A aplicação estará disponível em: `http://localhost:8080`

## Interface Web da Calculadora

A calculadora científica possui uma interface web moderna e responsiva disponível em:
- http://localhost:8080 (página principal)
- http://localhost:8080/calculator (acesso direto)

### Características da Interface
- Design moderno com gradientes e efeitos visuais
- Botões responsivos com animações hover
- Histórico de cálculos realizados
- Suporte completo a teclado
- Tratamento de erros em tempo real
- Layout responsivo para dispositivos móveis

## API REST da Calculadora

### Endpoints de Operações Duplas
- `POST /api/calculator/calculate` - Calcula operação via JSON
- `GET /api/calculator/add?a={a}&b={b}` - Adição
- `GET /api/calculator/subtract?a={a}&b={b}` - Subtração  
- `GET /api/calculator/multiply?a={a}&b={b}` - Multiplicação
- `GET /api/calculator/divide?a={a}&b={b}` - Divisão
- `GET /api/calculator/power?base={base}&exponent={exponent}` - Potenciação

### Endpoints de Operações Simples
- `POST /api/calculator/calculate-single?operation={op}&value={value}` - Operação única
- `GET /api/calculator/sqrt?value={value}` - Raiz quadrada
- `GET /api/calculator/sin?value={value}` - Seno (em graus)
- `GET /api/calculator/cos?value={value}` - Cosseno (em graus)
- `GET /api/calculator/tan?value={value}` - Tangente (em graus)
- `GET /api/calculator/log?value={value}` - Logaritmo base 10
- `GET /api/calculator/ln?value={value}` - Logaritmo natural
- `GET /api/calculator/factorial?value={value}` - Fatorial

### Exemplos de Uso da API

```bash
# Operações básicas
curl "http://localhost:8080/api/calculator/add?a=5&b=3"
curl "http://localhost:8080/api/calculator/multiply?a=4&b=7"

# Funções científicas
curl "http://localhost:8080/api/calculator/sqrt?value=16"
curl "http://localhost:8080/api/calculator/sin?value=30"
curl "http://localhost:8080/api/calculator/factorial?value=5"

# Operação via JSON
curl -X POST http://localhost:8080/api/calculator/calculate \
  -H "Content-Type: application/json" \
  -d '{"value1": 5, "value2": 3, "operation": "+"}'

# Operação científica via POST
curl -X POST "http://localhost:8080/api/calculator/calculate-single?operation=sqrt&value=25"
```

## Endpoints da API

### Calculadora Científica
Veja a seção "API REST da Calculadora" acima para detalhes completos.

### Hello World
- `GET /` - Redireciona para a calculadora
- `GET /api/hello` - Endpoint de teste da API

### Usuários
- `GET /api/users` - Lista todos os usuários
- `GET /api/users/{id}` - Busca usuário por ID
- `POST /api/users` - Cria um novo usuário
- `PUT /api/users/{id}` - Atualiza um usuário
- `DELETE /api/users/{id}` - Remove um usuário

### Exemplo de Requisição POST para Usuário
```json
{
  "name": "João Silva",
  "email": "joao@example.com"
}
```

## Testes

O projeto inclui testes unitários abrangentes para a calculadora científica.

### Executando Testes
```bash
# Executar todos os testes
mvn test

# Executar apenas testes da calculadora
mvn test -Dtest=CalculatorServiceTest
```

### Cobertura de Testes
- Todas as operações matemáticas básicas
- Funções científicas avançadas
- Tratamento de casos de erro (divisão por zero, raiz de negativo, etc.)
- Validação de entrada

## Console H2 Database

Durante o desenvolvimento, você pode acessar o console do banco H2 em:
`http://localhost:8080/h2-console`

**Configurações de conexão:**
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa` 
- Password: (deixar em branco)

## Recursos Adicionais

### Suporte a Teclado na Interface Web
- Números (0-9) e ponto decimal
- Operadores (+, -, *, /, %)
- Enter ou = para calcular
- Escape ou C para limpar
- Backspace para apagar último caractere

### Tratamento de Erros
A aplicação trata diversos tipos de erro:
- Divisão por zero
- Raiz quadrada de números negativos
- Logaritmo de números não positivos
- Fatorial de números negativos ou decimais
- Operações inválidas

## Próximos Passos

Possíveis melhorias futuras:
- Implementar mais funções científicas (arcseno, arccosseno, etc.)
- Adicionar suporte a números complexos
- Implementar converter de unidades
- Adicionar gráficos de funções
- Implementar persistência do histórico de cálculos
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** (deixe em branco)

## Testes

Execute os testes com:
```bash
mvn test
```

## Desenvolvimento

Este projeto inclui dados de exemplo que são carregados automaticamente na inicialização através do arquivo `data.sql`.

Para adicionar novas funcionalidades:
1. Crie as entidades em `model/`
2. Crie os repositórios em `repository/`
3. Implemente a lógica de negócio em `service/`
4. Crie os controllers em `controller/`
