package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Component
	@ConfigurationProperties(value = "demo-properties", ignoreUnknownFields = false)
	public static class DemoProperties {

		private List<String> data;
		
		public void setData(List<String> data) {
			this.data = data;
		}
		
		public List<String> getData() {
			return data;
		}
		
	}
	
}
