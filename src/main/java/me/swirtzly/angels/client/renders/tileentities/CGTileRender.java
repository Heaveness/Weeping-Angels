package me.swirtzly.angels.client.renders.tileentities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import me.swirtzly.angels.client.models.entity.ModelCG;
import me.swirtzly.angels.common.misc.WAConstants;
import me.swirtzly.angels.common.tileentities.ChronodyneGeneratorTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

public class CGTileRender extends TileEntityRenderer<ChronodyneGeneratorTile> {
	
	private ModelCG model = new ModelCG();

	public CGTileRender(TileEntityRendererDispatcher p_i226006_1_) {
		super(p_i226006_1_);
	}

	@Override
	public void render(ChronodyneGeneratorTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
		RenderSystem.pushMatrix();
		RenderSystem.translatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		if (tile.getTileData().contains(WAConstants.ABS_X) && tile.getTileData().contains(WAConstants.ABS_Z)) {
			double presX = tile.getPos().getX() - tile.getTileData().getDouble(WAConstants.ABS_X);
			double presZ = tile.getPos().getZ() - tile.getTileData().getDouble(WAConstants.ABS_Z);
			RenderSystem.translated(presX, 0, presZ);
		}
		RenderSystem.rotatef(180, 0.0F, 0.0F, 1.0F);
		model.render(null, 0, 0, 0, 0, 0, 0.0625F);
		RenderSystem.popMatrix();
	}

}
