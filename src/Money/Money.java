package Money;
/**
 * This represents the money class in monopoly.
 */
public class Money
{
    public static int[] money = {1, 5, 10, 20, 50, 100, 500};

    /**
     * Fills an array where each index contains a number of particular bills.
     * @param monetaryAmount the amount of money the player wants in bill form
     * @return an array specifying the number of bills for each type of bill.
     * Index 0 would show the number of one dollar bills and index 6 would show the amount
     * of 500 dollar bills
     */
    public static int[] getBills(int monetaryAmount)
    {
        int[] bills = new int[7];

        for (int j = money.length - 1; j >= 0; j--)
        {
            for (int i = 0; i < monetaryAmount/money[j]; i++)
                bills[j]++;
            monetaryAmount = monetaryAmount % money[j];
        }

        return bills;
    }
    
    /**
     * Sets the default cash stack for player. 
     * @return default cash stack for player. 
     */
    public static int[] setBills()
    {
    	int[] defaultCashStack = new int[7];
    		defaultCashStack[0] += Money.money[0]*5;
    		defaultCashStack[1] +=  Money.money[1]*5;
    		defaultCashStack[2] +=  Money.money[2]*5;
    		defaultCashStack[3] +=  Money.money[3]*6;
    		defaultCashStack[4] +=  Money.money[4]*2;
    		defaultCashStack[5] +=  Money.money[5]*2;
    		defaultCashStack[6] +=  Money.money[6]*2;
    		return defaultCashStack;
    }
}
