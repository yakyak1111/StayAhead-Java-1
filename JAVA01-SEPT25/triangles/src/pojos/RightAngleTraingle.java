package pojos;

public class RightAngleTraingle {

    public double opposite;
    public double adjacent;

    public double unknownAngle (){
        var radians = Math.atan(opposite / adjacent);
        return Math.toDegrees(radians);}

        public double unknownSide() {
            var sumOfSquares = Math.pow(opposite, 2) + Math.pow(adjacent, 2);
            return Math.sqrt(sumOfSquares);
        }
    }

