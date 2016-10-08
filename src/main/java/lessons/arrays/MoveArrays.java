package lessons.arrays;

/**
 * Created by dennis on 10/7/16.
 */
public class MoveArrays {

    public static void main(String[] args) {

        //moveArrayByKPlaces();
        int[][] data = {{0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}};

        int[][] counterClockwise = moveArrayCC(data);
        System.out.println(counterClockwise);

    }

    /**
     *0   0 1 2 3
     *
     * 1  4 5 6 7
     *
     * 2  8 9 10 11
     *
     * 3  12 13 14  15  16
     *=================
     *
     *   3  7 11 15
     *   2  6 10 14
     *   1  5 9 13
     *   0  4 8 12
     */

    private static int[][] moveArrayCC(int[][] data) {
        int rows = data.length;
        int cols = data[0].length;

        int[][] newArray = new int[rows][cols];
        for(int i = 0; i < cols ; i++){
            for(int j = rows - 1; j >= 0; j--){
                int row = rows - j - 1;
                newArray[row][i] = data[i][j];

            }
        }

        return newArray;

        //System.out.println("Cols:" + newArray);

    }

    private static void moveArrayMatrix(int[][] data) {

        int[][] newArray = new int[data.length][data[0].length];
        for(int i=0; i<data[0].length; i++){
            for(int j=data.length-1; j>=0; j--){
                newArray[j][i] = data[j][i];
            }
        }

        System.out.println("Cols:" + newArray);

    }

    private static void moveArrayByKPlaces() {
        int[] data = {0, 1,2,3,4,5,6};
        int k = 3;
        int size = data.length;

        int[] result = new int[data.length];

        for (int i=0; i < size;i++) {
            int moveIndex = i - k;
            moveIndex = moveIndex >= 0 ? moveIndex : size + moveIndex;
            result[moveIndex] = data[i];
        }

        System.out.println(data);
    }
}
