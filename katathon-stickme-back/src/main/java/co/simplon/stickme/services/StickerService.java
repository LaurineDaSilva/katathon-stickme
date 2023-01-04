package co.simplon.stickme.services;

import java.util.Collection;

import co.simplon.stickme.dtos.StickerCreateDto;
import co.simplon.stickme.dtos.StickerView;

public interface StickerService {

    void create(StickerCreateDto inputs);

    Collection<StickerView> getAll();
}
