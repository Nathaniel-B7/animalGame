package animalGame;

public class Lion extends Animal {

	@Override
	public int findFood() {
		// TODO Auto-generated method stub
		setHunger(getHunger() + 10);
		return 0;
	}

	@Override
	public int findWater() {
		// TODO Auto-generated method stub
		setThirst(getThirst() + 6);
		return 0;
	}

	@Override
	public int findWarmth() {
		// TODO Auto-generated method stub
		setWarmth(getWarmth() + 5);
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal: Lion" + "\nHunger: " + findFood() + "\nThirst: " + findWater() + "\nWarmth: " + findWarmth();
	}

}
