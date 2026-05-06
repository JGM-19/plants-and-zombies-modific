package joshxviii.plantz.entity.plant

import joshxviii.plantz.PazEntities
import joshxviii.plantz.hasSameRootOwner
import net.minecraft.world.DifficultyInstance
import net.minecraft.world.entity.*
import net.minecraft.world.entity.player.Player
import net.minecraft.world.level.Level
import net.minecraft.world.level.ServerLevelAccessor

class PotatoMine(type: EntityType<out Plant>, level: Level) : Plant(PazEntities.POTATO_MINE, level) {
    override fun registerGoals() {
        super.registerGoals()
    }

    override fun finalizeSpawn(
        level: ServerLevelAccessor,
        difficulty: DifficultyInstance,
        spawnReason: EntitySpawnReason,
        groupData: SpawnGroupData?
    ): SpawnGroupData? {
        cooldown = 180 + random.nextInt(-40, 30)
        return super.finalizeSpawn(level, difficulty, spawnReason, groupData)
    }

    override fun tick() {
        super.tick()
        if (cooldown>0) coolDownAnimationState.startIfStopped(tickCount)
    }

    override fun getMaxSwell() = 4
    override fun doPush(entity: Entity) {
        if (isGrowingSeeds || cooldown > 0) return
        if (entity is Plant || (entity is Player && isTame) || this.hasSameRootOwner(entity)) return
        else {
            explode(radius = 1f)
        }
    }
}