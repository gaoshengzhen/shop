package vo;

public class MyWarevo {
	private int wareid;
	private String warename;
	private int wareprice;
	private int lastware;
	@Override
	public String toString() {
		return "MyWarevo [wareid=" + wareid + ", warename=" + warename + ", wareprice=" + wareprice + ", lastware="
				+ lastware + "]";
	}
	public MyWarevo() {
		super();
	}
	public MyWarevo(String warename, int wareprice, int lastware) {
		super();
		this.warename = warename;
		this.wareprice = wareprice;
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
	public int getLastware() {
		return lastware;
	}
	public void setLastware(int lastware) {
		this.lastware = lastware;
	}
}
