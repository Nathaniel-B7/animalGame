package animalGame;

public class Fish extends Animal {

	
	@Override
	public int findFood() {
		// TODO Auto-generated method stub
		setHunger(getHunger() + 7);
		return 0;
	}

	@Override
	public int findWater() {
		// TODO Auto-generated method stub
		setThirst(getThirst() + 15);
		return 0;
	}

	@Override
	public int findWarmth() {
		// TODO Auto-generated method stub
		setWarmth(getWarmth() + 10);
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal: Fish" + "\nHunger: " + findFood() + "\nThirst: " + findWater() + "\nWarmth: " + findWarmth();
	}
	
	
	
}
