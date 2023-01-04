package co.simplon.stickme.entities;

import javax.persistence.Entity;

@Entity
public class Size {

    private Long id;
    private String name;

    public Size() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", name=" + name + "}";
    }

}
