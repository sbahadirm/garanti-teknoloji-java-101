package org.bahadirmemis.oop.arrays;

/**
 * @author bahadirmemis
 */
public class Arrays3 {

  public static void main(String[] args) {

    int[][] matris = new int[3][3];
    matris[0][0] = 7;
    matris[0][1] = 75;
    matris[0][2] = 77;
    matris[1][0] = 79;
    matris[1][1] = 17;
    matris[1][2] = 2;
    matris[2][0] = 55;
    matris[2][1] = 79;
    matris[2][2] = 10;

    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        int value = matris[i][j];
        System.out.println(i + "," + j + " = " + value);
      }
    }

    System.out.println("boyut: " +  matris.length);
  }
}
