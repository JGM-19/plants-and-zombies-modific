package joshxviii.plantz.block.entity

import joshxviii.plantz.PazBlocks
 import net.minecraft.core.BlockPos
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.storage.ValueInput
import net.minecraft.world.level.storage.ValueOutput
import net.minecraft.world.ticks.ContainerSingleItem.BlockContainerSingleItem

class SunBatteryBlockEntity(
    worldPosition: BlockPos,
    blockState: BlockState,
) : BlockEntity(
    PazBlocks.SUN_BATTERY_BLOCK_ENTITY, worldPosition, blockState
), BlockContainerSingleItem {
    private var item: ItemStack? =  ItemStack.EMPTY

    override fun getContainerBlockEntity(): BlockEntity = this

    override fun saveAdditional(output: ValueOutput) {
        super.saveAdditional(output)
        output.store("Item", ItemStack.CODEC, this.item?: ItemStack.EMPTY)
    }

    override fun loadAdditional(input: ValueInput) {
        super.loadAdditional(input)
        this.item = input.read("Item", ItemStack.CODEC).orElse(ItemStack.EMPTY)
    }

    override fun getTheItem(): ItemStack {
        return this.item?: ItemStack.EMPTY
    }

    override fun setTheItem(itemStack: ItemStack) {
        this.item = itemStack
    }

}