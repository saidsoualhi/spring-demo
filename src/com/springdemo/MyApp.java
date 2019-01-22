package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		CoachImpl theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
