package tp5;

public class Genres {
	
	private int id;
	private String name;
	
	Genres(int i, String n)
	{
		this.id = i;
		this.name = n;
	}
	
	//sets & gets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
