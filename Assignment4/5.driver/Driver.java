package test;

public class Driver {
GasTank gastank = new GasTank();
	
	public double addGas(double add) {
		gastank.addGas(add);
		return gastank.getGasLevel();
	}

	public boolean drive() {
		if (gastank.getGasLevel() == 0)
			this.addGas(10);
		return true;
	}
	
	public double useGas(double use) {
		gastank.useGas(use);
		return gastank.getGasLevel();
	}
}
