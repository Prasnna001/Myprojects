package Integer;

public class something {
    public static void main(String[] args) {
        int num[] ={2,3,3,2,1,7,1,7,5};
        int uni =0;
        for (int n: num) {
            uni ^= n;
        }
        System.out.println(uni);

    }
}
