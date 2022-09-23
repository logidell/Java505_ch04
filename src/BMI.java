public class BMI {
    public String name;
    public int weight;
    public double heghit;
    private double bmi;


    public double getBmi() {
        return bmi;
    }


    public void setMyInfo(int heghit, int weight) {
        this.heghit = heghit / 100.0;
        this.weight = weight;
        calcBmi(this.weight, this.heghit);
    }

    private void calcBmi(double heghit, double weight) {
        this.bmi = (double) weight / ((heghit * heghit));

    }

}
