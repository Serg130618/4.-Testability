public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1100;
        int condition = 1000;
        int bonus = 0; // bonus = b
        if (refill > condition)
            bonus = refill / 100;

        System.out.println(account + refill + bonus);
        System.out.println(bonus);
    }
}