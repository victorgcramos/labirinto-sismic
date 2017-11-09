import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    DataInputStream in =new DataInputStream(System.in);
    Labirinto lab = new Labirinto();

    // Valores iniciais de X e Y
    int x = 0, y = 0;
    char c = 'a';

    System.out.println("Começou o labirinto! Use [w] [a] [s] [d] para se mover");
    System.out.println("* - voce\nI - barreira\n_ - espaco livre\n0 - Fim");
    lab.printLabirinto();
    System.out.println();
    while(c!='q'){
      int moveu = 0;
      byte b = in.readByte();
      c = (char) b;
      // lab.printLabirinto();
      if (c == 'w') {
        moveu = lab.percorrer(x,x-1,y,y);
        if(moveu==1){
          x=x-1;
        }

      }
      if (c == 'a') {
        moveu = lab.percorrer(x,x,y,y-1);
        if(moveu==1){
          y=y-1;
        }

      }
      if (c == 's') {
        moveu = lab.percorrer(x,x+1,y,y);
        if(moveu==1){
          x=x+1;
        }

      }
      if (c == 'd') {
        moveu = lab.percorrer(x,x,y,y+1);
        if(moveu==1){
          y=y+1;
        }
      }
      lab.printLabirinto();
      // System.out.println("x: " + x + "; y: "+y);
      if (moveu == 2) {
        System.out.println("VOCE GANHOU!!");
        c='q';
      }
    }

  }


}
