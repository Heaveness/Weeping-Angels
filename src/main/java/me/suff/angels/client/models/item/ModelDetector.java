package me.suff.angels.client.models.item;

import com.mojang.blaze3d.platform.GlStateManager;
import me.suff.angels.WeepingAngels;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * TimeyWimeyDetector - Ed Created using Tabula 5.1.0
 */
public class ModelDetector extends EntityModel {
	
	private ResourceLocation tex = new ResourceLocation(WeepingAngels.MODID, "textures/items/new_tex.png");
	
	private RendererModel spin_1;
	private RendererModel spin_2;
	private RendererModel spin_3;
	private RendererModel spin_4;
	private RendererModel MAIN;
	private RendererModel shape1_AAAAA;
	private RendererModel shape81;
	private RendererModel shape81_1;
	private RendererModel shape110;
	private RendererModel shape125;
	private RendererModel shape125_1;
	private RendererModel shape146;
	private RendererModel shape146_1;
	private RendererModel shape146_2;
	private RendererModel shape146_3;
	private RendererModel shape146_4;
	private RendererModel phone;
	private RendererModel light;
	private RendererModel shape14;
	private RendererModel shape14_1;
	private RendererModel shape14_2;
	private RendererModel shape14_3;
	private RendererModel shape14_4;
	private RendererModel shape14_5;
	private RendererModel shape14_6;
	private RendererModel shape14_7;
	private RendererModel shape14_8;
	private RendererModel shape14_9;
	private RendererModel shape14_10;
	private RendererModel shape14_11;
	private RendererModel shape14_12;
	private RendererModel shape14_13;
	private RendererModel shape14_14;
	private RendererModel shape14_15;
	private RendererModel shape14_16;
	private RendererModel shape14_17;
	private RendererModel shape14_18;
	private RendererModel shape14_19;
	private RendererModel shape14_20;
	private RendererModel shape14_21;
	private RendererModel shape14_22;
	private RendererModel shape14_23;
	private RendererModel shape14_24;
	private RendererModel shape14_25;
	private RendererModel shape14_26;
	private RendererModel shape14_27;
	private RendererModel shape14_28;
	private RendererModel shape14_29;
	private RendererModel shape14_30;
	private RendererModel shape14_31;
	private RendererModel shape14_32;
	private RendererModel shape14_33;
	private RendererModel shape14_34;
	private RendererModel shape14_35;
	private RendererModel shape14_36;
	private RendererModel shape14_37;
	private RendererModel shape14_38;
	private RendererModel shape14_39;
	private RendererModel shape14_40;
	private RendererModel shape14_41;
	private RendererModel shape14_42;
	private RendererModel shape14_43;
	private RendererModel shape14_44;
	private RendererModel shape14_45;
	private RendererModel shape14_46;
	private RendererModel shape14_47;
	private RendererModel shape6;
	private RendererModel shape1;
	private RendererModel shape1_1;
	private RendererModel shape1_2;
	private RendererModel shape1_3;
	private RendererModel shape12;
	private RendererModel shape12_1;
	private RendererModel shape14_48;
	private RendererModel shape14_49;
	private RendererModel c_hour;
	private RendererModel c_seg;
	private RendererModel shape1_4;
	private RendererModel shape1_5;
	private RendererModel shape1_6;
	private RendererModel shape1_7;
	private RendererModel shape64;
	private RendererModel shape64_1;
	private RendererModel shape66;
	private RendererModel shape66_1;
	private RendererModel shape66_2;
	private RendererModel shape72;
	private RendererModel c_min;
	private RendererModel shape7;
	private RendererModel shape7_1;
	private RendererModel shape7_2;
	private RendererModel shape7_3;
	private RendererModel shape14_50;
	private RendererModel shape14_51;
	private RendererModel shape14_52;
	private RendererModel shape14_53;
	private RendererModel shape14_54;
	private RendererModel shape14_55;
	private RendererModel shape14_56;
	private RendererModel shape14_57;
	private RendererModel shape14_58;
	private RendererModel shape14_59;
	private RendererModel shape14_60;
	private RendererModel shape56;
	private RendererModel shape56_1;
	private RendererModel shape66_3;
	private RendererModel shape66_4;
	private RendererModel shape66_5;
	private RendererModel shape73;
	private RendererModel shape80;
	private RendererModel shape83;
	private RendererModel shape73_1;
	private RendererModel shape73_2;
	private RendererModel shape73_3;
	private RendererModel shape73_4;
	private RendererModel shape73_5;
	private RendererModel shape73_6;
	private RendererModel shape56_2;
	private RendererModel shape141;
	private RendererModel shape142;
	private RendererModel shape143;
	private RendererModel shape142_1;
	private RendererModel shape143_1;
	private RendererModel shape153;
	private RendererModel shape153_1;
	private RendererModel shape155;
	private RendererModel shape155_1;
	
