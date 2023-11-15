public class Q6_5_1 {
    public static void main(String[] args) {
        int[] arrayResult = new int[10];        //配列arrayResult（要素数10）

        /* 値設定ループ */
        for (int i = 0; i < arrayResult.length; i++) {
            arrayResult[i] = 1;
        }

        /* 配列要素の表示 */
        for (int i = 0; i < arrayResult.length ; i++) {
            System.out.print(arrayResult[i] + " ");
        }
        System.out.println();
    }    
}
