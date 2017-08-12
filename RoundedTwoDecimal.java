public static double roundToTwoDec(double areaMM)
	{
		double areaToBeRounded;
		
		areaToBeRounded = (areaMM - (int)areaMM) * 100.0;
		areaToBeRounded = (areaToBeRounded - (int)areaToBeRounded) * 10.0;
		
		if(areaToBeRounded > (40/9))
		{
			areaToBeRounded = (10.0 - areaToBeRounded) / 1000.0;
			areaMM = areaToBeRounded + areaMM;
		}
		
		areaMM = (double)((int)(areaMM * 100.0)) / 100.0;
		
		return areaMM;
	}
