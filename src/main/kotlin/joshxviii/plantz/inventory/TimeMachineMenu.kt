package joshxviii.plantz.inventory

import joshxviii.plantz.PazBlocks
import joshxviii.plantz.PazMenus
import net.minecraft.core.BlockPos
import net.minecraft.world.entity.player.Inventory
import net.minecraft.world.entity.player.Player
import net.minecraft.world.inventory.AbstractContainerMenu
import net.minecraft.world.inventory.ContainerLevelAccess
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level

class TimeMachineMenu(
    containerId: Int,
    val inventory: Inventory,
    val blockPos: BlockPos,
    private val access: ContainerLevelAccess = ContainerLevelAccess.NULL
) : AbstractContainerMenu(PazMenus.TIME_MACHINE_MENU, containerId) {
    override fun quickMoveStack(player: Player, slotIndex: Int): ItemStack {
        val clicked = ItemStack.EMPTY
        val slot = slots[slotIndex]
        if (slot.hasItem()) {
            val stack = slot.item
            if (slotIndex == 0) if (!this.moveItemStackTo(stack, 1, 37, false)) return ItemStack.EMPTY
            else if (!this.moveItemStackTo(stack, 0, 1, false)) return ItemStack.EMPTY
        }
        return clicked
    }

    override fun stillValid(player: Player): Boolean {
        return access.evaluate( { level: Level, pos: BlockPos ->
            if (!level.getBlockState(pos).`is`(PazBlocks.TIME_MACHINE)) false
            else player.isWithinBlockInteractionRange(pos, 4.0)
        }, true)
    }
}