public class Labirinto {
  /**
  * Cada cédula do labirinto vai ser descrita por:
  * 0: parede
  * 1: caminh
  * 2: elemento
  * 3: final
  */
  public int[][] labirinto = new int[][]{
    { 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0 },
    { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
    { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
    { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
    { 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 3 }
  };

  /**
   * public void - função que movimenta o elemento no labirinto
   *
   * @param  {int} x coordenada x atual
   * @param  {int} y coordenada y atual
   * @param  {int} next_x coordenada x futura
   * @param  {int} next_y coordenada y futura
   */
  public int percorrer (int x, int next_x, int y, int next_y){

    try{
      // Caso chegue ao final:
      if (this.labirinto[next_x][next_y] == 3) {
        this.labirinto[x][y] = 1;
        this.labirinto[next_x][next_y] = 4;
        return 2;
      }
      // Caso a casa que ele deseja ir esteja livre:
      else if (this.labirinto[next_x][next_y] == 1) {
        this.labirinto[x][y] = 1;
        this.labirinto[next_x][next_y] = 2;
      }
      else{
        return 0;
      }
    }
    catch(Exception e){
      return 0;
    }
    return 1;
  }


  /**
   * public void printLabirinto - prrinta todo o labirinto, substituindo:
   * 0 -> I (parede)
   * 1 -> _  (espaco livre)
   * 2 -> * (elemento)
   * 3 -> 0 (fim)
   * 4 -> (*) (venceu)
   *
   */
  public void printLabirinto () {
    for (int i = 0; i< this.labirinto.length ; i++ ) {
      for (int j = 0; j<this.labirinto[i].length ; j++ ) {
        int l = this.labirinto[i][j];
        switch (l){
          case 0:
            System.out.print("I");
          break;
          case 1:
            System.out.print("_");
          break;
          case 2:
            System.out.print('*');
          break;
          case 3:
            System.out.print('O');
          break;
          case 4:
            System.out.print("(*)");
          break;
        }
      }
      System.out.println();
    }
  }

}
