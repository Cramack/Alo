/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842 , 作业5
 **************************************************************************** */

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.SET;

import java.util.Iterator;
import java.util.TreeSet;

public class PointSET {

    private TreeSet<Point2D> mPointSet;


    public PointSET() {
        mPointSet = new TreeSet<Point2D>();

    }

    // is the set empty?
    public boolean isEmpty() {
        return size() == 0;
    }

    // number of points in the set
    public int size() {

        return mPointSet.size();
    }

    // add the point to the set (if it is not already in the set)
    public void insert(Point2D p) {

        if (p == null) {
            throw new IllegalArgumentException();
        }
        mPointSet.add(p);

    }

    // does the set contain point p?
    public boolean contains(Point2D p) {
        if (p == null) {
            throw new IllegalArgumentException();
        }
        return mPointSet.contains(p);

    }

    // draw all points to standard draw
    public void draw() {

        Iterator<Point2D> itr = mPointSet.iterator();
        while (itr.hasNext()) {
            Point2D point = itr.next();
            point.draw();
        }
    }

    public Iterable<Point2D> range(RectHV rect) {

        if (rect == null) {
            throw new IllegalArgumentException();
        }
        SET<Point2D> pointSet = new SET<Point2D>();
        Iterator<Point2D> itr = mPointSet.iterator();
        while (itr.hasNext()) {
            Point2D point = itr.next();
            if (rect.contains(point)) {
                pointSet.add(point);
            }
        }
        return pointSet;
    }

    // a nearest neighbor in the set to point p; null if the set is empty
    public Point2D nearest(Point2D p) {

        if (p == null) {
            throw new IllegalArgumentException();
        }
        if (size() == 0) {
            return null;
        }
        Point2D p1 = null;
        double dis = 1;
        Iterator<Point2D> itr = mPointSet.iterator();
        while (itr.hasNext()) {
            Point2D point = itr.next();
            double tmpDis = p.distanceSquaredTo(point);
            if (tmpDis < dis) {
                dis = tmpDis;
                p1 = point;
            }
        }
        return p1;
    }


    public static void main(String[] args) {

        if (args.length <= 0) {
            throw new IllegalArgumentException();
        }
        

    }
}
