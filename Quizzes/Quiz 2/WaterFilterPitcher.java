public class WaterFilterPitcher {
    private String make;
    private String color;
    private double totalCapacity;
    private double curWaterAmount;
    private int filterLife;
    private int curFilterUsage;
    private final double LitersPerFilterLifeUnit = 5.0;

    public WaterFilterPitcher(String make, String color, double totalCapacity, int filterLife) {
        this.make = make;
        this.color = color;
        this.totalCapacity = totalCapacity;
        this.filterLife = filterLife;
        this.curWaterAmount = 0;
        this.curFilterUsage = 0;
    }

    public boolean fill(double liters) {
        if (curWaterAmount + liters > totalCapacity) {
            return false;
        }
        curWaterAmount += liters;
        curFilterUsage += (int)(liters / LitersPerFilterLifeUnit);
        return true;
    }

    public boolean pour(double liters) {
        if (liters > curWaterAmount) {
            return false;
        }
        curWaterAmount -= liters;
        return true;
    }

    public void empty() {
        curWaterAmount = 0;
    }

    public boolean checkFilter() {
        return curFilterUsage < filterLife;
    }

    public String toString() {
        return "Make: " + make + ", Color: " + color + ", Capacity: " + totalCapacity +
               ", Current Water: " + curWaterAmount + ", Filter Life: " + filterLife +
               ", Used: " + curFilterUsage;
    }
}
