package web.carrito.ernest.model;

 public class CD {
	  private int id;
	  private String album;
	  private String artist;
	  private String country;
	  private float price;
	  private int quantity;
	
		 
	  public CD() {
		id=-1;
	    album="";
	    artist="";
	    country="";
	    price=0;
	    quantity=0;
	  }
	  
	  
	  public int getId() {
		return id;
	  }


	public void setId(int id) {
		this.id = id;
	}


	public void setAlbum(String title) {
	    album=title;
	  }
	  public String getAlbum() {		 
	    return album;
	  }
	  public void setArtist(String group) {
	    artist=group;
	  }
	  public String getArtist() {
	    return artist;
	  }
	  public void setCountry(String cty) {
	    country=cty;
	  }
	  public String getCountry() {
	    return country;
	  }
	  public void setPrice(float p) {
	    price=p;
	  }
	  public float getPrice() {
	    return price;
	  }
	  public void setQuantity(int q) {
	    quantity=q;
	  }
	  public int getQuantity() {
	    return quantity;
	  }
	}