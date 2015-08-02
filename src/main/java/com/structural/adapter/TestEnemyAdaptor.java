package com.structural.adapter;

public class TestEnemyAdaptor {

	public static void main(String[] args) {
		
		EnemyRobot enemyRobot = new EnemyRobot();
		
		EnemyRobotAdapter adapter = new EnemyRobotAdapter(enemyRobot);
		
		adapter.assignDriver("Vinayak");
		adapter.fireWeapon();
		adapter.driveForward();
		
		
		
		
	}
	
}
