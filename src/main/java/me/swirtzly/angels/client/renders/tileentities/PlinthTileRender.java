package me.swirtzly.angels.client.renders.tileentities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import me.swirtzly.angels.WeepingAngels;
import me.swirtzly.angels.client.models.entity.ModelAngelEd;
import me.swirtzly.angels.common.tileentities.PlinthTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;

public class PlinthTileRender extends TileEntityRenderer<PlinthTile> {
	
	private ModelAngelEd ed = new ModelAngelEd();
	private ResourceLocation ARM_TEX = new ResourceLocation(WeepingAngels.MODID, "textures/entities/angel_2.png");

	public PlinthTileRender(TileEntityRendererDispatcher p_i226006_1_) {
		super(p_i226006_1_);
	}

	@Override
	public void render(PlinthTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
		RenderSystem.pushMatrix();

		RenderSystem.translatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		RenderSystem.rotatef(180, 0.0F, 0.0F, 1.0F);

		RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		RenderSystem.translatef(0, -1, 0);

		RenderSystem.rotatef(-tile.getRotation(), 0, 1, 0);

		if (!tile.getHasSpawned()) {
			Minecraft.getInstance().getTextureManager().bindTexture(ARM_TEX);
			ed.quickRender(0.0625f, tile.getPose());
		}
		RenderSystem.popMatrix();
	}
}
