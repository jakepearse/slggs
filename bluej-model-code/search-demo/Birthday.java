
/**
 * Example solution to starter
 * 
 * converts birthdays to ints and back again
 * @author J Pearse 
 * @version 1
 */
public abstract class Birthday
{
    private static final int yFactor = 10000;
    private static final int mFactor = 100;

    /**
     * 
     * @return the date encoded as an int
     */
    public static int encode(int day, int month, int year)
    {
        return day + mFactor * month + yFactor * year;
    }
    
     /**
     * @param code a birthday encoded as an int
     * @return a 3 element array [day,month,year]
     */
    public static int[] decode(int code)
    {
        int year = code / yFactor;
        int monthAndDay = code - yFactor * year;
        int month = monthAndDay / mFactor;
        int day = monthAndDay - mFactor * month;
        return new int[]{day,month,year};
    }
}
