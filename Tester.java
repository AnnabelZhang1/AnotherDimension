public class Tester{
  public static void main(String[] args)
    {
      ArrayOps.sum(new int[] {2,3,4});
      ArrayOps.largest(new int[] {3, 4, 10});
      ArrayOps.sumRows(new int[][] {{  1,  0, 12, -1 },
                                    {  7, -2,  2,  1 },
                                    { -5, -2,  2, -9 }});
      ArrayOps.largestInRows(new int[][] {{  1,  0, 12, -1 },
                                          {  7, -2,  2,  1 },
                                          { -5, -2,  2, -9 }});
      ArrayOps.sum(new int[][] {{  1,  0, 12, -1 },
                                {  7, -2,  2,  1 },
                                { -5, -2,  2, -9 }});
/*      ArrayOps.sumCols(new int[][] {{  12, 8, -14 },
                                    {  3, -4, 16, -9 }});
      ArrayOps.sumCols(new int[][] {{107, 105, 96},
                                    {45, 32, 39, 46, 31, 43, 30, 42}});
      ArrayOps.sumCols(new int[][] {{  65, 65, 65, 65 },
                                    {  50, 57, 64, 41, 48 }})*/
      ArrayOps.isColMagic(new int[][] {{  65, 65, 65, 65 },
                                        {  56, 62, 43, 49, 50}});//true
      ArrayOps.isColMagic(new int[][] {{  50, 57, 64, 41 },
                                        {  65, 65, 65, 65}});//false
      System.out.println("RowMagic");
      ArrayOps.isRowMagic(new int[][] { {  1,  1, 1 },
                                        {  2, 2, 2 },
                                        { 3,  3, 3 }});
      ArrayOps.isRowMagic(new int[][] { { 2, 2, 2 },
                                        { 2, 2, 2 }});
      int[][]E = {{  2,  4, 2 }, {  2, 2, 2 }};
      ArrayOps.isLocationMagic(E, 0, 1);
      ArrayOps.isLocationMagic(E, 1, 1);

    }



}
