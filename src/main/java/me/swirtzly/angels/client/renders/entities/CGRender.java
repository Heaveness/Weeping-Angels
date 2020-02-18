package me.swirtzly.angels.client.renders.entities;

import com.mojang.blaze3d.systems.RenderSystem;
import me.swirtzly.angels.client.models.entity.ModelCG;
import me.swirtzly.angels.common.entities.ChronodyneGeneratorEntity;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;

/**
 * Created by Swirtzly
 * on 01/02/2020 @ 22:22
 */
public class CGRender extends SpriteRenderer<ChronodyneGeneratorEntity> {

    private ModelCG model = new ModelCG();

    public CGRender(EntityRendererManager p_i50956_1_, ItemRenderer p_i50956_2_, float p_i50956_3_) {
        super(p_i50956_1_, p_i50956_2_, p_i50956_3_);
    }

    @Override
    public void doRender(ChronodyneGeneratorEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        RenderSystem.pushMatrix();
        RenderSystem.translated(x, y - 1.3, z);
        RenderSystem.disableFog();
        RenderSystem.disableLighting();
        model.render(entity, 0, 0, 0, 0, 0, 0.0625F);
        RenderSystem.enableFog();
        RenderSystem.enableLighting();
        RenderSystem.popMatrix();
    }
}
