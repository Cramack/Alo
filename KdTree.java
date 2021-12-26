/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Point2D;

public class KdTree {

    class KNode {
        public Point2D point;
        public KNode left, right;
    }

    private KNode root;

    public KdTree() {
        root = null;
    }

    public KNode createNode(Point2D point2D) {

        KNode node = new KNode();
        node.point = point2D;
        node.left = node.right = null;
        return node;
    }

    public int size() {
        return size(root);
    }

    public int size(KNode node) {

        if (node == null) {
            return 0;
        }

        return size(node.left) + size(node.right) + 1;
    }

    public void insert(Point2D p) {

        if (p == null) {
            throw new IllegalArgumentException();
        }
        

    }

    public boolean contain(Point2D p) {
        if (p == null) {
            throw new IllegalArgumentException();
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
