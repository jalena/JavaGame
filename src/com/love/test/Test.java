package com.love.test;

import com.love.job.Doctor;
import com.love.weaponry.BowAndArrow;
import com.love.weaponry.Knife;
import com.love.weaponry.Sword;
import com.love.weaponry.Warhammer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Game();

		// new Doctor("zhang3",11,300,"我是一个医生").bloodReturning();
		// Doctor ys = new Doctor("zhang3",11,300,"我是一个医生");
		// System.out.println(ys.getAttack());
		//
		Doctor doctor = new Doctor("天下第一牛逼", 2, 111, "天下医生皆我生");
		doctor.attackActio();

		doctor.attackActio(new Knife());
		System.out.println(doctor);
		doctor.attackActio(new Sword());
		System.out.println(doctor);
		doctor.attackActio(new Warhammer());
		System.out.println(doctor);
		doctor.attackActio(new BowAndArrow());
		System.out.println(doctor);

		doctor.setLevel(99);

	}

}
