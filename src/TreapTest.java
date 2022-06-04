import org.junit.jupiter.api.Test;
import java.util.Random;
public class TreapTest {
    private static final long SEED = 123123L;
    private static final int MAX_VAL = Integer.MAX_VALUE;
    private static final Random RAND = new Random(SEED);
    private static long start;

        private static long rand(long max) {
            return RAND.nextLong();
        }

        @Test
        void testadd10(){
            Treap dec = new Treap(1,5);
            System.out.println("Test 1 - 10 elements");
            start = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                dec.add(RAND.nextInt(MAX_VAL));
            }
            System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
        }

        @Test
        void testadd100(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 100 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            dec.add(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testadd1000(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 1000 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            dec.add(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testadd10000(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 10000 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            dec.add(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testremove10(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 1 - 10 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            dec.remove(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testremove100(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 100 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            dec.remove(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testremove1000(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 1000 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            dec.remove(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testremove10000(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 10000 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            dec.remove(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testcontains10(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 1 - 10 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            dec.contains(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testcontains100(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 100 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            dec.contains(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testcontains1000(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 1000 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            dec.contains(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testcontains10000(){
        Treap dec = new Treap(1,5);
        System.out.println("Test 2 - 10000 elements");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            dec.contains(RAND.nextInt(MAX_VAL));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
}
