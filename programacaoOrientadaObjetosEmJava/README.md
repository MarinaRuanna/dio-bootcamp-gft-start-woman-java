Definição

A Orientação a Objetos é um paradigma de aálise, projeto e programação de sistemas de software baseado na composição e 
interação entre diversas unidades de software chamadas objetos.

Abstração:

Processo pelo qual se isolam características de um objeto, 
considerando os que tenham em comum certos grupos de objetos.

Reuso: 

Cpacidade de criar novas unidades de código a partir de outras já existentes.

Encapsulamento:

Capacidade de esconder complexidades e proteger dados.

Estrutura:

Classe
Atributo
Método
Objeto
Mensagem

**Classe:** 

É uma estrutura que abstrai um conjunto de objetos com características similares. 
Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. 
Em outros termos, uma classe descreve os serviços providos por seus objetos e quaisinformções eles podem armazenar.

Dicas: 

Substantivos;
Nomes significativos;
Contexto deve ser considerado.

Códigos:

JAVA:
class Carro {}

C#:
class Carro {}

Python:
class Carro:
    pass

EXERCICIO: 
Crie a classe carro, use a linguagem que gostar e siga as dicas sobre como criar clases.
Carro.Java

**Atributos:**
É o elemento de uma classe responsável por definir sua estrutura de dados.
conjunto destes será responsável por representar suas características e fará parte dos objetos
criados a partir dessa classe.

Dicas:

ubstantivos e adjetivos;
Nomes significativos
Contexto deve ser considerado
Abstração
Tipos adequados

Códigos:

Java:

class Carro {
    int portas;
}

C#:

class Carro {
    int portas;
}

Python:

class Carro: 
    portas = 0

EXERCÍCIO: Evolua o EXERCÍCIO 1 e defina 3 atributos para sua classe "Carro":
cor;
modelo;
capacidade do tanque.

**Método:**

É uma porção do código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele.
Um método serve para identifcar quais serviçosm ações, que a classe oferece.
Eles são responsável por definir e realizar um determinado comportamento.

Criação:

Java e C#:

Viabilidade;
Retorno;
Nome;
Parâmetros.

Python:

Palavra reservada: def
Nome
Paraâmetros

Dicas:

Verbos;
Nomes significativos;
Contexto deve ser considerado.

Códigos:

Java:

class Carro {
    void frear(){
        ...  
    }
}

C#:

class Carro {
    void frear(){
        ...  
    }
}

Python:

class Carro:
    def frear():

Dois métodos especiais:

Construtor:

Java:

class Carro {
    carro() {
        ...
    }
}

C#:

class Carro {
    carro() {
        ...
    }
}

Python:

class Carro:
    def__init__(self):
        ...

Destrutor:


Java:

class Carro {
    void finalize() {
        ...
    }
}

C#:

class Carro {
    ~carro() {
        ...
    }
}

Python:

class Carro:
    def__del__(self):
        ...

Sobrecarga:


Mudar a assinatura de acordo com a necessidade:
    - Assinatura: nome+parâmetros

Java:

m1()
m1(int i)
m1(float f)
m1(String s, long l)
m1(long l, String s)

C#:

M1()
M1(int i)
M1(float f)
M1(String s, long l)
M1(long l, String s)

EXERCÍCIO 3: Evolua o conceito do EXERCÍCIO 2 e defina um método para calcular o valor total oara encher o tanque.
Este deve receber como parâmetro o valor da gasolina.
Faça também duas sobrecargas do construtor.


**Objeto:**

É a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore etc.)
ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software.
Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão 
instanciados objetos distintos.

Criação:

Java:

Carro carro = new Carro();

C#:

Carro carro = new Carro();

Python:

carro = Carro()

Mensagem:

É o processo de ativação de um método de um objeto.
Isso ocorre quando uma requisição (chamada) a esse método é realizada, 
assim disparando a execução de um comportamento descrito por sua classe.
Podem ser também direcionada diretamente á classe, cso a requisição seja a um método estático.

Java:

Carro carro = new Carro();
carro.<método>;

Carro.<método>;


C#:

Carro carro = new Carro();
carro.<método>;

Carro.<método>;

Python:

carro = Carro()
carro.<método>

Carro.<método>

Outros conceitos:

Instância x Estático: atributos e métodos
Estado de um bjeto
Identidade de um Objeto
Representação numérica de um Objeto
Representação padrão de um Objeto

