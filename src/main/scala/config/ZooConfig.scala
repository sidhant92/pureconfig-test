package config

case class Zoo(
	name: String,
	animals: List[Animal],
	animalSize: Option[Map[AnimalSize, String]]
)
