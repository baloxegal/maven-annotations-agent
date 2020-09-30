package domain;

import instruments.AddConstructor;

@AddConstructor
public class Box {
	
	private int id;
	private String country;
	
	
	@Override
	public String toString() {
		return "Box [id=" + id + ", country=" + country + "]";
	}	

}
