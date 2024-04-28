package kiemtra;

public class cau1 {
	public static int F(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return F(n-1) + F(n-2);
        }
    }

    public static void main(String[] args) {
        int result = F(8);
        System.out.println("Giá trị của F(8) là: " + result);
    }
}

