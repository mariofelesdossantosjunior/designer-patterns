package br.com.cod3r.behavioral.strategy.worker.strategies.transportation;

public class BikeStrategy implements TransportationStrategy {

	@Override
	public void move() {
		System.out.println("I ride a bike to go anywhere");
	}

}
