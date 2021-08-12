package com.tcs.hashmap;


public class Student {
	private float math;
	private float biology;
	private float physics;

	public Student(float math, float bio, float physics) {
		super();
		this.math = math;
		this.biology = bio;
		this.physics = physics;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public float getBio() {
		return biology;
	}

	public void setBio(float bio) {
		this.biology = bio;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "[math=" + math + ", bio=" + biology + ", physics=" + physics + "]";
	}
		
}
