public class Calculator {

    public int sum;
    public int subtract;
    public int multiply;
    public float divide;
    public float average;

    public float average(int no1, int no2, int no3) {
        float average = (no1 + no2 + no3) / 3f;
        return average;
    }
    public int subtract(int first, int second) {
        int substract = first - second;
        return substract;
    }
    public int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
    public int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }
    public float divide(float first, float second) {
        float divide = first / second;
        return divide;
    }
    public float modulo(float first, float second) {
        float modulo = first % second;
        return modulo;
    }

}
