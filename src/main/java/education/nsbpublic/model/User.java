package education.nsbpublic.model;

public class User {

private long id;

private String name;

private int rating;

private int standard;

public User(){
	id=0;
}

public User(long id, String name, int rating, int standard){
	this.id = id;
	this.name = name;
	this.rating = rating;
	this.standard = standard;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public int getStandard() {
	return standard;
}

public void setStandard(int standard) {
	this.standard = standard;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (id != other.id)
		return false;
	return true;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", rating=" + rating
			+ ", standard=" + standard + "]";
}


}
