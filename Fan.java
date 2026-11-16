public class Fan {

public static final int STOPPED = 0;
public static final int SLOW = 1;
public static final int MEDIUM = 2;
public static final int FAST = 3;

private int speed = STOPPED;
private boolean on = false;
private double radius = 6;
private String color = "white";

public Fan() {
    setSpeed(STOPPED);
    setOn(false);
    setRadius(6);
    setColor("white");
}

public Fan(int speed, boolean on, double radius, String color) {
    setSpeed(speed);
    setOn(on);
    setRadius(radius);
    setColor(color);
}

// Getter and setter for speed
public int getSpeed() {
    return speed;
}

public void setSpeed(int speed) {
    if (speed < STOPPED || speed > FAST) {
        throw new IllegalArgumentException("Invalid fan speed.");
    }

    this.speed = speed;
}

// Getter and setter for on
public boolean isOn() {
    return on;
}

public void setOn(boolean on) {
    this.on = on;
}

// Getter and setter for radius
public double getRadius() {
    return radius;
}

public void setRadius(double radius) {
    if (radius <= 0) {
        throw new IllegalArgumentException("Radius must be greater than zero.");
    }

    this.radius = radius;
}

// Getter and setter for color
public String getColor() {
    return color;
}

public void setColor(String color) {
    if (color == null || color.trim().isEmpty()) {
        throw new IllegalArgumentException("Color cannot be empty.");
    }

    this.color = color;
}

@Override
public String toString() {
    String speedDescription;

    if (speed == STOPPED) {
        speedDescription = "STOPPED";
    } else if (speed == SLOW) {
        speedDescription = "SLOW";
    } else if (speed == MEDIUM) {
        speedDescription = "MEDIUM";
    } else {
        speedDescription = "FAST";
    }

    return "Speed: " + speedDescription
            + ", On: " + on
            + ", Radius: " + radius
            + ", Color: " + color;
}

public static void main(String[] args) {

    // Create a fan using the no-argument constructor
    Fan fan1 = new Fan();

    // Create a fan using the argument constructor
    Fan fan2 = new Fan(Fan.FAST, true, 10, "yellow");

    // Display both fans
    System.out.println("Default Fan:");
    System.out.println(fan1);

    System.out.println("\nSecond Fan:");
    System.out.println(fan2);

    // Test setter methods
    fan1.setSpeed(Fan.MEDIUM);
    fan1.setOn(true);
    fan1.setRadius(8);
    fan1.setColor("blue");

    System.out.println("\nUpdated Default Fan:");
    System.out.println(fan1);

    // Test getter methods
    System.out.println("\nTesting Getters:");
    System.out.println("Speed: " + fan1.getSpeed());
    System.out.println("On: " + fan1.isOn());
    System.out.println("Radius: " + fan1.getRadius());
    System.out.println("Color: " + fan1.getColor());
}

}