class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nearestx = Math.max(x1,Math.min(x2,xCenter));
        int nearesty = Math.max(y1,Math.min(y2,yCenter));

        int x = nearestx-xCenter;
        int y = nearesty-yCenter;

        return Math.pow(x,2)+Math.pow(y,2)<=Math.pow(radius,2);

    }
}
