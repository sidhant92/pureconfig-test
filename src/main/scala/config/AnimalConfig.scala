package config

sealed trait Animal
case class Dog(name: String, age: Int) extends Animal
case class Cat(name: String) extends Animal
