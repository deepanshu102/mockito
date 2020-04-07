package com.niit.techno.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.niit.techno.mockitodemo.repository.IDatabase;

@RunWith(MockitoJUnitRunner.class)
public class StudentScoreUpdateUnitTests {
	@InjectMocks
	public StudentScoreUpdates studentScoreUpdates;

	@Mock
	public IDatabase mockDatabase;
	@Test
	public void calculateSumAndStore_withValidInput_ShouldCalculateAndUpateResultInDb() {
		
		studentScoreUpdates=new StudentScoreUpdates(mockDatabase);
		int [] scores={60,70,90};
		studentScoreUpdates.calculateSumAndStore("student1", scores);
		Mockito.verify(mockDatabase,Mockito.times(1)).UpdateScores("student1", 220);
		
	}

}
