package com.integration.stripepayments;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StripePaymentsApplication {

	@Value("${stripe.apikey}")
	String apiKey;

	@PostConstruct
	public void setup(){
		Stripe.apiKey = apiKey;
	}

	public static void main(String[] args) {
		SpringApplication.run(StripePaymentsApplication.class, args);
	}

}
