public class SpinningTop

{
    private String make;
    private double height;
    private double maxSpeed;
    private double curSpeed;
    private int curDirection;

    public SpinningTop(String make, double height, double maxSpeed) {
        this.make = make;
        this.height = height;
        this.maxSpeed = maxSpeed;
        this.curSpeed = 0;
        this.curDirection = 0; // initially static
    }

    // gettters

    public String getMake() {
        return make;
    }

    public double getHeight() {
        return height;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurSpeed() {
        return curSpeed;
    }

    public int getCurDirection() {
        return curDirection;
    }

    // setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCurSpeed(double curSpeed) {
        this.curSpeed = curSpeed;
    }

    public void setCurDirection(int curDirection) {
        this.curDirection = curDirection;
    }

    //  rotate() it 0 is no moving 1 is clockwise 2 counter ect and so on
    public boolean rotate(double speed, boolean clockwise) {
        if (curDirection != 0) {
            return false; // cannot rotate if already moving
        }

        if (speed > maxSpeed) {
            speed = maxSpeed; // cap speed
        }

        curSpeed = speed;
        curDirection = clockwise ? 1 : 2;
        return true;
    }


    public void stop() {
        curSpeed = 0;
        curDirection = 0;
    }

    // accelerate() makes it faster if tthe user wants it to be
    public boolean accelerate(double increase) {
        if (curDirection == 0) {
            return false; // cannot accelerate if not moving
        }

        curSpeed += increase;
        if (curSpeed > maxSpeed) {
            curSpeed = maxSpeed;
        }
        return true;
    }

    // toString() 
    public String toString() {
        String dir;
        if (curDirection == 0) dir = "Not moving";
        else if (curDirection == 1) dir = "Clockwise";
        else dir = "Counterclockwise";

        return "SpinningTop [Make: " + make +
                ", Height: " + height +
                ", Max Speed: " + maxSpeed +
                ", Current Speed: " + curSpeed +
                ", Direction: " + dir + "]";
    }

}
