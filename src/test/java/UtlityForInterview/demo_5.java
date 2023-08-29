package UtlityForInterview;

public class demo_5 {

	public static void main(String[] args) {
		final double SCALE = 2.0 * Math.PI / 360.0;
	    final double RADIUS = 6371000f;

	    
	        double displayLat = 43.753139;
	        double routingLat = 43.753139;
	        double displayLong = 143.503157;
	        double routingLong = 143.503157;

	        double PHI_H = SCALE * displayLat;
	        double PHI_N = SCALE * routingLat;

	        double cd_acos_value = (Math.sin(PHI_H) * Math.sin(PHI_N))
	          + (Math.cos(PHI_H) * Math.cos(PHI_N) * Math.cos(SCALE * (displayLong - routingLong)));

	        /* 	check for range */
	        if (cd_acos_value > 1.0f)
	            cd_acos_value = 1.0f;
	        else if (cd_acos_value < -1.0f)
	            cd_acos_value = -1.0f;
	        
	       double distanceInMeters = (double) (RADIUS * Math.acos(cd_acos_value));
	       
	       System.out.println("distanceInMeters : "+ distanceInMeters);

	    }

	}


