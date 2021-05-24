package com.icinbank;
  
 import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test; 
 import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest; 
 import org.springframework.test.context.junit4.SpringRunner;
  
  @RunWith(SpringRunner.class)
  @SpringBootTest 
  public class ICINBankApplicationTests {
	  
	  public static Logger logger = LoggerFactory.getLogger(ICINBankApplicationTests.class);
  
  @Test 
  public void contextLoads() {
	  
	  logger.info("Test case executing...");
	  assertEquals(true, true);
  }
  
  }
 