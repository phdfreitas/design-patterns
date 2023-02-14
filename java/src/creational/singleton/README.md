# Singleton
Padrão de projeto criacional que garante que uma classe tenha apenas uma instância
enquanto provê um ponto de acesso global para essa instância. Por exemplo, 
em projetos onde há a necessidade de uma infraestrutura de _logs de dados_ seria possível
fazer a implementação de uma classe usando o *Singleton.*

# Problema
> Com o *Singleton* dois problemas são resolvidos de uma só vez. Isso viola o princípio
> de responsabilidade única (SOLID)

Seguem os dois problemas resolvidos com Singleton:

1. *Uma única instância por classe*
2. *Ponto de acesso global para instância criada*

# Solução
Qualquer implementação do *Singleton* possuem os dois passos a seguir: 

1. *Construtor privado.* Dessa maneira não será possível criar novas instâncias da classe. 
2. *Criação de um método estático que servirá como um construtor.* Nesse caso, o método vai chamar o
construtor privado, criará um objeto e vai salva-lo. Qualquer chamada posterior a esse método
retornará o objeto em cache. 

# Implementação
1. Atributo privado e estático na classe
2. Método de criação público e estático para obter a instância singleton
3. Fazer a implementação de uma "inicialização preguiçosa" no método estático. 
   1. Criará um novo objeto na primeira chamada e retornará essa mesma instância nas chamadas seguintes. 
4. Construtor privado.

# Contras 
1. Viola o _princípio da responsabilidade única_, como falado antes. 
2. Pode "mascarar" um design ruim. 
3. Requer tratamento multithreaded. (evitar que múltiplas threads possam criar um objeto singleton)

# Referências
1. https://refactoring.guru/pt-br/design-patterns/singleton
2. https://refactoring.guru/pt-br/design-patterns/singleton/java/example#example-2
3. https://pt.wikipedia.org/wiki/Singleton
4. https://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392
5. https://stackoverflow.com/questions/3192095/where-exactly-the-singleton-pattern-is-used-in-real-application
   (Consideravelmente "old", mas ainda assim é uma referência :) )

# Observações
- A implementação do Singleton contida neste repositório é apenas um exemplo para melhor entendimento e
não necessariamente seria a melhor maneira (ou maneira ideal) de usar o padrão em uma aplicação real e complexa. 

