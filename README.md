# Spring-ApiBhut
- Sobre a aplicação-
> Criamos uma aPlicação ( API REST ) que contenha 3 endpointn, aonde consumimos 2 endpoints de uma api Externa: 
> ApI que consumimos : http://api-test.bhut.com.br:3000.
> Method : GET / Post 
- Api REst que implementamso : GET / POST / GET 
> • CRIAMOS uma tabela em banco nosql para armazenar os log com os campos mínimos de: id,
data_hora e car_id;

>A aplicação foi feita 100% em Java com Spring Boot.
• Spring Boot = O Spring Boot é um framework Java open source que tem como objetivo facilitar esse processo em aplicações Java. Consequentemente, ele traz mais agilidade para o processo de desenvolvimento, uma vez que devs conseguem reduzir o tempo gasto com as configurações iniciais.

> Ultilizamos a  Feign que é ultilizado para integração e consumo de serviço rest.
• Ou seja ele torna o consumo de clients de serviço da web mais fácil, uma grande facilidade do uso do Feign é que não precisamos
escrever nenhum código para chamar o serviço, a não ser uma
definição de interface.
 
• Assim ultilizamos a anotação  @FeignClient é a notação que torna o consumo do serviço
extremamente simples.

> Para Resgistrar nossos logs em um banco de dados Nosql Ultilizamos uma dependência chamada h2database , aonde ela cria uma banco em memória.
