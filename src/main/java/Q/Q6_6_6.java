import java.io.*;

public class Q6_6_6 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 配列の宣言と初期化 */
        String[] arrayName = {"",
                    "A1","A2","A3","A4","A5","A6","A7","A8","A9","A10",
                    "B1","B2","B3","B4","B5","B6","B7","B8","B9","B10",
                    "C1","C2","C3","C4","C5","C6","C7","C8","C9","C10"};
        
        /* データ入力と名前の表示 */
        System.out.print("クラス1,2,3,)>");
        int classNo = Integer.parseInt(br.readLine());
        System.out.print("番号(1-10)>");
        int number = Integer.parseInt(br.readLine());
        int idx = (classNo*10-10) + number;     //クラスと番号からidxを算出
        String name = arrayName[idx];           //配列から氏名設定
        System.out.println(name);
    }
}
