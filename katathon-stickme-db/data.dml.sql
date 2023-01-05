DELETE FROM stickers;
DELETE FROM sizes;
DELETE FROM aspects;

INSERT INTO sizes
	(name)
	VALUES
	('Small'),
	('Medium'),
	('Large');
	
INSERT INTO aspects
	(name)
	VALUES
	('Matte'),
	('Glossy');

	
INSERT INTO stickers
	(name, image_url, description, size_id, aspect_id, price, created_at) 
	VALUES
	('Cat', 'https://owl.jpg', 'Owl sticker', 2, 1, (2.35), now());
	
