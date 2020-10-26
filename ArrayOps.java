import java.util.*;

public class ArrayOps{

// PART 4
  public static int sum(int[] arr)
    {
      int sum = 0;
      for (int i = 0; i < arr.length; i++)
        sum += arr[i];
      return sum;
    }

  public static int largest(int[] arr)
    {
      int max = 0;
      for (int i = 0; i < arr.length; i++)
        {
          max = Math.max(arr[i], max);
        }
      return max;
    }

  public static int[] sumRows(int[][] matrix)
    {
      int[] arraysum = new int[matrix.length];
      for (int i = 0; i < matrix.length; i++)
        {
          int indivsum = 0;
          for (int j = 0; j < matrix[0].length; j++)
            {
              indivsum += matrix[i][j];
            }
          arraysum[i] = indivsum;
        }
      return arraysum;
    }

  public static int[]largestInRows(int[][] matrix)
    {
      int[] maxeach = new int[matrix.length];
      for (int i = 0; i < matrix.length; i++)
        {
          int max = 0;
          for (int j = 0; j < matrix[0].length; j++)
            {
              max = Math.max(matrix[i][j], max);
            }
          maxeach[i] = max;
        }
      return maxeach;
    }

  public static int sum(int[][] arr)
    {
      int indivsum = 0;
      for (int i = 0; i < arr.length; i++)
        {
          for (int j = 0; j < arr[0].length; j++)
            {
              indivsum += arr[i][j];
            }
        }
      return indivsum;
    }

// PART 5
  public static int[] sumCols(int[][] matrix)
    {

    }
/*
  public static boolean isRowMagic(int[][] matrix)
    {

    }

  public static boolea isColMagic(int[][] matrix)
    {

    }

  public static boolean isLocationMagic(int[][] matrix, int row, int col)
    {

    }
  }
  }
*/
}
