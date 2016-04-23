package com.love.weaponry;

// 武器系统
public class Weapons {

	private String name;
	private String attackEffect;

	// 默认构造器
	public Weapons() {
	}

	// 获取武器名称
	public String getName() {
		return name;
	}

	// 获取武器的攻击效果
	public String getAttackEffect() {
		return attackEffect;
	}

	// 设置武器的攻击效果
	public void setAttackEffect(String attackEffect) {
		this.attackEffect = attackEffect;
	}

	// 设置武器名称
	public void setName(String name) {
		this.name = name;
	}

}
