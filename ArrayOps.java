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
      for (int j = 0; j < matrix.length; j++)
          arraysum[j] = sum(matrix[j]);
      return arraysum;
    }

  public static int[]largestInRows(int[][] matrix)
    {
      int[] maxeach = new int[matrix.length];
      for (int j = 0; j < matrix.length; j++)
        maxeach[j] = largest(matrix[j]);
      return maxeach;
    }

  public static int sum(int[][] arr)
    {
      int indivsum = 0;
      int[] rsum = sumRows(arr);
      for (int i = 0; i < arr.length; i++)
          indivsum += rsum[i];
      return indivsum;
    }

// PART 5 ----------------------------------------------
  public static int[] sumCols(int[][] matrix)
    {
      int[] total = new int[matrix[0].length];
      for (int i = 0; i < matrix[0].length; i++)
        {
          for (int j = 0; j < matrix.length; j++)
            {
              total[i] += matrix[j][i];
            }
        }
      return total;
    }

  public static boolean isRowMagic(int[][] matrix)
    {
      boolean same = false;
      int[] n = sumRows(matrix);
      for (int i = 0; i < matrix.length-1; i++)
        {
          if (n[i] == n[i+1])
            same = true;
          else
            same = false;
        }
      return same;
    }

    public static boolean isColMagic(int[][]matrix) {
      int[] n = sumCols(matrix);
      for (int i = 0; i < n.length - 1; i++)
        {
          if (n[i] != n[i+1])
            return false;
        }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col)
    {
      int colsum = 0;
      int rowsum = 0;
      for (int i = 0; i < matrix[0].length; i++)
        {
          colsum += matrix[row][i];
        }
      for (int i = 0; i < matrix.length; i++)
        {
          rowsum += matrix[i][col];
        }
      return rowsum == colsum;
    }

}
