package com.met.model;

public class Stage {
	public static int count=0;
	private int stageId;
	private static Stage stage =null;
	private Stage()
	{
		stageId = ++count;
		System.out.println("Private cons of stage called..with id:" + stageId);
	}
	
	@Override
	public String toString() {
		return "Stage [stageId=" + stageId + "]";
	}

	public static Stage getStage() {
		if(stage == null)
			stage = new Stage();
		return stage;
	}
}
