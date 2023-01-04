package co.simplon.stickme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.stickme.entities.Aspect;

public interface AspectRepository
	extends JpaRepository<Aspect, Long> {

}
