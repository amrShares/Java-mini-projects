class City implements Comparable<City>
	{
		int id;
		String name;
		int population;
		String countryCode;
		
		public City(){}
		public City(int id, String name, String countryCode, int population)
			{
				this.id = id;
				this.name = name;
				this.population = population;
				this.countryCode = countryCode;				
			}

		public void setId(int id) {this.id = id;}
		public void setName(String name) {this.name = name;}
		public void setPopulation(int population) {this.population = population;}
		public void setCountryCode(String countryCode) {this.countryCode = countryCode;}

		public int getId() {return this.id;}
		public String getName() {return this.name;}
		public int getPopulation() {return this.population;}
		public String getCountryCode() {return this.countryCode;}

		@Override
		public boolean equals(Object candidate_obj)
			{
				City candidate = (City) candidate_obj;
				return candidate.id == this.id ? true : false;
			}
		@Override
		public int compareTo(City candidate)
			{
				return this.population - candidate.population;
			}

		@Override
		public String toString(){return this.name + ":" + this.population;}

	}