	public ModelDetector() {
		textureWidth = 64;
		textureHeight = 70;
		spin_1 = new RendererModel(this, 0, 0);
		spin_1.setRotationPoint(-6.0F, 5.0F, 2.0F);
		spin_1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		shape14_13 = new RendererModel(this, 46, 40);
		shape14_13.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_13.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_13, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_14 = new RendererModel(this, 52, 40);
		shape14_14.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_14.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_14, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_38 = new RendererModel(this, 16, 48);
		shape14_38.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_38.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_38, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_26 = new RendererModel(this, 16, 48);
		shape14_26.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_26.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_26, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_43 = new RendererModel(this, 0, 52);
		shape14_43.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_43.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_43, 0.0F, 0.0F, -0.5235987755982988F);
		shape7 = new RendererModel(this, 59, 4);
		shape7.setRotationPoint(-2.0F, 0.0F, 0.0F);
		shape7.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(shape7, 0.0F, 0.0F, 0.40980330836826856F);
		shape14_27 = new RendererModel(this, 56, 48);
		shape14_27.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_27.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_27, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_59 = new RendererModel(this, 56, 34);
		shape14_59.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_59.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_59, 0.0F, 0.0F, -0.5235987755982988F);
		shape1_7 = new RendererModel(this, 57, 21);
		shape1_7.setRotationPoint(-10.2F, 3.0F, -1.0F);
		shape1_7.addBox(0.0F, 0.0F, 0.0F, 1, 11, 2, 0.0F);
		shape73_2 = new RendererModel(this, 0, 40);
		shape73_2.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape73_2.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape73_2, 0.7853981633974483F, 0.0F, 0.0F);
		shape14_23 = new RendererModel(this, 51, 43);
		shape14_23.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_23.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_23, 0.0F, 0.0F, -0.5235987755982988F);
		shape1_5 = new RendererModel(this, 18, 31);
		shape1_5.setRotationPoint(-10.0F, 13.2F, -1.0F);
		shape1_5.addBox(0.0F, 0.0F, 0.0F, 16, 1, 2, 0.0F);
		shape143 = new RendererModel(this, 31, 59);
		shape143.setRotationPoint(1.0F, 0.0F, 0.0F);
		shape143.addBox(0.0F, 0.0F, 0.0F, 7, 0, 1, 0.0F);
		setRotateAngle(shape143, 0.0F, 0.0F, 0.5462880558742251F);
		shape14_31 = new RendererModel(this, 0, 52);
		shape14_31.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_31.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_31, 0.0F, 0.0F, -0.5235987755982988F);
		shape155 = new RendererModel(this, 22, 54);
		shape155.setRotationPoint(0.0F, 0.0F, 0.0F);
		shape155.addBox(-1.0F, -4.0F, -1.0F, 1, 2, 2, 0.0F);
		shape14_24 = new RendererModel(this, 30, 47);
		shape14_24.setRotationPoint(0.0F, 3.87F, 0.0F);
		shape14_24.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_24, 0.0F, 0.0F, -0.2617993877991494F);
		shape14_8 = new RendererModel(this, 17, 46);
		shape14_8.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_8.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_8, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_18 = new RendererModel(this, 12, 42);
		shape14_18.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_18.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_18, 0.0F, 0.0F, -0.5235987755982988F);
		shape146 = new RendererModel(this, 54, 0);
		shape146.setRotationPoint(-7.0F, 1.0F, 0.9F);
		shape146.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		shape14_9 = new RendererModel(this, 41, 46);
		shape14_9.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_9.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_9, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_20 = new RendererModel(this, 24, 42);
		shape14_20.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_20.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_20, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_37 = new RendererModel(this, 5, 48);
		shape14_37.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_37.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_37, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_49 = new RendererModel(this, 55, 4);
		shape14_49.setRotationPoint(-5.0F, 9.0F, -2.0F);
		shape14_49.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
		shape146_2 = new RendererModel(this, 46, 2);
		shape146_2.setRotationPoint(-7.1F, 1.0F, 0.8F);
		shape146_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		shape14_52 = new RendererModel(this, 25, 26);
		shape14_52.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_52.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_52, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_54 = new RendererModel(this, 0, 32);
		shape14_54.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_54.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_54, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_4 = new RendererModel(this, 45, 44);
		shape14_4.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_4.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_4, 0.0F, 0.0F, -0.5235987755982988F);
		shape155_1 = new RendererModel(this, 32, 55);
		shape155_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		shape155_1.addBox(-1.0F, 2.0F, -1.0F, 1, 2, 2, 0.0F);
		c_min = new RendererModel(this, 0, 0);
		c_min.setRotationPoint(-5.0F, 9.0F, -2.0F);
		c_min.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		shape66 = new RendererModel(this, 0, 34);
		shape66.setRotationPoint(-12.0F, 3.5F, -3.7F);
		shape66.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
		shape1_3 = new RendererModel(this, 39, 19);
		shape1_3.setRotationPoint(-9.0F, 4.0F, -1.8F);
		shape1_3.addBox(0.0F, 0.0F, 0.0F, 8, 8, 1, 0.0F);
		shape14_32 = new RendererModel(this, 10, 52);
		shape14_32.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_32.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_32, 0.0F, 0.0F, -0.5235987755982988F);
		shape143_1 = new RendererModel(this, 31, 59);
		shape143_1.setRotationPoint(1.0F, 0.0F, 0.0F);
		shape143_1.addBox(0.0F, 0.0F, 0.0F, 17, 0, 1, 0.0F);
		setRotateAngle(shape143_1, 0.0F, 0.0F, 0.8196066167365371F);
		shape66_4 = new RendererModel(this, 0, 38);
		shape66_4.setRotationPoint(0.0F, -1.0F, 0.0F);
		shape66_4.addBox(0.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F);
		setRotateAngle(shape66_4, -1.0471975511965976F, 0.0F, 0.0F);
		shape14_12 = new RendererModel(this, 40, 40);
		shape14_12.setRotationPoint(0.0F, 3.87F, 0.0F);
		shape14_12.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_12, 0.0F, 0.0F, -0.2617993877991494F);
		shape66_3 = new RendererModel(this, 28, 36);
		shape66_3.setRotationPoint(0.0F, -1.0F, 0.0F);
		shape66_3.addBox(0.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F);
		setRotateAngle(shape66_3, -1.0471975511965976F, 0.0F, 0.0F);
		shape14_36 = new RendererModel(this, 30, 47);
		shape14_36.setRotationPoint(0.0F, 3.87F, 0.0F);
		shape14_36.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_36, 0.0F, 0.0F, -0.2617993877991494F);
		shape14_41 = new RendererModel(this, 36, 50);
		shape14_41.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_41.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_41, 0.0F, 0.0F, -0.5235987755982988F);
		c_hour = new RendererModel(this, 0, 0);
		c_hour.setRotationPoint(-5.0F, 9.0F, -2.0F);
		c_hour.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		shape7_2 = new RendererModel(this, 0, 8);
		shape7_2.setRotationPoint(0.0F, 3.0F, 0.0F);
		shape7_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(shape7_2, 0.0F, 0.0F, -0.5009094953223726F);
		shape14_53 = new RendererModel(this, 31, 26);
		shape14_53.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_53.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_53, 0.0F, 0.0F, -0.5235987755982988F);
		shape81 = new RendererModel(this, 12, 58);
		shape81.setRotationPoint(4.8F, 4.0F, 1.8F);
		shape81.addBox(-10.0F, 0.0F, 0.0F, 10, 7, 0, 0.0F);
		setRotateAngle(shape81, 0.0F, 0.0F, -0.017453292519943295F);
		shape14_16 = new RendererModel(this, 0, 42);
		shape14_16.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_16.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_16, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_42 = new RendererModel(this, 46, 50);
		shape14_42.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_42.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_42, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_46 = new RendererModel(this, 16, 53);
		shape14_46.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_46.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_46, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_5 = new RendererModel(this, 36, 45);
		shape14_5.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_5.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_5, 0.0F, 0.0F, -0.5235987755982988F);
		shape153_1 = new RendererModel(this, 0, 20);
		shape153_1.setRotationPoint(1.0F, -1.5F, -0.5F);
		shape153_1.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
		setRotateAngle(shape153_1, 0.0F, 0.0F, -0.2617993877991494F);
		shape14_28 = new RendererModel(this, 22, 49);
		shape14_28.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_28.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_28, 0.0F, 0.0F, -0.5235987755982988F);
		shape125_1 = new RendererModel(this, 0, 0);
		shape125_1.setRotationPoint(-6.0F, 5.0F, 2.1F);
		shape125_1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(shape125_1, 0.0F, 0.0F, 0.8196066167365371F);
		shape146_4 = new RendererModel(this, 58, 2);
		shape146_4.setRotationPoint(-7.0F, 1.0F, 0.7F);
		shape146_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		c_seg = new RendererModel(this, 0, 0);
		c_seg.setRotationPoint(-5.0F, 9.0F, -2.0F);
		c_seg.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		shape14_56 = new RendererModel(this, 12, 32);
		shape14_56.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_56.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_56, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_40 = new RendererModel(this, 22, 49);
		shape14_40.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_40.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_40, 0.0F, 0.0F, -0.5235987755982988F);
		shape56_2 = new RendererModel(this, 36, 9);
		shape56_2.setRotationPoint(0.0F, -1.9F, 0.05F);
		shape56_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		setRotateAngle(shape56_2, 0.0F, -0.7853981633974483F, 0.0F);
		shape56 = new RendererModel(this, 36, 9);
		shape56.setRotationPoint(0.0F, -1.3F, 0.0F);
		shape56.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(shape56, 0.0F, -0.7853981633974483F, 0.0F);
		shape110 = new RendererModel(this, 42, 0);
		shape110.setRotationPoint(1.3F, 8.2F, 1.4F);
		shape110.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		setRotateAngle(shape110, 0.0F, 0.0F, 0.5462880558742251F);
		shape14_3 = new RendererModel(this, 24, 44);
		shape14_3.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_3.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_3, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_33 = new RendererModel(this, 28, 52);
		shape14_33.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_33.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_33, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_10 = new RendererModel(this, 56, 46);
		shape14_10.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_10.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_10, 0.0F, 0.0F, -0.5235987755982988F);
		shape7_3 = new RendererModel(this, 20, 23);
		shape7_3.setRotationPoint(0.0F, 2.0F, 0.0F);
		shape7_3.addBox(-2.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
		setRotateAngle(shape7_3, 0.0F, 0.0F, 0.40980330836826856F);
		shape14_34 = new RendererModel(this, 16, 53);
		shape14_34.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_34.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_34, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_2 = new RendererModel(this, 18, 44);
		shape14_2.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_2.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_2, 0.0F, 0.0F, -0.5235987755982988F);
		shape66_5 = new RendererModel(this, 22, 38);
		shape66_5.setRotationPoint(0.0F, -1.0F, 0.0F);
		shape66_5.addBox(0.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F);
		setRotateAngle(shape66_5, -1.0471975511965976F, 0.0F, 0.0F);
		shape14_45 = new RendererModel(this, 28, 52);
		shape14_45.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_45.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_45, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_57 = new RendererModel(this, 44, 34);
		shape14_57.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_57.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_57, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_50 = new RendererModel(this, 26, 24);
		shape14_50.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_50.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_50, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_29 = new RendererModel(this, 36, 50);
		shape14_29.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_29.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_29, 0.0F, 0.0F, -0.5235987755982988F);
		shape1_4 = new RendererModel(this, 20, 28);
		shape1_4.setRotationPoint(-10.0F, 2.8F, -1.0F);
		shape1_4.addBox(0.0F, 0.0F, 0.0F, 16, 1, 2, 0.0F);
		shape66_2 = new RendererModel(this, 0, 36);
		shape66_2.setRotationPoint(-12.0F, 3.5F, -3.7F);
		shape66_2.addBox(0.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F);
		setRotateAngle(shape66_2, -1.0471975511965976F, 0.0F, 0.0F);
		shape73_1 = new RendererModel(this, 52, 38);
		shape73_1.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape73_1.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape73_1, 0.7853981633974483F, 0.0F, 0.0F);
		shape80 = new RendererModel(this, 44, 38);
		shape80.setRotationPoint(0.0F, -1.7F, 0.0F);
		shape80.addBox(-0.01F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		spin_3 = new RendererModel(this, 0, 0);
		spin_3.setRotationPoint(-6.0F, 5.0F, 2.0F);
		spin_3.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		shape83 = new RendererModel(this, 0, 58);
		shape83.setRotationPoint(0.0F, -1.2F, 0.5F);
		shape83.addBox(-6.0F, -1.0F, 0.0F, 6, 10, 0, 0.0F);
		setRotateAngle(shape83, 0.136659280431156F, 0.27314402793711257F, 0.0F);
		spin_4 = new RendererModel(this, 0, 0);
		spin_4.setRotationPoint(-6.0F, 5.0F, 2.5F);
		spin_4.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		MAIN = new RendererModel(this, 0, 0);
		MAIN.setRotationPoint(0.0F, 0.0F, 0.0F);
		MAIN.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		spin_2 = new RendererModel(this, 0, 0);
		spin_2.setRotationPoint(-6.0F, 5.0F, 2.5F);
		spin_2.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		shape14_48 = new RendererModel(this, 49, 4);
		shape14_48.setRotationPoint(-5.0F, 12.9F, -2.1F);
		shape14_48.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_48, 0.0F, 0.0F, -0.2617993877991494F);
		shape73_6 = new RendererModel(this, 32, 40);
		shape73_6.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape73_6.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape73_6, 0.7853981633974483F, 0.0F, 0.0F);
		shape146_1 = new RendererModel(this, 58, 0);
		shape146_1.setRotationPoint(-7.0F, 2.0F, 0.8F);
		shape146_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		shape146_3 = new RendererModel(this, 54, 2);
		shape146_3.setRotationPoint(-6.9F, 1.0F, 0.8F);
		shape146_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		shape14_17 = new RendererModel(this, 6, 42);
		shape14_17.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_17.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_17, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_19 = new RendererModel(this, 18, 42);
		shape14_19.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_19.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_19, 0.0F, 0.0F, -0.5235987755982988F);
		shape64_1 = new RendererModel(this, 26, 20);
		shape64_1.setRotationPoint(0.0F, 7.5F, -2.6F);
		shape64_1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
		shape14_21 = new RendererModel(this, 30, 42);
		shape14_21.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_21.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_21, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_51 = new RendererModel(this, 32, 24);
		shape14_51.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_51.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_51, 0.0F, 0.0F, -0.5235987755982988F);
		shape1 = new RendererModel(this, 0, 9);
		shape1.setRotationPoint(-10.0F, 3.0F, -2.0F);
		shape1.addBox(0.0F, 0.0F, 0.0F, 16, 1, 4, 0.0F);
		shape14_22 = new RendererModel(this, 46, 42);
		shape14_22.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_22.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_22, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_60 = new RendererModel(this, 22, 36);
		shape14_60.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_60.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_60, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_1 = new RendererModel(this, 6, 44);
		shape14_1.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_1.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_1, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_55 = new RendererModel(this, 6, 32);
		shape14_55.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_55.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_55, 0.0F, 0.0F, -0.5235987755982988F);
		shape142_1 = new RendererModel(this, 2, 53);
		shape142_1.setRotationPoint(7.0F, 0.0F, 0.0F);
		shape142_1.addBox(0.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
		setRotateAngle(shape142_1, 0.0F, 0.0F, 0.9560913642424937F);
		shape14_11 = new RendererModel(this, 11, 47);
		shape14_11.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_11.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_11, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_44 = new RendererModel(this, 10, 52);
		shape14_44.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_44.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_44, 0.0F, 0.0F, -0.5235987755982988F);
		shape56_1 = new RendererModel(this, 0, 10);
		shape56_1.setRotationPoint(0.0F, -2.4F, 0.1F);
		shape56_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		setRotateAngle(shape56_1, 0.0F, -0.7853981633974483F, 0.0F);
		shape7_1 = new RendererModel(this, 6, 20);
		shape7_1.setRotationPoint(6.0F, 0.0F, 0.0F);
		shape7_1.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		setRotateAngle(shape7_1, 0.0F, 0.0F, -0.5009094953223726F);
		shape141 = new RendererModel(this, 31, 59);
		shape141.setRotationPoint(0.0F, -3.0F, 0.8F);
		shape141.addBox(0.0F, 0.0F, 0.0F, 15, 0, 1, 0.0F);
		setRotateAngle(shape141, 0.0F, 0.0F, -0.22759093446006054F);
		shape1_AAAAA = new RendererModel(this, 0, 0);
		shape1_AAAAA.setRotationPoint(-0.5F, 4.5F, -2.1F);
		shape1_AAAAA.addBox(0.0F, 0.0F, 0.0F, 5, 7, 1, 0.2F);
		shape72 = new RendererModel(this, 49, 6);
		shape72.setRotationPoint(-9.0F, 2.9F, -0.5F);
		shape72.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape72, 0.0F, 0.0F, -0.7285004297824331F);
		shape14_6 = new RendererModel(this, 50, 45);
		shape14_6.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_6.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_6, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_7 = new RendererModel(this, 6, 46);
		shape14_7.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_7.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_7, 0.0F, 0.0F, -0.5235987755982988F);
		shape81_1 = new RendererModel(this, 12, 0);
		shape81_1.setRotationPoint(-9.0F, 4.0F, 0.5F);
		shape81_1.addBox(0.0F, 0.0F, 0.0F, 14, 8, 1, 0.0F);
		phone = new RendererModel(this, 45, 4);
		phone.setRotationPoint(7.6F, 7.7F, 0.0F);
		phone.addBox(0.0F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(phone, 0.0F, 0.0F, 0.091106186954104F);
		shape12_1 = new RendererModel(this, 10, 20);
		shape12_1.setRotationPoint(-10.0F, 4.0F, -2.0F);
		shape12_1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 4, 0.0F);
		shape14_47 = new RendererModel(this, 52, 53);
		shape14_47.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_47.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_47, 0.0F, 0.0F, -0.5235987755982988F);
		shape6 = new RendererModel(this, 41, 8);
		shape6.setRotationPoint(0.0F, -1.0F, -0.5F);
		shape6.addBox(-2.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
		setRotateAngle(shape6, 0.0F, 0.0F, 0.08726646259971647F);
		shape73_5 = new RendererModel(this, 24, 40);
		shape73_5.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape73_5.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape73_5, 0.7853981633974483F, 0.0F, 0.0F);
		shape125 = new RendererModel(this, 46, 0);
		shape125.setRotationPoint(-6.0F, 5.0F, 1.9F);
		shape125.addBox(-0.5F, -0.5F, 0.2F, 1, 1, 1, 0.0F);
		shape14 = new RendererModel(this, 0, 44);
		shape14.setRotationPoint(0.0F, 3.87F, 0.0F);
		shape14.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14, 0.0F, 0.0F, -0.2617993877991494F);
		shape14_15 = new RendererModel(this, 57, 41);
		shape14_15.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_15.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_15, 0.0F, 0.0F, -0.5235987755982988F);
		shape73 = new RendererModel(this, 50, 36);
		shape73.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape73.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape73, 0.7853981633974483F, 0.0F, 0.0F);
		shape14_25 = new RendererModel(this, 5, 48);
		shape14_25.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_25.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_25, 0.0F, 0.0F, -0.5235987755982988F);
		shape64 = new RendererModel(this, 16, 20);
		shape64.setRotationPoint(0.0F, 8.0F, -3.0F);
		shape64.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		shape73_3 = new RendererModel(this, 8, 40);
		shape73_3.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape73_3.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape73_3, 0.7853981633974483F, 0.0F, 0.0F);
		shape1_2 = new RendererModel(this, 0, 14);
		shape1_2.setRotationPoint(-10.0F, 12.0F, -2.0F);
		shape1_2.addBox(0.0F, 0.0F, 0.0F, 16, 2, 4, 0.0F);
		shape142 = new RendererModel(this, 38, 51);
		shape142.setRotationPoint(15.0F, 0.0F, 0.0F);
		shape142.addBox(0.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F);
		setRotateAngle(shape142, 0.0F, 0.0F, 0.9560913642424937F);
		shape12 = new RendererModel(this, 0, 20);
		shape12.setRotationPoint(-10.0F, 4.0F, -2.0F);
		shape12.addBox(15.0F, 0.0F, 0.0F, 1, 8, 4, 0.0F);
		light = new RendererModel(this, 50, 0);
		light.setRotationPoint(-7.0F, 2.0F, 0.8F);
		light.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		shape1_1 = new RendererModel(this, 40, 10);
		shape1_1.setRotationPoint(-1.0F, 4.0F, -2.1F);
		shape1_1.addBox(0.0F, 0.0F, 0.0F, 6, 8, 1, 0.0F);
		shape73_4 = new RendererModel(this, 16, 40);
		shape73_4.setRotationPoint(0.0F, 0.0F, 1.0F);
		shape73_4.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
		setRotateAngle(shape73_4, 0.7853981633974483F, 0.0F, 0.0F);
		shape14_30 = new RendererModel(this, 46, 50);
		shape14_30.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_30.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_30, 0.0F, 0.0F, -0.5235987755982988F);
		shape66_1 = new RendererModel(this, 22, 34);
		shape66_1.setRotationPoint(-12.0F, 4.5F, -3.7F);
		shape66_1.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
		setRotateAngle(shape66_1, 1.0471975511965976F, 0.0F, 0.0F);
		shape14_58 = new RendererModel(this, 50, 34);
		shape14_58.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_58.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
		setRotateAngle(shape14_58, 0.0F, 0.0F, -0.5235987755982988F);
		shape1_6 = new RendererModel(this, 57, 8);
		shape1_6.setRotationPoint(5.2F, 3.0F, -1.0F);
		shape1_6.addBox(0.0F, 0.0F, 0.0F, 1, 11, 2, 0.0F);
		shape153 = new RendererModel(this, 36, 14);
		shape153.setRotationPoint(1.0F, 1.4F, -0.5F);
		shape153.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		setRotateAngle(shape153, 0.0F, 0.0F, 0.2617993877991494F);
		shape14_39 = new RendererModel(this, 56, 48);
		shape14_39.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_39.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_39, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_35 = new RendererModel(this, 52, 53);
		shape14_35.setRotationPoint(2.0F, 0.0F, 0.0F);
		shape14_35.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
		setRotateAngle(shape14_35, 0.0F, 0.0F, -0.5235987755982988F);
		shape14_12.addChild(shape14_13);
		shape14_13.addChild(shape14_14);
		shape14_37.addChild(shape14_38);
		shape14_25.addChild(shape14_26);
		shape14_42.addChild(shape14_43);
		shape6.addChild(shape7);
		shape14_26.addChild(shape14_27);
		shape14_58.addChild(shape14_59);
		MAIN.addChild(shape1_7);
		shape73_1.addChild(shape73_2);
		shape14_22.addChild(shape14_23);
		MAIN.addChild(shape1_5);
		shape142.addChild(shape143);
		shape14_30.addChild(shape14_31);
		phone.addChild(shape155);
		spin_3.addChild(shape14_24);
		shape14_7.addChild(shape14_8);
		shape14_17.addChild(shape14_18);
		shape14_8.addChild(shape14_9);
		shape14_19.addChild(shape14_20);
		shape14_36.addChild(shape14_37);
		MAIN.addChild(shape14_49);
		shape14_51.addChild(shape14_52);
		shape14_53.addChild(shape14_54);
		shape14_3.addChild(shape14_4);
		phone.addChild(shape155_1);
		MAIN.addChild(c_min);
		MAIN.addChild(shape66);
		MAIN.addChild(shape1_3);
		shape14_31.addChild(shape14_32);
		shape142_1.addChild(shape143_1);
		shape66_3.addChild(shape66_4);
		spin_2.addChild(shape14_12);
		shape66_2.addChild(shape66_3);
		spin_4.addChild(shape14_36);
		shape14_40.addChild(shape14_41);
		MAIN.addChild(c_hour);
		shape7.addChild(shape7_2);
		shape14_52.addChild(shape14_53);
		shape14_15.addChild(shape14_16);
		shape14_41.addChild(shape14_42);
		shape14_45.addChild(shape14_46);
		shape14_4.addChild(shape14_5);
		phone.addChild(shape153_1);
		shape14_27.addChild(shape14_28);
		MAIN.addChild(c_seg);
		shape14_55.addChild(shape14_56);
		shape14_39.addChild(shape14_40);
		c_min.addChild(shape56_2);
		c_hour.addChild(shape56);
		shape14_2.addChild(shape14_3);
		shape14_32.addChild(shape14_33);
		shape14_9.addChild(shape14_10);
		shape7_1.addChild(shape7_3);
		shape14_33.addChild(shape14_34);
		shape14_1.addChild(shape14_2);
		shape66_4.addChild(shape66_5);
		shape14_44.addChild(shape14_45);
		shape14_56.addChild(shape14_57);
		shape14_48.addChild(shape14_50);
		shape14_28.addChild(shape14_29);
		MAIN.addChild(shape1_4);
		MAIN.addChild(shape66_2);
		shape73.addChild(shape73_1);
		shape72.addChild(shape80);
		shape72.addChild(shape83);
		MAIN.addChild(shape14_48);
		shape73_5.addChild(shape73_6);
		shape14_16.addChild(shape14_17);
		shape14_18.addChild(shape14_19);
		MAIN.addChild(shape64_1);
		shape14_20.addChild(shape14_21);
		shape14_50.addChild(shape14_51);
		MAIN.addChild(shape1);
		shape14_21.addChild(shape14_22);
		shape14_59.addChild(shape14_60);
		shape14.addChild(shape14_1);
		shape14_54.addChild(shape14_55);
		shape143.addChild(shape142_1);
		shape14_10.addChild(shape14_11);
		shape14_43.addChild(shape14_44);
		c_seg.addChild(shape56_1);
		shape6.addChild(shape7_1);
		shape125_1.addChild(shape141);
		MAIN.addChild(shape72);
		shape14_5.addChild(shape14_6);
		shape14_6.addChild(shape14_7);
		MAIN.addChild(shape12_1);
		shape14_46.addChild(shape14_47);
		MAIN.addChild(shape6);
		shape73_4.addChild(shape73_5);
		spin_1.addChild(shape14);
		shape14_14.addChild(shape14_15);
		shape72.addChild(shape73);
		shape14_24.addChild(shape14_25);
		MAIN.addChild(shape64);
		shape73_2.addChild(shape73_3);
		MAIN.addChild(shape1_2);
		shape141.addChild(shape142);
		MAIN.addChild(shape12);
		MAIN.addChild(shape1_1);
		shape73_3.addChild(shape73_4);
		shape14_29.addChild(shape14_30);
		MAIN.addChild(shape66_1);
		shape14_57.addChild(shape14_58);
		MAIN.addChild(shape1_6);
		phone.addChild(shape153);
		shape14_38.addChild(shape14_39);
		shape14_34.addChild(shape14_35);
	}
	
	public void render(float scale) {
		
		long time = 60 * Minecraft.getInstance().world.getGameTime();
		
		// Start
		GlStateManager.pushMatrix();
		
		spin_1.rotateAngleZ = time;
		spin_2.rotateAngleZ = time * 1.01F;
		spin_3.rotateAngleZ = time;
		spin_4.rotateAngleZ = time * 1.01F;
		c_seg.rotateAngleZ += 0.1F;
		c_min.rotateAngleZ = c_seg.rotateAngleZ / 60;
		c_hour.rotateAngleZ = c_min.rotateAngleZ / 60;
		
		Minecraft.getInstance().getTextureManager().bindTexture(tex);
		
		GlStateManager.pushMatrix();
		GlStateManager.translatef(spin_1.offsetX, spin_1.offsetY, spin_1.offsetZ);
		GlStateManager.translatef(spin_1.rotationPointX * scale, spin_1.rotationPointY * scale, spin_1.rotationPointZ * scale);
		GlStateManager.scaled(1.3D, 1.3D, 0.5D);
		GlStateManager.translatef(-spin_1.offsetX, -spin_1.offsetY, -spin_1.offsetZ);
		GlStateManager.translatef(-spin_1.rotationPointX * scale, -spin_1.rotationPointY * scale, -spin_1.rotationPointZ * scale);
		spin_1.render(scale);
		GlStateManager.popMatrix();
		shape146.render(scale);
		shape146_2.render(scale);
		shape81.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translatef(shape125_1.offsetX, shape125_1.offsetY, shape125_1.offsetZ);
		GlStateManager.translatef(shape125_1.rotationPointX * scale, shape125_1.rotationPointY * scale, shape125_1.rotationPointZ * scale);
		GlStateManager.scaled(0.5D, 0.5D, 0.5D);
		GlStateManager.translatef(-shape125_1.offsetX, -shape125_1.offsetY, -shape125_1.offsetZ);
		GlStateManager.translatef(-shape125_1.rotationPointX * scale, -shape125_1.rotationPointY * scale, -shape125_1.rotationPointZ * scale);
		shape125_1.render(scale);
		GlStateManager.popMatrix();
		shape146_4.render(scale);
		shape110.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translatef(spin_3.offsetX, spin_3.offsetY, spin_3.offsetZ);
		GlStateManager.translatef(spin_3.rotationPointX * scale, spin_3.rotationPointY * scale, spin_3.rotationPointZ * scale);
		GlStateManager.scaled(0.6D, 0.6D, 0.5D);
		GlStateManager.translatef(-spin_3.offsetX, -spin_3.offsetY, -spin_3.offsetZ);
		GlStateManager.translatef(-spin_3.rotationPointX * scale, -spin_3.rotationPointY * scale, -spin_3.rotationPointZ * scale);
		spin_3.render(scale);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translatef(spin_4.offsetX, spin_4.offsetY, spin_4.offsetZ);
		GlStateManager.translatef(spin_4.rotationPointX * scale, spin_4.rotationPointY * scale, spin_4.rotationPointZ * scale);
		GlStateManager.scaled(0.5D, 0.5D, 0.5D);
		GlStateManager.translatef(-spin_4.offsetX, -spin_4.offsetY, -spin_4.offsetZ);
		GlStateManager.translatef(-spin_4.rotationPointX * scale, -spin_4.rotationPointY * scale, -spin_4.rotationPointZ * scale);
		spin_4.render(scale);
		GlStateManager.popMatrix();
		MAIN.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translatef(spin_2.offsetX, spin_2.offsetY, spin_2.offsetZ);
		GlStateManager.translatef(spin_2.rotationPointX * scale, spin_2.rotationPointY * scale, spin_2.rotationPointZ * scale);
		GlStateManager.scaled(1.0D, 1.0D, 0.5D);
		GlStateManager.translatef(-spin_2.offsetX, -spin_2.offsetY, -spin_2.offsetZ);
		GlStateManager.translatef(-spin_2.rotationPointX * scale, -spin_2.rotationPointY * scale, -spin_2.rotationPointZ * scale);
		spin_2.render(scale);
		GlStateManager.popMatrix();
		shape146_1.render(scale);
		shape146_3.render(scale);
		shape1_AAAAA.render(scale);
		shape81_1.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translatef(phone.offsetX, phone.offsetY, phone.offsetZ);
		GlStateManager.translatef(phone.rotationPointX * scale, phone.rotationPointY * scale, phone.rotationPointZ * scale);
		GlStateManager.scaled(1.2D, 1.2D, 1.2D);
		GlStateManager.translatef(-phone.offsetX, -phone.offsetY, -phone.offsetZ);
		GlStateManager.translatef(-phone.rotationPointX * scale, -phone.rotationPointY * scale, -phone.rotationPointZ * scale);
		phone.render(scale);
		GlStateManager.popMatrix();
		shape125.render(scale);
		
		// Light
		float timer = System.nanoTime() / 1000000000l;
		GlStateManager.pushMatrix();
		if (timer % 2 == 0) {
			GlStateManager.enableAlphaTest();
			GlStateManager.enableBlend();
			GlStateManager.color4f(1.0F, 1.0F, 1.0F, 0.5F);
			final int packedMaxLight = 0xf000f0; //15728880
			final int skyLight = packedMaxLight % 0x10000; //65536
			final int blockLight = packedMaxLight / 0x10000; //65536
			OpenGlHelper.glMultiTexCoord2f(OpenGlHelper.GL_TEXTURE1, skyLight, blockLight);
		}
		
		light.render(scale);
		
		if (timer % 2 == 0) {
			GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1F);
			OpenGlHelper.glMultiTexCoord2f(OpenGlHelper.GL_TEXTURE1, 0x0, 0xf0);
			GlStateManager.disableAlphaTest();
			GlStateManager.disableBlend();
		}
		
		GlStateManager.popMatrix();
		// Light end
		
		GlStateManager.popMatrix();
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		render(scale);
	}
}
