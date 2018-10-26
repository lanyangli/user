package com.liulang.user.listeners;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="dd")
@PropertySource(value="classpath:dd-dev.properties")
public class InitListener implements ApplicationListener<SpringApplicationEvent>{
	@Value("${pp}")
	private String tmpStr;
	@Override
	public void onApplicationEvent(SpringApplicationEvent event) {
		System.out.println(tmpStr);
		System.out.println("===>>init finish==="+event.getSource().getClass().getName());
	}

}
