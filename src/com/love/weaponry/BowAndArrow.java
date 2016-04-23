package com.love.weaponry;

// 弓箭
public class BowAndArrow extends Weapons {

	public BowAndArrow() {
		super.setName("弓箭");
		super.setAttackEffect("爆裂");
	}

	// 弓箭殊效果
	public String getAttackBuff() {
		return "追踪";
	}

}
