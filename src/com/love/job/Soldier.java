package com.love.job;

// 士兵
public class Soldier extends Role {

	public Soldier(String name, int level, int gold, String profiles) {
		super(name, level, gold, profiles, 15, 3, 1);
	}

	// 狂暴技能
	private void rampage() {
		this.setStamina(this.getStamina() / 2);
		this.setAttack(this.getAttack() * 2);
		this.setDefense(this.getDefense() * 2);
	}

	// 等级重写
	public void setLevel(int level) {
		super.setLevel(level);
		this.setStamina(level * 15);
		this.setAttack(level * 3);
		this.setDefense(level * 1);
	}
}
