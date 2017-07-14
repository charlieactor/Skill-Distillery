package data;

public class State {
  private String abbrev;
  private String name;
  private String capital;
  private String latitude;
  private String longitude;
  private int population;
  private String fact;
  

  public String getFact() {
	return fact;
}

public void setFact(String fact) {
	this.fact = fact;
}

public String getAbbrev() {
	return abbrev;
}

public void setAbbrev(String abbrev) {
	this.abbrev = abbrev;
}

public int getPopulation() {
	return population;
}

public void setPopulation(int population) {
	this.population = population;
}

public State() {
  }
  
  public State(String abbreviation, String name, String capital, String latitude, String longitude, int population, String fact) {
    this.abbrev = abbreviation;
    this.name = name;
    this.capital = capital;
    this.latitude = latitude;
    this.longitude = longitude;
    this.population = population;
    this.fact = fact;
  }

  public String getAbbreviation() {
    return abbrev;
  }
  public String getName() {
    return name;
  }
  public String getCapital() {
    return capital;
  }
  public String getLatitude() {
    return latitude;
  }
  public String getLongitude() {
    return longitude;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbrev = abbreviation;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setCapital(String capital) {
    this.capital = capital;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  @Override
  public String toString() {
    return "State [abbreviation=" + abbrev + ", name=" + name + ", capital=" + capital + "]";
  }

}
