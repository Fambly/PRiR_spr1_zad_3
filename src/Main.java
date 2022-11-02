public class Main {
    static public void main(String[] args) throws Exception {
        negatyw neg = new negatyw("pisi.jpg");
        negatyw n2 = new negatyw("catch.jpg");
        negatyw n3 = new negatyw("butter.jpg");
        neg.start();
        n2.start();
        n3.start();
        try {
            neg.join();
            n2.join();
            n3.join();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Zakończono odwracanie kolorów.");
    }
}
