public class FlipArray {
     static String iTwoe;
     static String iOne;

    // мняем местами 1 и 2 индекс
    public static void flipArray(String[] flipArray) {
        iOne = flipArray[1];
        iTwoe = flipArray[2];
        flipArray[1] = iTwoe;
        flipArray[2] = iOne;
        for (int i = 0; i < flipArray.length; i++) {

            System.out.print(flipArray[i] + " ");
        }


    }
}
