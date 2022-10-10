package tp5;

public class Movies implements Comparable<Movies> {
	
	private static int cont=1;
	private int id;
	private String title;
	private Genres genre;
	
	
	//sets & gets
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genres getGenre() {
		return genre;
	}

	public void setGenre(Genres genre) {
		this.genre = genre;
	}
	
	Movies(String t, Genres g)
	{
		this.id = returnsNextId();
		this.title = t;
		this.genre = g;
	}
	Movies()
	{
		this.id = cont;
		cont = cont + 1;
	}
	
	//methods
	public static int returnsNextId()
	{
		return cont+1;
	}
	
	@Override
	public String toString() {
		return id + " - " + title + " - " + genre;
	}

	@Override
	public int compareTo(Movies o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	
}
