# Jogo de Labirinto utilizando micro-controlador MSP430
## Autores
  Gabriela Lopes - 12/0060396
  Fernando Campelo - 14/0020144

## Descrição
  A proposta do projeto é implementar um jogo de labirinto utilizando o microcontrolador MSP430. O objetivo do jogo é atingir um ponto de chegada definido após atravessar um labirinto. A bola seria comandada por variações na inclinação que o jogador faz na plataforma através de um sensor, o MPU 6050, que é um dispositivo integrado que combina um acelerômetro de 3 eixos e um giroscópio também de 3 eixos. Os dados da posição serão transmitidos a um computador através de um módulo bluetooth via comunicação serial e visualizados no labirinto implementado em Java.
## Componentes
Os componentes utilizados no projeto serão o kit da Texas LaunchPad Evaluation Kit MSP430F5529, o MPU 6050, que é um dispositivo integrado que combina um acelerômetro de 3 eixos e um giroscópio também de 3 eixos e o módulo bluetooth HC-05. Os dados serão obtidos do MPU e o MSP430 fará o processamento. A comunicação entre os componentes será feita por meio da comunicação I2C.

## Execução
Para compilar o projeto, vá até a pasta do projeto e digite
```bash
  javac Main.java
```
Para executar o projeto, digite
```bash
  java Main
```

## Observações
### Labirinto
A Classe Labirinto define todo o protótipo do labirinto.
O atributo Labirinto.labirinto define o mapa do labirinto, onde cada cédula do labirinto vai ser descrita por:
  * 0: parede
  * 1: caminho
  * 2: elemento
  * 3: final
Caso queira alterar o projeto, mude esses campos.
Para movientar o elemento dentro do labirinto, basta passar para o método Labirinto.percorrer(x_atual,x_desejado,y_atual,y_desejado), onde o atual é o valor que ele se encontra no momento, e o desejado é o valor de x ou y para o qual ele quer se mover. Caso a cédula que ele mover seja uma parede (0), ele não vai conseguir se mexer.

Caso não se mova:
  retorna 0
Caso ele se mova:
  retorna 1
Caso chegue ao fim:
  retorna 2
  
### Main
A movimentação do labirinto é feita no método Main.main. Após a tentativa de realização do movimento, ele atualiza a posição do elemento caso ele tenha obtido sucesso no movimento. Caso contrário, ele não faz nada.
