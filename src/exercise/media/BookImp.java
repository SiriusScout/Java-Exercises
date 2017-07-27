package exercise.media;

public class BookImp implements Book, Media{
	private String barcode;
	private String title;
	private String ISBN;
	
	BookImp(){
		barcode = "";
		title = "";
		ISBN = "";
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
	public String getISBN() {
		return ISBN;
	}

	@Override
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

}
