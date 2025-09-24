package pojos;

public class Journey {

    public double distance;
    public double averagespeed;

    public double getTime() {
        return distance / averagespeed;
    }
}

