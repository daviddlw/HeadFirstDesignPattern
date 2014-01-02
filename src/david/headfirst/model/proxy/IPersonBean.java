package david.headfirst.model.proxy;

public interface IPersonBean {
	
	public String getName();
	
	public String getGender();
	
	public String getInterests();
	
	public double getHotOrNotRating();
	
	public void setName(String name);
	
	public void setGender(String gender);
	
	public void setInterests(String interests);
	
	public void setHotOrNotRating(int rating);
}
