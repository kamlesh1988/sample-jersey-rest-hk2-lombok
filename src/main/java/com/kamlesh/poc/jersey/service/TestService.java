package com.kamlesh.poc.jersey.service;

import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;

import org.jvnet.hk2.annotations.Service;

import com.kamlesh.poc.jersey.DependencyResolver;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class TestService {

	private static AtomicInteger count = new AtomicInteger(0);

	@Inject
	DependencyResolver resolver;

	public TestService() {
		log.info("Constructor called count {}", count.incrementAndGet());
	}

	public boolean doTask() {
		return true;
	}

}
