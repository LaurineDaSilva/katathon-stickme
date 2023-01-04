package co.simplon.stickme.dtos;

import java.time.LocalDateTime;

public interface StickerView {

    Long getId();

    String getName();

    String getImageUrl();

    String getDescription();

    Long getChosenSizeId();

    Long getChosenAspectId();

    LocalDateTime getCreatedAt();

}
