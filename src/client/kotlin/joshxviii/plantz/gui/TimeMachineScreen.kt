package joshxviii.plantz.gui

import com.mojang.blaze3d.platform.cursor.CursorTypes
import joshxviii.plantz.PazMain
import joshxviii.plantz.PazMenus
import joshxviii.plantz.inventory.MailboxMenu
import joshxviii.plantz.inventory.TimeMachineMenu
import joshxviii.plantz.networking.SendMailPayload
import joshxviii.plantz.pazResource
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLevelEvents
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.client.gui.components.Button
import net.minecraft.client.gui.components.EditBox
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen
import net.minecraft.client.input.KeyEvent
import net.minecraft.client.input.MouseButtonEvent
import net.minecraft.client.renderer.LevelEventHandler
import net.minecraft.client.renderer.RenderPipelines
import net.minecraft.network.chat.Component
import net.minecraft.resources.Identifier
import net.minecraft.util.Mth
import net.minecraft.world.entity.player.Inventory

class TimeMachineScreen(
    val menu: TimeMachineMenu,
    val inventory: Inventory,
    title: Component,
) : AbstractContainerScreen<TimeMachineMenu>(menu, inventory, title, 176, 180) {

    companion object {
        val BACKGROUND: Identifier = pazResource("textures/gui/time_machine/background.png")
    }

    override fun init() {
        super.init()
        val xo = (width - imageWidth) / 2
        val yo = (height - imageHeight) / 2
    }

    override fun extractBackground(graphics: GuiGraphicsExtractor, xm: Int, ym: Int, a: Float) {
        val xo = leftPos
        val yo = topPos
        graphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, xo, yo, 0f, 0f, imageWidth, imageHeight, 256, 256)
    }

    override fun mouseClicked(event: MouseButtonEvent, doubleClick: Boolean): Boolean {
        val xo = leftPos + 152
        val yo = topPos + 28

        return super.mouseClicked(event, doubleClick)
    }

    override fun mouseDragged(event: MouseButtonEvent, dx: Double, dy: Double): Boolean {
        return super.mouseDragged(event, dx, dy)
    }

    override fun mouseReleased(event: MouseButtonEvent): Boolean {
        return super.mouseReleased(event)
    }

    override fun mouseScrolled(x: Double, y: Double, scrollX: Double, scrollY: Double): Boolean {
        return super.mouseScrolled(x, y, scrollX, scrollY)
    }

    override fun keyPressed(event: KeyEvent): Boolean {
        if (event.isEscape) {
            this.minecraft.player!!.closeContainer()
            return true
        } else return super.keyPressed(event)
    }

    override fun resize(width: Int, height: Int) {
        super.resize(width, height)
    }

}