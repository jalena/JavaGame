package com.love.job;

// 盗贼
public class Thief extends Role {

	public Thief() {

	}

	public Thief(String name, int level, int gold, String profiles) {
		super(name, level, gold, profiles, 10, 3, 1);
	}

	private void Theft() {
		if (this.getStamina() < 9) {
			System.out.println("体力值不足");
		} else {
			this.setGold(this.getGold() + 12);
			this.setStamina(this.getStamina() - 9);
		}
	}

	// 等级重写
	public void setLevel(int level) {
		super.setLevel(level);
		this.setStamina(level * 10);
		this.setAttack(level * 3);
		this.setDefense(level * 1);
	}

}
