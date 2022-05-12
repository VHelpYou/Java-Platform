package ss.training.java.multithreading.sync;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlockDemo {

}

class Cities {
	private static List<String> cities = new ArrayList<>();
	private String cityName;
	public int numCities = 0;
	
	Cities(String cityName) {
		this.cityName = cityName;
	}
	
	public List<String> addCity() {
		
		synchronized(this)
        {
			cities.add(cityName);
			numCities++;
        }
		// Lets have more code related to not shared Object
		return cities;
	}
}
