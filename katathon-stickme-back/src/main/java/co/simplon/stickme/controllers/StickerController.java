package co.simplon.stickme.controllers;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.stickme.dtos.StickerCreateDto;
import co.simplon.stickme.dtos.StickerView;
import co.simplon.stickme.services.StickerService;

@RestController
@RequestMapping("/stickers")
@CrossOrigin
public class StickerController {

    private StickerService service;

    public StickerController(StickerService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody StickerCreateDto inputs) {
	service.create(inputs);
    }

    @GetMapping
    public Collection<StickerView> getAll() {
	return service.getAll();
    }

}
