package model;

import java.util.List;

public class Slide {
	private int id1, id2;
	private List<String> tagList;
	
	// Constructor.
	public Slide(int id1, int id2, List<String> tagList) {
		this.id1 = id1;
		this.id2 = id2;
		this.tagList = tagList;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public List<String> getTagList() {
		return tagList;
	}
}
