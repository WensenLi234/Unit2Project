public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double slope;
    private double yIntercept;
    private double distance;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.slope = slope();
        this.yIntercept = yIntercept();
        this.distance = distance();
    }
    public double slope() {
        return(roundToNearest(100,(y2 - y1) / (x2 - x1)));
    }
    public double yIntercept() {
        return(roundToNearest(100, y1 - (slope * x1)));
    }
    public double distance() {
        return(roundToNearest(100, Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))));
    }
    public String InterceptForm() {
        return("y = " + (int) (y2 - y1) + "/" + (int) (x2 - x1) + "x" + "+ " + yIntercept);
    }
    public double roundToNearest(int nearest, double value) {
        return(( (int) ((value + 0.5) * nearest)) / nearest);
    }
    public double findY(double x) {
        return(x * slope() + this.yIntercept);
    }
    public String toString() {
        return("x1: " + x1 + "\n" + "y1: " + y1 + "\n" + "x2: " + x2 + "\n" + "y2: " + y2 + "\n" + "Slope: " + slope + "\n"
        + "y-intercept: " + yIntercept + "\n" + "Slope-Intercept-Form: " + InterceptForm() + "\n" + "distance: " + distance);
    }
}
