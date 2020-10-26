import java.util.*;

public class ArrayOps{

  public static int sum(int[] arr)
    {
      int sum = 0;
      for (int i = 0; i < arr.length; i++)
        sum += arr[i];
      System.out.println(sum);
      return sum;
    }

  public static int largest(int[] arr)
    {
      int max = 0;
      for (int i = 0; i < arr.length; i++)
        {
          max = Math.max(arr[i], max);
        }
      System.out.println(max);
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
      System.out.println(Arrays.toString(arraysum));
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
      System.out.println(Arrays.toString(maxeach));
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
      System.out.println(indivsum);
      return indivsum;
    }

}
