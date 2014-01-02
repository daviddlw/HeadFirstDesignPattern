package david.headfirst.model.proxy;

public class PersonBeanImp implements IPersonBean {

	private String name;
	private String gender;
	private String interests;
	private double rate;
	private int rateCount;
	
	public PersonBeanImp() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonBeanImp(String name, String gender, String interests){
		this.name = name;
		this.gender = gender;
		this.interests = interests;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public String getInterests() {
		// TODO Auto-generated method stub
		return interests;
	}

	@Override
	public double getHotOrNotRating() {
		// TODO Auto-generated method stub
		if (rateCount == 0)
			return 0;
		return rate / rateCount;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}

	@Override
	public void setInterests(String interests) {
		// TODO Auto-generated method stub
		this.interests = interests;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		// TODO Auto-generated method stub
		rate += rating;
		rateCount++;
	}

}
