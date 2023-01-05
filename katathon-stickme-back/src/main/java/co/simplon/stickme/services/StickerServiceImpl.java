package co.simplon.stickme.services;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.stickme.dtos.StickerCreateDto;
import co.simplon.stickme.dtos.StickerView;
import co.simplon.stickme.entities.Aspect;
import co.simplon.stickme.entities.Size;
import co.simplon.stickme.entities.Sticker;
import co.simplon.stickme.repositories.AspectRepository;
import co.simplon.stickme.repositories.SizeRepository;
import co.simplon.stickme.repositories.StickerRepository;

@Service
public class StickerServiceImpl implements StickerService {

    private StickerRepository stickers;
    private SizeRepository sizes;
    private AspectRepository aspects;

    public StickerServiceImpl(StickerRepository stickers,
	    SizeRepository sizes,
	    AspectRepository aspects) {

	this.stickers = stickers;
	this.sizes = sizes;
	this.aspects = aspects;
    }

    @Override
    public void create(StickerCreateDto inputs) {
	Sticker sticker = new Sticker();
	sticker.setName(inputs.getName());
	sticker.setImageUrl(inputs.getImageUrl());
	sticker.setDescription(inputs.getDescription());
	Long sizeId = inputs.getSizeId();
	Size size = sizes.getReferenceById(sizeId);
	sticker.setSize(size);
	Long aspectId = inputs.getAspectId();
	Aspect aspect = aspects
		.getReferenceById(aspectId);
	sticker.setAspect(aspect);
	sticker.setPrice(inputs.getPrice());
	LocalDateTime createdAt = LocalDateTime.now();
	sticker.setCreatedAt(createdAt);
	this.stickers.save(sticker);

    }

    @Override
    public Collection<StickerView> getAll() {
	return stickers.findAllProjectedBy();
    }

}
