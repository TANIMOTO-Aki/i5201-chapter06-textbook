public class Practice6_3 {
    public static void main(String[] args) {
        int[] arrayAdm = { 856,861,862,854,864,846,848};

        int min = arrayAdm[0];
        for (int i = 1; i < arrayAdm.length; i++) {
            if (min > arrayAdm[i]) {
                min = arrayAdm[i];
            }
        }
        System.out.println("最小=" + min);
    }
}
