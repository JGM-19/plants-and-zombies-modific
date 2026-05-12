package joshxviii.plantz

import joshxviii.plantz.network.MailboxListResponsePayload
import joshxviii.plantz.networking.SendMailRequestPayload
import joshxviii.plantz.networking.SendMailRequestPayload.Companion.handleSendMailPacket
import joshxviii.plantz.networking.SendMailResponsePayload
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking

object PazNetwork {

    fun initialize() {
        // Register payloads
        PayloadTypeRegistry.serverboundPlay().register(SendMailRequestPayload.ID, SendMailRequestPayload.STREAM_CODEC)

        PayloadTypeRegistry.clientboundPlay().register(SendMailRequestPayload.ID, SendMailRequestPayload.STREAM_CODEC)
        PayloadTypeRegistry.clientboundPlay().register(SendMailResponsePayload.ID, SendMailResponsePayload.STREAM_CODEC)
        PayloadTypeRegistry.clientboundPlay().register(MailboxListResponsePayload.ID, MailboxListResponsePayload.STREAM_CODEC)

        // Register server receiver
        ServerPlayNetworking.registerGlobalReceiver(SendMailRequestPayload.ID, ::handleSendMailPacket)
    }
}