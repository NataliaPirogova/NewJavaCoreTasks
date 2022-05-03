package Pirogova.Lesson6_8.Matrix;

public class Matrix_objects {
   public static void main(String[] args) {
      Matrix Matrix1 = new Matrix(3,3);
      Matrix Matrix2 = new Matrix(new int[][]{{1,2,3},{9,0},{6}});

      Matrix1.print();
      System.out.println();
      Matrix2.print();
      System.out.println();
      Matrix1.multiply(2);
      System.out.println();
      Matrix1.summ(new int[][]{{1,1,1},{2,2,2},{3,3,3}});
   }
   }
