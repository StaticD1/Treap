import java.util.Random;

public class Treap {

    public int x;
    public int y;
    public Treap left;
    public Treap right;

    static final Long SEED = 123L;
    private static final Random RAND = new Random(SEED) ;

    public Treap(int x) {
        this(x, RAND.nextInt());
    }
    public Treap(int x, int y) {
        this(x, y, null, null);
    }
    public Treap(int x, int y, Treap left, Treap right) {
        this.x = x;
        this.y = y;
        this.left = left;
        this.right = right;
    }

    public Treap merge(Treap L, Treap R) {
        if (L == null) return R;
        if (R == null) return L;

        if (L.y > R.y) {
            Treap newR = merge(L.right, R);
            return new Treap(L.x, L.y, L.left, newR);
        } else {
            Treap newL = merge(L, R.left);
            return new Treap(R.x, R.y, newL, R.right);
        }
    }


    public Treap[] split(int x) {
        Treap newTree = null;
        Treap L, R;
        if (this.x < x) {
            if (right == null) {
                R = null;
            } else {
                Treap[] tmp = right.split(x);
                newTree = tmp[0];
                R = tmp[1];
            }
            L = new Treap(this.x, this.y, left, newTree);
        } else {
            if (left == null) {
                L = null;
            } else {
                Treap[] tmp = left.split(x);
                L = tmp[0];
                newTree = tmp[1];
            }
            R = new Treap(this.x, this.y, newTree, right);
        }
        return new Treap[]{L, R};
    }

    public Treap add(int x) {
        Treap[] t = split(x);
        Treap l = t[0];
        Treap r = t[1];
        Treap m = new Treap(x);
        return merge(merge(l, m), r);
    }

    public Treap remove(int x) {

        if (this.x == x)
            return merge(left, right);

        if (this.x > x && left != null)
            left = left.remove(x);

        if (this.x < x && right != null)
            right = right.remove(x);

        return this;
    }


    public boolean contains(int x) {

        if (this.x == x) return true;

        if (this.x > x && left != null) return left.contains(x);

        if (this.x < x && right != null) return right.contains(x);

        return false;
    }
}
