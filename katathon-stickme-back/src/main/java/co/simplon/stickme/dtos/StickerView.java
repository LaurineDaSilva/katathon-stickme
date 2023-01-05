package co.simplon.stickme.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface StickerView {

    Long getId();

    String getName();

    String getImageUrl();

    String getDescription();

    Long getSizeId();

    Long getAspectId();

    BigDecimal getPrice();

    LocalDateTime getCreatedAt();

}
