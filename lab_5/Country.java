import java.util.List;
import java.util.ArrayList;

class Country implements Comparable<Country>
	{
		String code;
		String name;
		String continent;
		double surfaceArea;
		int population;
		double gnp;
		int capital;
		List<City> cities;
		
		public Country(){}
		public Country(String code, String name, String continent, int population, double surfaceArea, double gnb, int capital)
			{
				this.code = code;
				this.name = name;
				this.continent = continent;
				this.population = population;
				this.surfaceArea = surfaceArea;
				this.gnp = gnp;
				this.capital = capital;
				this.cities = new ArrayList<City>();
				
			}

		public void setCode(String code) {this.code = code;}
		public void setName(String name) {this.name = name;}
		public void setContinent(String continent) {this.continent = continent;}
		public void setsurfaceArea(double surfaceArea) {this.surfaceArea = surfaceArea;}
		public void setPopulation(int population) {this.population = population;}
		public void setGnp(double gnp) {this.gnp = gnp;}
		public void setCapital(int capital) {this.capital = capital;}
		public void setCities(List<City> cities) {this.cities = cities;}

		public String getCode() {return this.code;}
		public String getName() {return this.name;}
		public String getContinent() {return this.continent;}
		public double getsurfaceArea() {return this.surfaceArea;}
		public int getPopulation() {return this.population;}
		public double getGnp() {return this.gnp;}
		public int getCapital() {return this.capital;}
		public List<City> getCities() {return this.cities;}

		@Override
		public boolean equals(Object candidate_obj)
			{
				Country candidate = (Country) candidate_obj;
				return this.code.equals(candidate.code);
			}

		@Override
		public int compareTo(Country candidate)
			{
				if (this.population > candidate.population) return 1;
				else if (this.population < candidate.population) return -1;
				else return 0;
			}
		@Override
		public String toString(){return name + ":" +population;}

		public City getCapitalCity()
			{
			for (City city : this.cities) if (city.id == this.capital) return city;
			return null;
			}

	}