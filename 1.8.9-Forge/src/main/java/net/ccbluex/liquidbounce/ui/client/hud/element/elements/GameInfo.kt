package net.ccbluex.liquidbounce.ui.client.hud.element.elements;

import net.ccbluex.liquidbounce.features.module.modules.`fun`.AutoL
import net.ccbluex.liquidbounce.features.module.modules.`fun`.AutoL.Companion.DeathNum
import net.ccbluex.liquidbounce.features.module.modules.player.Kills
import net.ccbluex.liquidbounce.ui.client.hud.element.Border
import net.ccbluex.liquidbounce.ui.client.hud.element.Element
import net.ccbluex.liquidbounce.ui.client.hud.element.ElementInfo
import net.ccbluex.liquidbounce.ui.font.Fonts
import net.ccbluex.liquidbounce.utils.render.RenderUtils
import net.minecraft.client.Minecraft
import java.awt.Color
import java.text.SimpleDateFormat
import java.util.*


@ElementInfo(name = "GameInfo")
class GameInfo(x:Double = 5.0, y: Double = 25.0) : Element(x = x, y = y){




        override fun drawElement(): Border? {


                var date: Date = Date()
                var formatter: SimpleDateFormat = SimpleDateFormat("HH:mm:ss")



                updateElement()
            RenderUtils.drawBorderedRect(0f,0f,118f,68f,3f,Color.DARK_GRAY.rgb,Color.GRAY.rgb)
                Fonts.font35.drawString("Statistics",38,4, Color.DARK_GRAY.rgb)
                Fonts.font35.drawString("Kills:",6,15,Color.DARK_GRAY.rgb)
                Fonts.font35.drawString(Kills.kill.toString(),35,15,Color.DARK_GRAY.rgb)

                Fonts.font35.drawString("Death:",6,25,Color.DARK_GRAY.rgb)
                Fonts.font35.drawString(DeathNum.toString(),35,25,Color.DARK_GRAY.rgb)

                Fonts.font35.drawString("Time:",6,35,Color.DARK_GRAY.rgb)
                Fonts.font35.drawString(formatter.format(date).toString(),35,35,Color.DARK_GRAY.rgb)


                Fonts.font35.drawString("Player:",6,45,Color.DARK_GRAY.rgb)
                Fonts.font35.drawString(mc.thePlayer!!.name.toString(),35,45,Color.DARK_GRAY.rgb)

                Fonts.font35.drawString("FPS:",6,55,Color.DARK_GRAY.rgb)
                Fonts.font35.drawString(Minecraft.getDebugFPS().toString(),35,55,Color.DARK_GRAY.rgb)





                return Border(1F, 0F, x.toFloat(), y.toFloat())
        }






}








