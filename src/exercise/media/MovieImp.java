package exercise.media;

public class MovieImp implements Movie, Media {
	private String barcode;
	private String title;
	private String director;
	
	MovieImp(){
		barcode = "";
		title = "";
		director = "";
	}
	

	@Override
	public String getBarcode() {
		return barcode;
	}

	@Override
	public void setBarcode(String barcode) {
		this.barcode = barcode;	
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getDirector() {
		return director;
	}

	@Override
	public void setDirector(String director) {
		this.director = director;
	}
}
