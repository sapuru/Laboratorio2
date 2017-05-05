/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsuma;

/**
 *
 * @author macbook
 */
public class clasSuma {

    int vectorA[] = {2, 3, 4, 5};
    int vectorB[] = {6, 7, 8, 9};

    public int[] sumaVecAB(int vectorA[], int vectorB[]) {     //caso 3 suma los valores de ambos vectores y lo guarda en Vector C
        int vectorC[] = new int[4];
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println("Vector C: " + vectorC[i]);
        }
        return vectorC;
    }

    void sumaVecAB(int[] vectorA, int[] vectorB, int[] vectorC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}