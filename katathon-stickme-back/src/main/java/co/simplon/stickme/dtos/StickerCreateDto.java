package co.simplon.stickme.dtos;

import java.math.BigDecimal;

public class StickerCreateDto {

    private String name;
    private String imageUrl;
    private String description;
    private Long aspectId;
    private Long sizeId;
    private BigDecimal price;

    public StickerCreateDto() {
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
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Long getAspectId() {
	return aspectId;
    }

    public void setAspectId(Long aspectId) {
	this.aspectId = aspectId;
    }

    public Long getSizeId() {
	return sizeId;
    }

    public void setSizeId(Long sizeId) {
	this.sizeId = sizeId;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public void setPrice(BigDecimal price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", imageUrl=" + imageUrl
		+ ", description=" + description
		+ ", aspectId=" + aspectId + ", sizeId="
		+ sizeId + ", price=" + price + "}";
    }

}
