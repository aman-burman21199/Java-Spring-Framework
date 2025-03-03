package com.learn.learn_spring_framework.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55};
	}
}
