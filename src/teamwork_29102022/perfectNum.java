package teamwork_29102022;

public class perfectNum {
    public static void main(String[] args) {
        int perfectNum=28;
        double toplam = 0;

        for (int i = 1; i < perfectNum; i++) {
            if (perfectNum % i == 0) {
                toplam+=i;
            }
        }
        if (toplam == perfectNum) {
            System.out.println(perfectNum + " Mükemmel bir sayidir.");
        } else {
            System.out.println(perfectNum + " Mükemmel bir sayi degildir.");
        }
    }

}
