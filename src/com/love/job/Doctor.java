package com.love.job;

// 医生
public class Doctor extends Role {

	public Doctor(String name, int level, int gold, String profiles) {
		super(name, level, gold, profiles, 8, 1, 2);
	}

	// 等级重写
	public void setLevel(int level) {
		super.setLevel(level);
		this.setStamina(level * 8);
		this.setAttack(level * 1);
		this.setDefense(level * 2);
	}

	// 回血技能
	public void bloodReturning() {
		if (this.getStamina() == this.getLevel() * 8) {
			System.out.println("你丫满血还要回血？");
		} else {
			this.setStamina(this.getStamina() + (this.getLevel() * 2));
			System.out.println("当前自己的血量为：" + this.getStamina());
		}
	}

	// 医生加血技能
	public void bloodReturning(Role play) {
		int weight = 0;

		// 角色血量加权
		if (play instanceof Doctor || play instanceof Farmer) {
			weight = 8; // 医生、农民
		} else if (play instanceof Farmer) {
			weight = 12; // 猎人
		} else if (play instanceof Soldier) {
			weight = 15; // 士兵
		} else if (play instanceof Thief) {
			weight = 10; // 盗贼
		}

		if (play.getStamina() == play.getLevel() * weight) { // 满血判断
			System.out.println("你丫满血还要回血？");
		} else if ((play.getStamina() + this.getLevel() * 2) > (play.getLevel() * weight)) { // 是否可以加血到满血判断
			if (play.getGold() > (this.getLevel() * 2)) { // 金钱是否足够加血一次的
				play.setStamina(play.getLevel() * weight); // 直接满血

				play.setGold((play.getLevel() * weight) - play.getStamina()); // 金币扣除公式
				this.setGold(this.getGold() + ((play.getLevel() * weight) - play.getStamina())); // 增加给医生
			}
		} else {
			if (play.getGold() > (this.getLevel() * 2)) { // 判断加血对象身上的金币是否大于加血需要的钱
				play.setGold(play.getGold() - (this.getLevel() * 2)); // 扣除金钱
				this.setGold(this.getGold() + ((play.getLevel() * weight) - play.getStamina())); // 增加给医生
				play.setStamina(play.getStamina() + (this.getLevel() * 2)); // 加血
			} else {
				System.out.println("金币不足");
			}
		}
	}

}
