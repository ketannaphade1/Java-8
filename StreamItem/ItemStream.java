package StreamItem;

import java.time.LocalDateTime;

public class ItemStream {

	private int itemid;
	private String iname;
	private LocalDateTime dom, doe;
	private float price;

	public ItemStream(int itemid, String iname, LocalDateTime dom, LocalDateTime doe, float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.dom = dom;
		this.doe = doe;
		this.price = price;
	}

	public ItemStream(String iname, float price) {
		this.iname = iname;
		this.price = price;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}
}