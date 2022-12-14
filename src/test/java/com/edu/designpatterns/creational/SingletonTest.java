package com.edu.designpatterns.creational;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** 
* Singleton Tester. 
* 
* @author <Authors name> 
* @since <pre>Dec 13, 2022</pre> 
* @version 1.0 
*/ 
public class SingletonTest { 

/** 
* 
* Method: getInstance() 
* 
*/ 
@Test
public void when_getMultipleInstances_return_sameInstance() throws Exception {
       Singleton instance1 = Singleton.getInstance();
       Singleton instance2 = Singleton.getInstance();
       Assertions.assertEquals(instance1,instance2);
} 


} 
