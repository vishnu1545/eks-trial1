package com.infy.secretsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/*@KubernetesApplication(name="secretsdemo", livenessProbe = @Probe(httpActionPath = "/actuator/health"),
						readinessProbe = @Probe(httpActionPath = "/actuator/health"),
						ports = @Port(name="web",containerPort = 8080),expose = true,
						serviceType = ServiceType.LoadBalancer,
						envVars = @Env(secret = "secrets-demo-secrets", name = "secrets"),
						serviceAccount = "hello"
						)*/
@SpringBootApplication
@EnableScheduling
public class SecretsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretsDemoApplication.class, args);
	}

}
