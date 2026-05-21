package joshxviii.plantz.effect

import joshxviii.plantz.PazEffects.PAINTED
import joshxviii.plantz.PazServerParticles
import net.minecraft.core.particles.ParticleOptions
import net.minecraft.server.level.ServerLevel
import net.minecraft.tags.FluidTags
import net.minecraft.util.RandomSource
import net.minecraft.world.effect.MobEffect
import net.minecraft.world.effect.MobEffectCategory
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.item.DyeColor
import kotlin.collections.component1
import kotlin.collections.component2

class PaintedMobEffect(
    category: MobEffectCategory,
    var paintColor: Int = DyeColor.WHITE.fireworkColor,
    private var random: RandomSource = RandomSource.create()
) : MobEffect(category, paintColor, PazServerParticles.PAINT_DRIP) {
    companion object {

        @JvmStatic
        fun getPaintEffects(mob: LivingEntity?, exclude: PaintedMobEffect? = null): List<MobEffectInstance> {
            val effects = PAINTED.entries
                .filter { (_, effect) -> !effect.value().equals(exclude) }
                .mapNotNull { (_, effect) -> mob?.getEffect(effect) }
            return effects
        }

        @JvmStatic
        fun getPaintColor(mob: LivingEntity?): Int {
            return -1
        }

    }

    override fun shouldApplyEffectTickThisTick(tickCount: Int, amplification: Int): Boolean {
        return true
    }

    override fun applyEffectTick(serverLevel: ServerLevel, mob: LivingEntity, amplification: Int): Boolean {
        if (mob.isEyeInFluid(FluidTags.WATER)) return false
        return super.applyEffectTick(serverLevel, mob, amplification)
    }

    override fun onEffectAdded(effectInstance: MobEffectInstance, entity: LivingEntity) {
        super.onEffectAdded(effectInstance, entity)
        //random = RandomSource.create(entity.level().gameTime)
    }

    fun getRandomness(): RandomSource {
        return RandomSource.create(random.hashCode().toLong())
    }

    override fun onEffectStarted(effectInstance: MobEffectInstance, entity: LivingEntity) {
        super.onEffectStarted(effectInstance, entity)
    }

    override fun onEffectRemoved(effectInstance: MobEffectInstance, entity: LivingEntity) {
        super.onEffectRemoved(effectInstance, entity)
    }

    override fun createParticleOptions(mobEffectInstance: MobEffectInstance): ParticleOptions {
        return super.createParticleOptions(mobEffectInstance)
    }

}