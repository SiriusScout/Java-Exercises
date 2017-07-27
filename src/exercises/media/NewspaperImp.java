package exercises.media;

public class NewspaperImp implements Newspaper, Media {
	private String barcode;
	private String title;
	private String journalist;
	
	NewspaperImp(){
		barcode = "";
		title = "";
		journalist = "";
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
	public String getJournalist() {
		return journalist;
	}

	@Override
	public void setJournalist(String journalist) {
		this.journalist = journalist;
	}
}
