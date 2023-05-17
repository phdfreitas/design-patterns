# Factory Method 
Padrão de Projeto criacional que fornece uma interface para criar objetos em uma superclasse, no entanto, permite que as subclasses alterem o tipo de objeto que serão criados. 

# Problema
Considerando que temos um sistema que faz o gerenciamento de logística. Na primeira versão desse sistema, só temos a capacidade de lidar com o transporte de *Caminhões*. No entanto, houve uma solicitação de aumentar o sistema e agora precisamos lidar também com o transporte de *Navios*. 

Acontece que inicialmente o sistema foi modelado apenas para lidar com transporte de caminhões, ou seja, o código do sistema está totalmente acoplado a classe **Caminhão.** Neste ponto, adicionar a classe **Navio** vai exigir a alteração em todo código base e possivelmente duplicação, ainda mais se eventualmente for necessário lidar com transporte de **Aviões.**, possivelmente tudo que foi feito para **Navios** será feito novamente. Isso vai implicar em um código desnecessariamente "verboso" e com condicionais que alteram o fluxo/comportamento do sistema. 

# Solução
O padrão de projeto *Factory Method* sugere a substituição das chamadas diretas de construção de objetos, ou seja, com o operador **new** para chamadas para um **factory method** especial. No fim, ainda criaremos objetos com o operador *new*, mas essa criação será feita pela chamada do *factory method* (esses objetos são chamados de *produtos*)

Portanto, é possível sobrescrever o *factory method* em uma subclasse e alterar os produtos (**objetos**) que estão sendo criados pelo método. A limitação imposta a isso é que as subclasses só podem retornar *produtos* diferentes se tiverem uma classe ou interface base em comum. E, além disso, na classe base, o método declarado deve ter seu tipo de retorno declarado como essa interface. 

# Aplicabilidade
1. Quando não se sabe de antemão os tipos e dependências exatas dos objetos com os quais o código vai ou deve funcionar. 
2. Quando se deseja economizar recursos do sistema reutilizando objetos existentes em vez de recriá-los sempre. 

# Prós
- Acoplamentos entre o criador e os produtos concretos são evitados
- Princípio da Responsabilidade única é aplicado. O código de criação fica localizado em um único local, assim a manutenção do código é facilitada.
- Princípio *aberto/fechado*. É possível a criação de novos tipos de produto sem quebrar o código existente.

# Contras
- O código pode se tornar mais complicado. É necessário adicionar muitas subclasses para a implementação desse padrão.

# Referências
- https://refactoring.guru/pt-br/design-patterns/factory-method
- https://pt.wikipedia.org/wiki/Factory_Method