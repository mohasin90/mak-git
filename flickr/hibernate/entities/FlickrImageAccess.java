package com.flickr.hibernate.entities;

// Generated Jul 18, 2015 5:27:08 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FlickrImageAccess generated by hbm2java
 */
@Entity
@Table(name = "flickr_image_access", schema = "public")
public class FlickrImageAccess implements java.io.Serializable {

	private long imageAccessId;
	private FlickrUser flickrUser;
	private long imageId;
	private Date imageAccessCreatedDate;

	public FlickrImageAccess() {
	}

	public FlickrImageAccess(long imageAccessId, FlickrUser flickrUser,
			long imageId, Date imageAccessCreatedDate) {
		this.imageAccessId = imageAccessId;
		this.flickrUser = flickrUser;
		this.imageId = imageId;
		this.imageAccessCreatedDate = imageAccessCreatedDate;
	}

	@Id
	@Column(name = "image_access_id", unique = true, nullable = false)
	public long getImageAccessId() {
		return this.imageAccessId;
	}

	public void setImageAccessId(long imageAccessId) {
		this.imageAccessId = imageAccessId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "access_user_id", nullable = false)
	public FlickrUser getFlickrUser() {
		return this.flickrUser;
	}

	public void setFlickrUser(FlickrUser flickrUser) {
		this.flickrUser = flickrUser;
	}

	@Column(name = "image_id", nullable = false)
	public long getImageId() {
		return this.imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "image_access_created_date", nullable = false, length = 29)
	public Date getImageAccessCreatedDate() {
		return this.imageAccessCreatedDate;
	}

	public void setImageAccessCreatedDate(Date imageAccessCreatedDate) {
		this.imageAccessCreatedDate = imageAccessCreatedDate;
	}

}
