# Propósito
Padrão de projeto que permite que objetos com interfaces incompatíveis trabalhem juntos

# Problema
Imagine que você tem uma aplicação que trabalha com dados no formato _xml._ Agora, sua aplicação precisa integrar uma biblioteca que só trabalha com dados em formato _json_ e  você não tem acesso para mudar a forma como essa biblioteca externa trabalha com os dados. O que seria possível fazer?

# Solução
**Poderíamos criar um adaptador** para fazer com que a nossa aplicação 
conseguisse trabalhar com a biblioteca externa. 
Nesse caso, estaríamos usando o padrão e projeto *Adapter*

Dessa maneira, um adaptador nada mais é do que um *intermediador* que vai receber 
as solicitações da aplicação e converter essas solicitações em um formato que a 
biblioteca externa entenda. Vale ressaltar que adaptador não só convertem dados 
em diferentes formatos, mas também permite que objetos com interfaces diferentes a colaborarem.

# Funcionamento
Adaptador obtém uma interface compatível com um dos objetos existentes.
O objeto existente usa essa interface para fazer a chamada dos métodos do adaptador com segurança
Nesse ponto, ao ser chamado, o adaptador passa o *request* para o segundo objeto em um formato e ordem esperado pelo mesmo.
**Em algumas situações é possível criar um adaptador que trabalha com requisições para ambos os lados**

# Referências
- https://refactoring.guru/pt-br/design-patterns/adapter
- https://refactoring.guru/pt-br/design-patterns/adapter/java/example
- https://www.devmedia.com.br/padrao-de-projeto-adapter-em-java/26467
- https://pt.wikipedia.org/wiki/Adapter


 


