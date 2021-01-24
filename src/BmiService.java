public class BmiService {
    public float calculate(float weight, double height){
        double squareHeight = height * height;
        double mass_index = weight / squareHeight;

        return (float) mass_index;
    }
}
