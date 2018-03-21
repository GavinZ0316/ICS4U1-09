/****************************************************************************
 * My assingment1-09
 * Created by: Gavin Zhou 
 * Created on: Mar 2018
 *
 ****************************************************************************/
import java.util.Random;

 public class ST{

        private static int sum = 0;
        private static int count =0;
  
        public static void main(String[] args)
        {
                     String [][] a = new String[4][7];
                     
                     a[0][0] = "Student 1:";
                     a[1][0] = "Student 2:";
                     a[2][0] = "Student 3:";
                     a[3][0] = "Student 4:";
                     
                     for (int i = 0; i < 4;i++){
                            for (int j=1;j<7;j++){
                            int x = (int)(Math.random()*100+0);
                            a[i][j] = String.valueOf(x);
                            sum +=x;
                            count++;
                            }
                     }
                     for(int i=0;i < 4;i++){
                           for(int j =0;j<7;j++){
                                  System.out.print(a[i][j] + "   ");
                           }
                           System.out.println();
                     }
                     System.out.println("Class average = " + sum/count);
  
         }

}
