public class FunWith2DArrays {

    public static int totalElements(int[][] temp)
    {
        int numRows = 0;
        int count = 0;
        for (int i = 0; i < temp.length; i++)
        {
            numRows = temp[i].length;
            count++;
        }
        return (numRows * count);
    }

    public static void fourCorners(String[][] temp)
    {
        int numRows = temp.length;
        int numColumns = temp[0].length;


        System.out.println(temp[0][0]);
        System.out.println(temp[0][numColumns - 1]);
        System.out.println(temp[numRows - 1][0]);
        System.out.println(temp[numRows - 1][numColumns - 1]);

    }
}
