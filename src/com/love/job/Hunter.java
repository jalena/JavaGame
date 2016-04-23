package com.love.job;

// 猎人
public class Hunter extends Role {

	public Hunter() {

	}

	public Hunter(String name, int level, int gold, String profiles) {
		super(name, level, gold, profiles, 12, 2, 2);
	}

	// 打猎技能
	private void HUNTING() {
		if (this.getStamina() < 8) {
			System.out.println("体力值不足");
		} else {
			this.setGold(this.getGold() + 10);
			this.setStamina(this.getStamina() - 8);
		}
	}

	// 等级重写
	public void setLevel(int level) {
		super.setLevel(level);
		this.setStamina(level * 12);
		this.setAttack(level * 2);
		this.setDefense(level * 2);
	}

}
