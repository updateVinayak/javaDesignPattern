package com.structral.adapter;

public class EnemyRobotAdapter implements EnemyAttacker{
	
	EnemyRobot enemyRobot;

	public EnemyRobotAdapter(EnemyRobot enemyRobot) {
		this.enemyRobot = enemyRobot;
	}

	public void fireWeapon() {
		System.out.println("fireWeapon.....");
		this.enemyRobot.smashWithHands();
		
	}

	public void driveForward() {
		System.out.println("driveForward.....");
		this.enemyRobot.walkForwar();
	}

	public void assignDriver(String driver) {
		System.out.println("assignDriver..... " + driver);
		this.enemyRobot.reactToHuman(driver);
	}

}
