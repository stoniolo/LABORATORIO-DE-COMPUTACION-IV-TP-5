package tp5;

public class Movies {
	
	private static int cont=0;
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

	
	//methods
	public static int returnsNextId()
	{
		return cont+1;
	}
	
	@Override
	public String toString() {
		return "ID=" + id + ", Titulo=" + title + ", Genero: " + genre;
	}
	
}
