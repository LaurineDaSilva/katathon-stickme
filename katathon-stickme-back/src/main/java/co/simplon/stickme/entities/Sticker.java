package co.simplon.stickme.entities;

import java.time.LocalDateTime;

public class Sticker {

    private Long id;
    private String name;
    private String imageUrl;
    private String Description;
    private Size size;
    private Aspect aspect;
    private float price;
    private LocalDateTime createdAt;

    public Sticker() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getImageUrl() {
	return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
    }

    public String getDescription() {
	return Description;
    }

    public void setDescription(String description) {
	Description = description;
    }

    public Size getSize() {
	return size;
    }

    public void setSize(Size size) {
	this.size = size;
    }

    public Aspect getAspect() {
	return aspect;
    }

    public void setAspect(Aspect aspect) {
	this.aspect = aspect;
    }

    public float getPrice() {
	return price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

    public LocalDateTime getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", name=" + name
		+ ", imageUrl=" + imageUrl
		+ ", Description=" + Description + ", size="
		+ size + ", aspect=" + aspect + ", price="
		+ price + ", createdAt=" + createdAt + "}";
    }
}
