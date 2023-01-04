package co.simplon.stickme.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.stickme.dtos.StickerView;
import co.simplon.stickme.entities.Sticker;

public interface StickerRepository
	extends JpaRepository<Sticker, Long> {

    Collection<StickerView> findAllProjectedBy();
}
