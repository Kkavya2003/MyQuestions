/*Question:
There are numBottles water bottles that are initially full of water. You can exchange numExchange
empty water bottles from the market with one full water bottle.
The operation of drinking a full water bottle turns it into an empty bottle.
Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
 */
/*Solution*/
public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int temp = 0;
        while (numExchange <= numBottles) {
            temp = numBottles % numExchange;
            numBottles -= temp;
            count += (numBottles / numExchange);
            numBottles = (numBottles / numExchange) + temp;
        }
        return count;
    }
}
