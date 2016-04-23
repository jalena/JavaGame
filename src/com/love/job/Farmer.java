package com.love.job;

// 农民
public class Farmer extends Role {

	// public Farmer() {
	//
	// }

	public Farmer(String name, int level, int gold, String profiles) {
		super(name, level, gold, profiles, 8, 1, 1);
	}

	// 采矿技能
	private void Bergbau() {
		if (this.getStamina() < 3) {
			System.out.println("体力值不足");
		} else {
			this.setGold(this.getGold() + 5);
			this.setStamina(this.getStamina() - 3);
		}
	}

	// 等级重写
	public void setLevel(int level) {
		super.setLevel(level);
		this.setStamina(level * 8);
		this.setAttack(level * 1);
		this.setDefense(level * 1);
	}

}
