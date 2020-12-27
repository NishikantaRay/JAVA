public class foreach {
    static int[] arr = { 1, 2, 34, 5, 67 };
    static int max;

    public static void main(String args[]) {
        for (int s : arr) {
            max = arr[0];
            if(max<s){
                max=s;

            }
            
        }
        System.out.println(max);
    }
}
