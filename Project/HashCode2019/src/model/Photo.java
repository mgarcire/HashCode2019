package model;

import java.util.List;

public class Photo {
	private boolean isVertical;
	private int photoId;
	private List<String> tagList;
	
	// Constructor.
	public Photo(boolean isVertical, int photoId, List<String> tagsList) {
		this.isVertical = isVertical;
		this.photoId = photoId;
		this.tagList = tagsList;
	}

	public boolean isVertical() {
		return isVertical;
	}

	public void setVertical(boolean isVertical) {
		this.isVertical = isVertical;
	}

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	public List<String> getTagList() {
		return tagList;
	}
}
