package config

import enumeratum._

sealed trait AnimalSize extends EnumEntry

object AnimalSize extends Enum[AnimalSize] {
  val values = findValues

  case object Small extends AnimalSize
  case object Medium extends AnimalSize
  case object Big extends AnimalSize
}
