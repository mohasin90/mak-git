package com.flickr.hibernate.entities;

// Generated Jul 18, 2015 5:27:08 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FlickrAlbum generated by hbm2java
 */
@Entity
@Table(name = "flickr_album", schema = "public")
public class FlickrAlbum implements java.io.Serializable {

	private long albumId;
	private FlickrUser flickrUser;
	private String albumName;
	private String albumDescription;
	private boolean albumIsPrivate;
	private Date albumCreatedDate;
	private Date albumUpdatedDate;
	private String albumCreatedBy;
	private String albumUpdatedBy;
	private Set<FlickrAlbumRating> flickrAlbumRatings = new HashSet<FlickrAlbumRating>(
			0);
	private Set<FlickrGroupAlbumAccess> flickrGroupAlbumAccesses = new HashSet<FlickrGroupAlbumAccess>(
			0);
	private Set<FlickrAlbumAccess> flickrAlbumAccesses = new HashSet<FlickrAlbumAccess>(
			0);

	public FlickrAlbum() {
	}

	public FlickrAlbum(long albumId, FlickrUser flickrUser, String albumName,
			boolean albumIsPrivate, Date albumCreatedDate, Date albumUpdatedDate) {
		this.albumId = albumId;
		this.flickrUser = flickrUser;
		this.albumName = albumName;
		this.albumIsPrivate = albumIsPrivate;
		this.albumCreatedDate = albumCreatedDate;
		this.albumUpdatedDate = albumUpdatedDate;
	}

	public FlickrAlbum(long albumId, FlickrUser flickrUser, String albumName,
			String albumDescription, boolean albumIsPrivate,
			Date albumCreatedDate, Date albumUpdatedDate,
			String albumCreatedBy, String albumUpdatedBy,
			Set<FlickrAlbumRating> flickrAlbumRatings,
			Set<FlickrGroupAlbumAccess> flickrGroupAlbumAccesses,
			Set<FlickrAlbumAccess> flickrAlbumAccesses) {
		this.albumId = albumId;
		this.flickrUser = flickrUser;
		this.albumName = albumName;
		this.albumDescription = albumDescription;
		this.albumIsPrivate = albumIsPrivate;
		this.albumCreatedDate = albumCreatedDate;
		this.albumUpdatedDate = albumUpdatedDate;
		this.albumCreatedBy = albumCreatedBy;
		this.albumUpdatedBy = albumUpdatedBy;
		this.flickrAlbumRatings = flickrAlbumRatings;
		this.flickrGroupAlbumAccesses = flickrGroupAlbumAccesses;
		this.flickrAlbumAccesses = flickrAlbumAccesses;
	}

	@Id
	@Column(name = "album_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "album_user_id", nullable = false)
	public FlickrUser getFlickrUser() {
		return this.flickrUser;
	}

	public void setFlickrUser(FlickrUser flickrUser) {
		this.flickrUser = flickrUser;
	}

	@Column(name = "album_name", nullable = false, length = 100)
	public String getAlbumName() {
		return this.albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	@Column(name = "album_description", length = 4000)
	public String getAlbumDescription() {
		return this.albumDescription;
	}

	public void setAlbumDescription(String albumDescription) {
		this.albumDescription = albumDescription;
	}

	@Column(name = "album_is_private", nullable = false)
	public boolean isAlbumIsPrivate() {
		return this.albumIsPrivate;
	}

	public void setAlbumIsPrivate(boolean albumIsPrivate) {
		this.albumIsPrivate = albumIsPrivate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "album_created_date", nullable = false, length = 29)
	public Date getAlbumCreatedDate() {
		return this.albumCreatedDate;
	}

	public void setAlbumCreatedDate(Date albumCreatedDate) {
		this.albumCreatedDate = albumCreatedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "album_updated_date", nullable = false, length = 29)
	public Date getAlbumUpdatedDate() {
		return this.albumUpdatedDate;
	}

	public void setAlbumUpdatedDate(Date albumUpdatedDate) {
		this.albumUpdatedDate = albumUpdatedDate;
	}

	@Column(name = "album_created_by", length = 100)
	public String getAlbumCreatedBy() {
		return this.albumCreatedBy;
	}

	public void setAlbumCreatedBy(String albumCreatedBy) {
		this.albumCreatedBy = albumCreatedBy;
	}

	@Column(name = "album_updated_by", length = 100)
	public String getAlbumUpdatedBy() {
		return this.albumUpdatedBy;
	}

	public void setAlbumUpdatedBy(String albumUpdatedBy) {
		this.albumUpdatedBy = albumUpdatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrAlbum")
	public Set<FlickrAlbumRating> getFlickrAlbumRatings() {
		return this.flickrAlbumRatings;
	}

	public void setFlickrAlbumRatings(Set<FlickrAlbumRating> flickrAlbumRatings) {
		this.flickrAlbumRatings = flickrAlbumRatings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrAlbum")
	public Set<FlickrGroupAlbumAccess> getFlickrGroupAlbumAccesses() {
		return this.flickrGroupAlbumAccesses;
	}

	public void setFlickrGroupAlbumAccesses(
			Set<FlickrGroupAlbumAccess> flickrGroupAlbumAccesses) {
		this.flickrGroupAlbumAccesses = flickrGroupAlbumAccesses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrAlbum")
	public Set<FlickrAlbumAccess> getFlickrAlbumAccesses() {
		return this.flickrAlbumAccesses;
	}

	public void setFlickrAlbumAccesses(
			Set<FlickrAlbumAccess> flickrAlbumAccesses) {
		this.flickrAlbumAccesses = flickrAlbumAccesses;
	}

}
