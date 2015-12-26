package com.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo", locations = { "classpath:config.properties" })
public class DemoConfig {
	private String config1;
	private String config2;
	private String config3;

	public String getConfig1() {
		return config1;
	}

	public void setConfig1(String config1) {
		this.config1 = config1;
	}

	public String getConfig2() {
		return config2;
	}

	public void setConfig2(String config2) {
		this.config2 = config2;
	}

	public String getConfig3() {
		return config3;
	}

	public void setConfig3(String config3) {
		this.config3 = config3;
	}

}
