/************************************************************************
 * Purpose: Rounds a real number up to two decimal places by removing   *
 * the integer part of the real number and moving the decimal place     *
 * forward two places and removing the integer again leaving only the   *
 * fraction part. Compare this fraction with 0.444 recurring to         *
 * determine if the number needs rounding. If so add a 0.01 to the      *
 * imported number and then cut of whatever is remaing off the fraction.*
 * Date: 17/08/2017                                                     *
 * Import: toBeRounded(Real)                                            *
 * Export: rounded(Real)                                                *
 * *********************************************************************/
public static double roundTwoDeci(double toBeRounded)
{
	double rounding = 0.0;
	final double FOUR_NINTHS = 4.0/9.0;
		
	rounding = (toBeRounded * 100.0)  - ((int)(toBeRounded * 100.0));
	
	if(rounding > FOUR_NINTHS)
		toBeRounded = toBeRounded + 0.01;
		
	rounding = (double)((int)(toBeRounded * 100.0)) / 100.0;
		
	return rounding;
		
}//end roundTwoDeci
