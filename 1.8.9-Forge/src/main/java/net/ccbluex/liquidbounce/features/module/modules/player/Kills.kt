package net.ccbluex.liquidbounce.features.module.modules.player
import net.ccbluex.liquidbounce.event.AttackEvent
import net.ccbluex.liquidbounce.event.EventTarget
import net.ccbluex.liquidbounce.event.UpdateEvent
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.value.BoolValue
import net.minecraft.client.Minecraft
import net.minecraft.entity.EntityLivingBase
import java.util.*

@ModuleInfo(name = "Kills", category = ModuleCategory.PLAYER, description = "大傻逼版")
class Kills : Module() {



        // Target
        var target: EntityLivingBase? = null
        companion object {
        var kill = 0
        var DeathNum = 0
        }
@EventTarget
    fun onAttack(event: AttackEvent) {
            target = event.targetEntity as EntityLivingBase?
            }

@EventTarget
    fun onUpdate(event: UpdateEvent) {

            if(Minecraft.getMinecraft().thePlayer.isDead){

            DeathNum ++
            }

            if (target!!.health <= 0.1) {
            kill += 1
            target = null
            }
            }

            fun kills() : Int {
            return kill
            }
            override val tag: String?
            get() = "Kill $kill"
            }
