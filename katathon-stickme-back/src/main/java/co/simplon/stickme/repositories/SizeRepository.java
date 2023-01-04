package co.simplon.stickme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.stickme.entities.Size;

public interface SizeRepository
	extends JpaRepository<Size, Long> {

}
