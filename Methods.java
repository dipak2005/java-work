
public class Methods {

    public static int binarytoDecimal(int binum) {
        int pow = 0;
        int dec = 0;

        while (binum > 0) {
            int ld = binum % 10;
            dec = dec + ld * (int) (Math.pow(2, pow));
            pow++;
            binum = binum / 10;
        }
        return dec;
    }

    public static int dectoBinary(int num) {

        int pow = 0;
        int binarybum = 0;
        while (num > 0) {
            int remainder = num % 2;
            binarybum = binarybum + remainder * (int) Math.pow(10, pow);
            pow++;
            num = num / 2;
        }
        return binarybum;
    }

    public static void main(String[] args) {
        System.err.println(binarytoDecimal(101));
        System.err.println(dectoBinary(5));
    }

}
