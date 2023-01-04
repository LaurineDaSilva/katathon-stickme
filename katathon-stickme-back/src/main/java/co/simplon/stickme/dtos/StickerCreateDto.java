package co.simplon.stickme.dtos;

public class StickerCreateDto {

    private String name;
    private String imageUrl;
    private String description;
    private Long chosenAspectId;
    private Long chosenSizeId;
    private float price;

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

    public Long getChosenAspectId() {
	return chosenAspectId;
    }

    public void setChosenAspectId(Long chosenAspectId) {
	this.chosenAspectId = chosenAspectId;
    }

    public Long getChosenSizeId() {
	return chosenSizeId;
    }

    public void setChosenSizeId(Long chosenSizeId) {
	this.chosenSizeId = chosenSizeId;
    }

    public float getPrice() {
	return price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", imageUrl=" + imageUrl
		+ ", Description=" + description
		+ ", chosenAspectId=" + chosenAspectId
		+ ", chosenSizeId=" + chosenSizeId
		+ ", price=" + price + "}";
    }

}
