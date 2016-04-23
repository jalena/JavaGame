package com.love.job;

import com.love.weaponry.*;

public class Role {
	private String name; // 名称
	private int level; // 级别
	private int stamina; // 体力值
	private int attack; // 攻击力
	private int defense; // 防御力
	private int gold; // 金币
	private String profiles; // 介绍

	// private Weapons weapons = new Weapons();// 武器

	public Role() {

	}

	// 角色初始化
	public Role(String name, int level, int gold, String profiles, int weight, int attackWeight, int defenseWeight) {
		this.name = name;
		this.level = level;
		this.stamina = this.level * weight;
		this.attack = this.level * attackWeight;
		this.defense = this.level * defenseWeight;
		this.gold = gold;
		this.profiles = profiles;
	}

	// 获取角色名称
	public String getName() {
		return name;
	}

	// 设置角色名称
	public void setName(String name) {
		this.name = name;
	}

	// 获取角色等级
	public int getLevel() {
		return level;
	}

	// 设置角色等级
	public void setLevel(int level) {
		this.level = level;
	}

	// 获取角色血量
	public int getStamina() {
		return stamina;
	}

	// 设置角色血量值
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	// 获取攻击力
	public int getAttack() {
		return attack;
	}
	
	// 设置攻击力
	public void setAttack(int attack) {
		this.attack = attack;
	}

	// 设置防御力
	public void setDefense(int defense) {
		this.defense = defense;
	}

	// 获取防御力
	public int getDefense() {
		return defense;
	}

	// 获取金币数量
	public int getGold() {
		return gold;
	}

	// 设置金币数量
	public void setGold(int gold) {
		this.gold = gold;
	}

	// 获取个人描述
	public String getProfiles() {
		return profiles;
	}

	// 设置个人描述
	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}

	// 默认攻击技能
	public void attackActio() {
		System.out.println("当前攻击行为是没得武器的\n" + "当前攻击力为：" + getAttack() + "\n我没有武器，我拿坨子打你吖~\n");
	}

	// 拿武器的攻击技能
	public void attackActio(Weapons weapons) {
		if (weapons instanceof Knife) {
			System.out.println("我现在有一把" + weapons.getName() + "我的攻击效果是" + weapons.getAttackEffect());
		} else if (weapons instanceof Sword) {
			System.out.println("我现在有一把" + weapons.getName() + "我的攻击效果是" + weapons.getAttackEffect());
		} else if (weapons instanceof Warhammer) {
			System.out.println("我现在有一把" + weapons.getName() + "我的攻击效果是" + weapons.getAttackEffect());
		} else if (weapons instanceof BowAndArrow) {
			System.out.println("我现在有一把" + weapons.getName() + "我的攻击效果是" + weapons.getAttackEffect() + "我还附带一个特殊技能"
					+ ((BowAndArrow) weapons).getAttackBuff());
		}
	}

	// 防御技能
	private void defense() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我的名字是：" + this.getName() + "\n个人描述：" + this.getProfiles() + "\n我的攻击力是：" + this.getAttack() + "\n我的防御力是："
				+ this.getDefense() + "\n我的血量值是：" + this.getStamina() + "\n我的金币有：" + this.getGold() + "\n我的等级现在是"
				+ this.getLevel() + "\n";
	}

}
