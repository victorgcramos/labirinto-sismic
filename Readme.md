# Jogo de Labirinto utilizando micro-controlador MSP430
## Autores
  Gabriela Lopes - 12/0060396
  Fernando Campelo - 14/0020144

## Descrição
  A proposta do projeto é implementar um jogo de labirinto utilizando o microcontrolador MSP430. O objetivo do jogo é atingir um ponto de chegada definido após atravessar um labirinto. A bola seria comandada por variações na inclinação que o jogador faz na plataforma através de um sensor, o MPU 6050, que é um dispositivo integrado que combina um acelerômetro de 3 eixos e um giroscópio também de 3 eixos. Os dados da posição serão transmitidos a um computador através de um módulo bluetooth via comunicação serial e visualizados no labirinto implementado em Java.
## Componentes
Os componentes utilizados no projeto serão o kit da Texas LaunchPad Evaluation Kit MSP430F5529, o MPU 6050, que é um dispositivo integrado que combina um acelerômetro de 3 eixos e um giroscópio também de 3 eixos e o módulo bluetooth HC-05. Os dados serão obtidos do MPU e o MSP430 fará o processamento. A comunicação entre os componentes será feita por meio da comunicação I2C.
