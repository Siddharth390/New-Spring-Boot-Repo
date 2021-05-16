//File: AsyncConfig.java
//configuration class to enable Asynchronous programming and Threadpool configuration.
package com.glaucus;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/*@see #@Configuration to denote this class as configuration class to Spring boot application.
 * 
 * @see #@EnableAsync to enable Asynchronous programming in Spring boot.
 * 
 * @author Sidharth Pradhan
*/
@Configuration
@EnableAsync
public class AsyncConfig{
	
	/*
	 * @see #@Bean defines this method returns a bean.
	 * 
	 * @see #asyncExecutor() method returns a ThreadPoolTaskExecutor Object with
	 * default configuration. default configuration avoids
	 * java.util.concurrent.RejectedExecutionException.
	 */
	
	@Bean
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor tp = new ThreadPoolTaskExecutor();
		return tp;
	}

}
