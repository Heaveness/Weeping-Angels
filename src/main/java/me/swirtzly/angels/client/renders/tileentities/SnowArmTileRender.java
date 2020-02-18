package me.swirtzly.angels.client.renders.tileentities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import me.swirtzly.angels.client.models.block.SnowArmModel;
import me.swirtzly.angels.common.tileentities.SnowArmTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.math.BlockPos;

public class SnowArmTileRender extends TileEntityRenderer<SnowArmTile> {

	private SnowArmModel arm = new SnowArmModel();

    public SnowArmTileRender(TileEntityRendererDispatcher p_i226006_1_) {
        super(p_i226006_1_);
    }

	@Override
    public void render(SnowArmTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
		RenderSystem.pushMatrix();
        BlockPos pos = tile.getPos();
        RenderSystem.translatef((float) pos.getX() + 0.5F, (float) pos.getY() + 1.5F, (float) pos.getZ() + 0.5F);
		RenderSystem.rotatef(180, 0.0F, 0.0F, 1.0F);
		arm.render(0.0625f);
		RenderSystem.popMatrix();
	}
}
