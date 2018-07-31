package buildings

fun main(args: Array<String>) {
  Building(Brick()).build()
  isSmallBuilding(Building(Brick()))
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
  if (building.actualMaterialNeeded < 500) println("small building") else println("large building")
}

open class BaseBuildingMaterial {
  open val numberNeeded = 1
}

class Wood: BaseBuildingMaterial() {
  override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
  override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(val buildingMaterial:T) {
  val baseMaterialsNeeded = 100
  val actualMaterialNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

  fun build() {
    println("$actualMaterialNeeded ${buildingMaterial::class.simpleName} required")
  }

}