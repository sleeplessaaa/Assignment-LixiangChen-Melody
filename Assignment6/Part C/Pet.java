package animalHospital;

public class Pet {
		private String name;
		private String owner;
		private String color;
		
		public static final int MALE = 1;
		public static final int FEMALE = 2;
		public static final int SPAYED = 3;
		public static final int NEUTERED = 4;
		
		private enum sex{MALE, FEMALE, SPAYED, NEUTERED};
		
		protected sex petSex;
		
		//constructoe
		public Pet (String petName,String ownerName, String color){
			this.name = petName;
			this.owner = ownerName;
			this.color = color;
		}
		
		public String getPetName(){
			return name;
		}
		
		public String getOwnerName(){
			return owner;
		}
	
		
		public String getColor(){
			return color;
		}
	
		public void setSex(int sexid){
			try{
				switch(sexid){
				case MALE:
					petSex = sex.MALE;
					break;
				case FEMALE:
					petSex = sex.FEMALE;
					break;
				case SPAYED:
					petSex = sex.SPAYED;
					break;
				case NEUTERED:
					petSex = sex.NEUTERED;
					break;
				}
			}catch(Exception e){
				  throw new IllegalArgumentException("Value not allowed");
			}
		}
		
		public String getSex(){
				return petSex.toString();
		}
		
		@Override
		public String toString(){
			String sHelp = this.getClass().getName().toUpperCase();
			return sHelp.substring(sHelp.lastIndexOf(".")+1)+":\n" + this.name + "owned by" +
			        this.owner + "\nColor:" + this.color + "\nSex: " + this.getSex() + "\n";
		}
		
}
