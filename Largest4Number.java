public class Largest4Number {
 public static void main(String[] args) {
    int x = 1000;
    int y = 9999;

    int num = 0;

    for(int i = x; i <= y; i++) {
        if(i%130 == 0) {
            num = i;
        }
    }
    System.out.println(num);;
 }
}