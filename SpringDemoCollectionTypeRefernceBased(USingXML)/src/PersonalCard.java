
public class PersonalCard {
	
	int cardid;
	String cardname;
	public PersonalCard() {}
	public PersonalCard(int cardid, String cardname) {
		super();
		this.cardid = cardid;
		this.cardname = cardname;
	}
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public void displayId() 
	{
		
		System.out.println("cardid = " + cardid);
		System.out.println("cardname = " + cardname );
		
		
	}
	@Override
	public String toString() {
		return "PersonalCard [cardid=" + cardid + ", cardname=" + cardname + "]";
	}
	
}
