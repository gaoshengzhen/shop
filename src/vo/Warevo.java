package vo;

public class Warevo {
	private int wareid;
	private String warename;
	private int wareprice;
	private int lastware;
	private String warebigfrom;
	private String warefrom;
	public Warevo(String warename, int wareprice, String warebigfrom, String warefrom, int lastware) {
		super();
		this.warename = warename;
		this.wareprice = wareprice;
		this.warebigfrom = warebigfrom;
		this.warefrom = warefrom;
		this.lastware = lastware;
	}
	public int getLastware() {
		return lastware;
	}
	public void setLastware(int lastware) {
		this.lastware = lastware;
	}
	
	public int getWareid() {
		return wareid;
	}
	public void setWareid(int wareid) {
		this.wareid = wareid;
	}
	public String getWarename() {
		return warename;
	}
	public void setWarename(String warename) {
		this.warename = warename;
	}
	public int getWareprice() {
		return wareprice;
	}
	public void setWareprice(int wareprice) {
		this.wareprice = wareprice;
	}
	public String getWarebigfrom() {
		return warebigfrom;
	}
	public void setWarebigfrom(String warebigfrom) {
		this.warebigfrom = warebigfrom;
	}
	public String getWarefrom() {
		return warefrom;
	}
	public void setWarefrom(String warefrom) {
		this.warefrom = warefrom;
	}
	
	public Warevo() {
		super();
	}
	@Override
	public String toString() {
		return "Warevo [wareid=" + wareid + ", warename=" + warename + ", wareprice=" + wareprice + ", warebigfrom="
				+ warebigfrom + ", warefrom=" + warefrom + ", lastware=" + lastware + "]";
	}
	

}
