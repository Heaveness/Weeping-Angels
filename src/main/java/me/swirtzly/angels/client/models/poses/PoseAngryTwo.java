package me.swirtzly.angels.client.models.poses;

import me.swirtzly.angels.common.entities.WeepingAngelEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class PoseAngryTwo extends PoseBase {
	
	public PoseAngryTwo(WeepingAngelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch, float swingProgress) {
		super(entity, limbSwing, limbSwingAmount, ageInTicks, netheadYaw, headPitch, swingProgress);
	}
	
	public PoseAngryTwo() {}
	
	@Override
	public void setArmAngles(RendererModel left_arm, RendererModel right_arm, RendererModel wrist_left, RendererModel wrist_right) {
		wrist_left.rotateAngleX = -0.52F;
		left_arm.rotateAngleX = -1.5F;
		left_arm.rotateAngleY = 0.31F;
		left_arm.rotateAngleZ = -0.087F;
		wrist_right.rotateAngleX = -0.52F;
		right_arm.rotateAngleX = -1.5F;
		right_arm.rotateAngleY = -0.31F;
		right_arm.rotateAngleZ = 0.087F;
	}
	
	@Override
	public void setHeadAngles(RendererModel head) {
		
	}
	
	@Override
	public void setBodyAngles(RendererModel body) {}
	
	@Override
	public boolean angryFace() {
		return true;
	}
	
	@Override
	public void setWingAngles(RendererModel left_wing, RendererModel right_wing) {}
}
