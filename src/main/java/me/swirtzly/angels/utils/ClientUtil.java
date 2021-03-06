package me.swirtzly.angels.utils;

import me.swirtzly.angels.client.PlayerMovingSound;
import me.swirtzly.angels.client.renders.entities.AngelRender;
import me.swirtzly.angels.client.renders.entities.AnomalyRender;
import me.swirtzly.angels.client.renders.entities.CGRender;
import me.swirtzly.angels.client.renders.tileentities.CGTileRender;
import me.swirtzly.angels.client.renders.tileentities.PlinthTileRender;
import me.swirtzly.angels.client.renders.tileentities.SnowArmTileRender;
import me.swirtzly.angels.client.renders.tileentities.StatueRender;
import me.swirtzly.angels.common.entities.AnomalyEntity;
import me.swirtzly.angels.common.entities.ChronodyneGeneratorEntity;
import me.swirtzly.angels.common.entities.WeepingAngelEntity;
import me.swirtzly.angels.common.tileentities.ChronodyneGeneratorTile;
import me.swirtzly.angels.common.tileentities.PlinthTile;
import me.swirtzly.angels.common.tileentities.SnowArmTile;
import me.swirtzly.angels.common.tileentities.StatueTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import java.util.function.Supplier;

public class ClientUtil {
	
	public static <T extends TileEntity> void bindTESR(Class<T> tileEntityClass, TileEntityRenderer<? super T> specialRenderer) {
		ClientRegistry.bindTileEntitySpecialRenderer(tileEntityClass, specialRenderer);
	}
	
	public static <T extends Entity> void bindEntityRender(Class<T> entityClass, IRenderFactory<? super T> renderFactory) {
		RenderingRegistry.registerEntityRenderingHandler(entityClass, renderFactory);
	}
	
	@OnlyIn(Dist.CLIENT)
	public static void playSound(Object object, SoundEvent soundIn, SoundCategory categoryIn, boolean repeat, Supplier<Boolean> stopCondition, float volumeSfx) {
		Minecraft.getInstance().getSoundHandler().play(new PlayerMovingSound(object, soundIn, categoryIn, repeat, stopCondition, volumeSfx));
	}
	
	@OnlyIn(Dist.CLIENT)
	public static void playSound(SoundEvent soundIn, float volumeSfx) {
		Minecraft.getInstance().getSoundHandler().play(SimpleSound.master(soundIn, volumeSfx));
	}
	
	@OnlyIn(Dist.CLIENT)
	public static void playSound(PlayerMovingSound playerMovingSound) {
		Minecraft.getInstance().getSoundHandler().play(playerMovingSound);
	}
	
	public static void doClientStuff() {
		ClientUtil.bindTESR(SnowArmTile.class, new SnowArmTileRender());
		ClientUtil.bindTESR(ChronodyneGeneratorTile.class, new CGTileRender());
		ClientUtil.bindTESR(PlinthTile.class, new PlinthTileRender());
		ClientUtil.bindTESR(StatueTile.class, new StatueRender());
		
		ClientUtil.bindEntityRender(WeepingAngelEntity.class, AngelRender::new);
		ClientUtil.bindEntityRender(AnomalyEntity.class, AnomalyRender::new);
		ClientUtil.bindEntityRender(ChronodyneGeneratorEntity.class, (EntityRendererManager p_i50956_1_) -> new CGRender(p_i50956_1_, Minecraft.getInstance().getItemRenderer(), 12));
	}
	
	public static void drawSelectionBoxMask(AxisAlignedBB box, float red, float green, float blue, float alpha) {
		drawMask(box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ, red, green, blue, alpha);
	}
	
	public static void drawMask(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, float red, float green, float blue, float alpha) {
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
		drawMask(bufferbuilder, minX, minY, minZ, maxX, maxY, maxZ, red, green, blue, alpha);
		tessellator.draw();
	}
	
	public static void drawMask(BufferBuilder b, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, float red, float green, float blue, float alpha) {
		// up
		b.pos(minX, minY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, minY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, minY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, minY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, minY, minZ).color(red, green, blue, alpha).endVertex();
		
		// down
		b.pos(minX, maxY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, maxY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, maxY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, maxY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, maxY, minZ).color(red, green, blue, alpha).endVertex();
		
		// north
		b.pos(minX, minY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, maxY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, maxY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, minY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, minY, minZ).color(red, green, blue, alpha).endVertex();
		
		// south
		b.pos(minX, minY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, minY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, maxY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, maxY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, minY, maxZ).color(red, green, blue, alpha).endVertex();
		
		// east
		b.pos(maxX, minY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, maxY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, maxY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, minY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(maxX, minY, minZ).color(red, green, blue, alpha).endVertex();
		
		// west
		b.pos(minX, minY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, minY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, maxY, maxZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, maxY, minZ).color(red, green, blue, alpha).endVertex();
		b.pos(minX, minY, minZ).color(red, green, blue, alpha).endVertex();
	}
}
