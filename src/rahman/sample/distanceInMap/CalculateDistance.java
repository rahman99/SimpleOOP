package rahman.sample.distanceInMap;

public class CalculateDistance {

	public static void main(String[] args) {

		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") + " Miles\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "K") + " Kilometers\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n");
	}
	
	private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
		double theta = lon1 - lon2;
		double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + 
					  Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));

		dist = Math.acos(dist);
		dist = Math.toDegrees(dist);
		switch (unit) {
		case "K":
			dist = dist * 1.609344;
			break;
			
		case "N" :
			dist = dist * 0.8684;
			break;

		default:
			dist = dist * 60 * 1.1515;
			break;
		}
		/*dist = dist * 60 * 1.1515;
		System.out.println("4"+dist);
		if (unit == "K") {
			dist = dist * 1.609344;
		} else if (unit == "N") {
			dist = dist * 0.8684;
		}*/

		return (dist);
	}

}
