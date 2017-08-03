import config.Zoo
import com.typesafe.config.ConfigFactory
import pureconfig.loadConfig

class ConfigLoader {
	private val ZooConfigConst = ConfigFactory.load("test.conf")

	val configsMap = scala.collection.mutable.Map[String, Zoo]()

	def init() = {
		val zooConfig = loadConfig[Zoo](ZooConfigConst).right.get
		configsMap += ("zoo" -> zooConfig)
	}
}
