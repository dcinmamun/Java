
package twodarray;

import com.sun.javafx.geom.Matrix3f;
import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
        ////Array in java programming////

        int [][] twoArray= {{10,20,30},{30,40,50},{50,60,70}};

        System.out.println(Arrays.deepToString(twoArray));
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(twoArray [i][j]+(" "));
            }
            System.out.println("");
        }
////////////// bad practice for 2D Array//
//    int [][] twoArray =new int [3][3];
//        twoArray [0][0]=20;
//        twoArray [0][1]=30;
//        twoArray [0][2]=40;
//        
//        twoArray [1][0]=40;
//        twoArray [1][1]=50;
//        twoArray [1][2]=60;
//        
//        twoArray [2][0]=60;
//        twoArray [2][1]=70;
//        twoArray [2][2]=80;
//        
//        System.out.println(twoArray [0][0]);
        
    }
    
}
