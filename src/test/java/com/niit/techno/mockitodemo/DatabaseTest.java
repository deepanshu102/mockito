package com.niit.techno.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.niit.techno.mockitodemo.repository.DatabaseDAO;
import com.niit.techno.mockitodemo.repository.NetworkDAO;
import com.niit.techno.mockitodemo.service.RecordService;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseTest {

	@InjectMocks
	RecordService recordService;
	
	@Mock 
	DatabaseDAO databaseMock;
	
	@Mock 
	NetworkDAO networkDAO;
	@Test
	public void saveTest()
	{
		boolean saved=recordService.save("temp.txt");
		assertEquals(true,saved);
		verify(databaseMock,times(1)).save("temp.txt");
		verify(networkDAO,times(1)).save("temp.txt");
	}
	
}
