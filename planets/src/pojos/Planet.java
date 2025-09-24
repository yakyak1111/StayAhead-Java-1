package pojos;

public class Planet {
    public String name;
    public long avgDistFromSun;
    public double radius;
    public boolean isTerrestrial;
    public String[] atmosphericConstituents;
    public static final double PI = 3.14159265359;

    public double cicumfrence(){
        var diameter = radius * 2;
        var circumfrence = PI * diameter;
        return circumfrence;}

        public long relativeDistFromSunComparedWith(Planet other){
            return avgDistFromSun / other.avgDistFromSun;}

            public double relativeSizeComparedWith(Planet other){
            return radius / other.radius;}

            public boolean isTheSameTypeAs(Planet other){
                return isTerrestrial == other.isTerrestrial;
            }
        }


