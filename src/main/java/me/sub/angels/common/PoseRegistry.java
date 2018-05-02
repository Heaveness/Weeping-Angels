package me.sub.angels.common;

import java.util.HashMap;

import me.sub.angels.client.models.poses.PoseAngry;
import me.sub.angels.client.models.poses.PoseAngryTwo;
import me.sub.angels.client.models.poses.PoseBase;
import me.sub.angels.client.models.poses.PoseDab;
import me.sub.angels.client.models.poses.PoseHidingFace;
import me.sub.angels.client.models.poses.PoseIdle;
import me.sub.angels.client.models.poses.PoseShy;
import me.sub.angels.client.models.poses.PoseThinking;

public class PoseRegistry {
	
	public static HashMap<String, PoseBase> POSES = new HashMap();
	
	public static void registerPose(String name, PoseBase pose) {
		POSES.put(name, pose);
	}
	
	public static void init() {
		registerPose(AngelPoses.HIDING_FACE.toString(), new PoseHidingFace());
		registerPose(AngelPoses.IDLE.toString(), new PoseIdle());
		registerPose(AngelPoses.ANGRY.toString(), new PoseAngry());
		registerPose(AngelPoses.ANGRY_TWO.toString(), new PoseAngryTwo());
		registerPose(AngelPoses.SHY.toString(), new PoseShy());
		registerPose(AngelPoses.THINKING.toString(), new PoseThinking());
		registerPose(AngelPoses.DAB.toString(), new PoseDab());
	}
	
	public static PoseBase getPose(String name) {
		return POSES.get(name);
	}
	
	
	public enum AngelPoses {
		IDLE, HIDING_FACE, ANGRY, SHY, ANGRY_TWO, OPEN_ARMS, THINKING, DAB
	}

}