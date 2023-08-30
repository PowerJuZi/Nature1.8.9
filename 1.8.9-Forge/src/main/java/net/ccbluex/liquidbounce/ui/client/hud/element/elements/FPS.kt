package net.ccbluex.liquidbounce.ui.client.hud.element.elements;


import net.ccbluex.liquidbounce.ui.client.hud.element.Border
import net.ccbluex.liquidbounce.ui.client.hud.element.Element
import net.ccbluex.liquidbounce.ui.client.hud.element.ElementInfo
import net.ccbluex.liquidbounce.ui.font.Fonts

import net.ccbluex.liquidbounce.utils.render.RenderUtils

import net.minecraft.client.Minecraft
import org.lwjgl.opengl.GL11

import java.awt.Color
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.hypot
import kotlin.math.roundToInt

@ElementInfo(name = "FPS")
class FPS(x:Double = 5.0, y: Double = 45.0) : Element(x = x, y = y){



        private fun BPS(): Double {
                val fps = Minecraft.getDebugFPS()
                return (fps * 100.0).roundToInt() / 100.0
        }
        override fun drawElement(): Border? {
                val wigth = 25f + Fonts.font40.getStringWidth(""+BPS()+"FPS")
                val height = 25f

                RenderUtils.drawBorderedRect(0f,0f,wigth,height,2f,Color.DARK_GRAY.rgb,Color.GRAY.rgb)


                GL11.glTranslated(-renderX, -renderY, 0.0)
                GL11.glPushMatrix()

                GL11.glPopMatrix()
                GL11.glTranslated(renderX, renderY, 0.0)
                GL11.glTranslatef((-renderX).toFloat(), (-renderY).toFloat(), 0F)
                GL11.glPushMatrix()
                GL11.glPopMatrix()
                GL11.glTranslatef(renderX.toFloat(), renderY.toFloat(), 0F)
                Fonts.font40.drawCenteredString(String.format("" + BPS() + "FPS"),wigth /2f,13f - Fonts.font40.FONT_HEIGHT / 2f,Color(90,90,90).rgb)

                return Border(1F, 0F, x.toFloat(), y.toFloat())
        }






}








