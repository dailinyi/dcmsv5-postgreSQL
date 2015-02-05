package com.dcms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content"
 */

public abstract class BaseContentPicture  implements Serializable {

	public static String REF = "ContentPicture";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_IMG_PATH = "imgPath";
	public static String PROP_TITLE = "title";
	public static String PROP_SUBTITLE = "subtitle";
	public static String PROP_LINK = "link";
	public static String PROP_RECOMMEND = "recommend";


	// constructors
	public BaseContentPicture () {
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentPicture (
		java.lang.String imgPath) {

		this.setImgPath(imgPath);
		initialize();
	}

	protected void initialize () {}



	// fields
	private java.lang.String imgPath;
	private java.lang.String description;
	private java.lang.String title;
	private java.lang.String subtitle;
	private java.lang.String link;
	private java.lang.Integer recommend;
	






	/**
	 * Return the value associated with the column: img_path
	 */
	public java.lang.String getImgPath () {
		return imgPath;
	}

	/**
	 * Set the value related to the column: img_path
	 * @param imgPath the img_path value
	 */
	public void setImgPath (java.lang.String imgPath) {
		this.imgPath = imgPath;
	}


	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
	}



	public java.lang.String getTitle() {
		return title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(java.lang.String subtitle) {
		this.subtitle = subtitle;
	}

	public java.lang.String getLink() {
		return link;
	}

	public void setLink(java.lang.String link) {
		this.link = link;
	}

	public java.lang.Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(java.lang.Integer recommend) {
		this.recommend = recommend;
	}

	public String toString () {
		return super.toString();
	}


}