package test;

public class GasTank {
        double totalGas = 100;
        
        public double addGas(double add){
        	totalGas = totalGas + add;
        	return totalGas;
        }
        
        public double useGas(double use){
        	totalGas = totalGas - use;
        	return totalGas;
        }
        
        public double getGasLevel(){
        	return this.totalGas;
        }
        
}
