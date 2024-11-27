package br.com.cod3r.estructural.adapter.tvPort.devices;

import br.com.cod3r.estructural.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