EXERCÍCIO 4: Evolua o conceito do EXERCÍCIO 3 criando objetos da classe "Carro".
Use os métodos set/get,quando aplicáveis, para definir os valores dos atributos
e exibir estes valores "get". 
Passe também uma mensagem para o cáculo do total para encher o tanque.
Use System.out, Console.Writeline ou print

## Relações:

### Herança: 

"Uma coisa é outra coisa"

É o relacionamento entre classes em que uma classe chamada de subclasse
(classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de
superclasse (classe pai, classe mãe, classe base).
Dito , a subclasse consegue reaproveitar os atributos e métodos dela.
Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.

Java:

class A extends B {
    ...
}

C#:

class A : B {
    ...
}

Python:

class A(B):
    ...

EXERCÍCIO 1: Crie a classe "Veiculo", "Carro", "Moto" e "Caminhão". 
Faça a relação de herança que achar adequada.

Tipos de Heranças:

Simples: A classe filha tem só uma classe mãe.
Mútiplas: A classe filha tem uma ou mais classes mães.
    Java: Não possui Herança Múltipla
    C#: Não possui Herança Múltipla
    Python:
        class A(B, C):
            pass

Upcast: Subir hierarquia de classe.

Java:

A a = new B();

C#:

A a = new B();

Downcast: Descer hierarquia de classe.

Java:

B a = (B)new A();

C#:

B b = (B)new A();

Herança - Polimorfismo: "A mesma ação, se comportando diferente."

Herança - Sobrescrita: "A mesma ação, podendo se comportar diferente."

EXERCÍCIO 2: Crie as classe "Funcionario", "Gerente", "Vendedor" e Faxineiro".
Realize upcast e downcast
Faça a relação de herança de acordo com o slides.


EXERCÍCIO 3: Analise do comportamento do Polimorfismo e Sobrescrita.

### Associação:

"Uma coisa usa outra coisa"

Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda
a outras classes/objetos e representa de forma completa o conceito ao qual se destinam.
Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus 
objetivos.

Tipos:

Estrutural:

- Composição: "Com Parte Todo"
            Exemplo: Pessoa e Endereço

Java:

class Pessoa {
    Endereco endereco;
}


- Agregação: "Sem Parte Todo"
            Exemplo: Disciplina e Aluno

Java:

class Disciplina {
    Aluno aluno;
}


Comportamental:

- Dependência: "Depende de ..."

Java:

class Compra {
    ...
    finalizar(Cupom cupom, ...) {
        ...
    }
}

EXERCÍCIO 3: Apenas para praticar, codifique os exemplos dos slides anteriore sobre associações.

### Interface:

Define um contrato que deve ser seguido pela classe que a implementa.
Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a 
interface disponibiliza.

Java:

interface A {
    ...
}

class B implements A {
    ...
}

C#:

interface A {
...
}

class B : A {
    ...
}

EXERCÍCIO 5:  Apenas para praticar, crie uma interface chamada "OperacaoMatematica".
Crie também 4 métodos das operações básicas:
soma, subtração, multiplicação e divisão.

Tente implementar algum método e veja o que acontece.

Outros conceitos:

Tipos de Clsses: Abstrata e Concreta
Métodos abstratos
Características da associação
Palavras coringas: super, base e super()
Relações entre classes e interface: extends e implements

ORGANIZAÇÃO DA POO:

Pacotes:

São a organização física ou lógica criada para separar classes com responsabilidades distintas. 
Com isso, espera-se que a aplicação fique mais organizada e seja pssível searar classes 
de finalidades e representatividades diferentes.

Códigos:

Java:

package ...;
import ...;

C#:

namespace {...}
using ...;

Python:

_ _ init _ _.py (versão 2.x)

from ...
import ...

Visibilidades:

Um modificador de acesso tem como finalidade determinar até que ponto uma classe, atributo ou método pode ser usado.
A ultilização de modificadores de acesso é fundamental para o uso efetivo da Orientação a Objetos.
Algumas boas práticas e conceitos só são atingidos com o uso correto deles.

Tipos:

Private: "Só é visto dentro da classe"

Java:

private

private int i;
private void do();

C#:

private

private int i;
private void Do();

Protected: "Dentro da classe, mesmo pacote e subclasses"

Java:

protected

protected int i;
protected void do();

C#:

protected

protected int i;
protected void Do();

Public: "Em qualquer lugar"

Java:

public

public int i;
public void do();

C#:

public

public int i;
public void Do();

PROXIMOS PASSOS:

- Padrões de Projeto (Desing Patters)
- Boas práticas : SOLID, código, tecnicas de programação, etc.
- Refatoração
- UML
- Frameworks
- Muita Prática e estudo!


