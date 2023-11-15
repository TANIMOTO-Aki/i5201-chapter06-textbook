public class Q6_5_2 {
    public static void main(String[] args) {
        int[] arrayNo = new int[10];            //配列arrayNo(要素数10)

        /* 値設定ループ */
        for (int i = 0; i < arrayNo.length; i++) {
            arrayNo[i] = i + 1;
        }

        /* 配列要素の表示 */
        for (int i = 0; i < arrayNo.length; i++) {
            System.out.print(arrayNo[i] + " ");
        }
        System.out.println();
    }
}
