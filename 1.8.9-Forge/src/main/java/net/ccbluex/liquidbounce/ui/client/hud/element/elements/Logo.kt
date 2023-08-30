package net.ccbluex.liquidbounce.ui.client.hud.element.elements;


import net.ccbluex.liquidbounce.ui.client.hud.element.Border
import net.ccbluex.liquidbounce.ui.client.hud.element.Element
import net.ccbluex.liquidbounce.ui.client.hud.element.ElementInfo
import net.ccbluex.liquidbounce.ui.font.Fonts
import net.ccbluex.liquidbounce.utils.render.RenderUtils


import java.awt.Color
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.hypot
import kotlin.math.roundToInt

@ElementInfo(name = "Logo")
class Logo(x:Double = 5.0, y: Double = 20.0) : Element(x = x, y = y){


        override fun drawElement(): Border? {
              RenderUtils.drawBorderedRect(0f,0f,38f,14f,2f,Color.DARK_GRAY.rgb,Color.GRAY.rgb)
                Fonts.minecraftFont.drawStringWithShadow("ature",8f,2f,Color.GREEN.rgb)
                Fonts.minecraftFont.drawStringWithShadow("N",2f,2f,Color.RED.rgb)
                return Border(1F, 0F, x.toFloat(), y.toFloat())
        }





}








