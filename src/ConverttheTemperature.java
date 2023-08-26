/*Question:
You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the
temperature in Celsius.You should convert Celsius into Kelvin and Fahrenheit and return it as an array
ans = [kelvin, fahrenheit].Return the array ans. Answers within 10^-5 of the actual answer will be accepted.
 */
/*Solution*/
public class ConverttheTemperature {
    public double[] convertTemperature(double celsius){
        double kel =celsius + 273.15;
        double fah =celsius * 1.80 + 32.00;
        double [] ans = {kel,fah};
        return ans;
    }
}
