package codility;

/**
 * Created by dennis on 6/25/16.
 */
public class BinaryGap {

    public static void main(String[] args) {

        BinaryGap bgap = new BinaryGap();

        System.out.println(2 == bgap.getBinaryGap(9));

    }

    public int getBinaryGap(int N) {
        char[] binToString = Integer.toBinaryString(N).toCharArray();
        int gapCounter = 0;
        int maxGapCounter = 0;
        for(char c : binToString) {
          if (c == '0') {
              gapCounter++;
          } else {
              if (gapCounter > 0
                      && gapCounter > maxGapCounter) {
                  maxGapCounter = gapCounter;
              }
              gapCounter = 0;
          }
        }
        return maxGapCounter;
    }
}
