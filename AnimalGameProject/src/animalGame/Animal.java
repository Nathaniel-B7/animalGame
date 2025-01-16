package animalGame;

public abstract class Animal {
	// Initialize fields of animal stats
		private int hunger;
		private int thirst;
		private int warmth;
		
		public abstract int findFood();
		public abstract int findWater();
		public abstract int findWarmth();
		public abstract String toString();

		/**
		 * Gets the hunger
		 * @return hunger
		 */
		public int getHunger() {
			return hunger;
		}
		/**
		 * Sets the hunger
		 * @param hunger
		 */
		public void setHunger(int hunger) {
			this.hunger = hunger;
		}
		/**
		 * Gets the thirst
		 * @return thirst
		 */
		public int getThirst() {
			return thirst;
		}
		/**
		 * Sets the thirst
		 * @param thirst
		 */
		public void setThirst(int thirst) {
			this.thirst = thirst;
		}

		/**
		 * Gets the warmth
		 * @return warmth
		 */
		public int getWarmth() {
			return warmth;
		}
		
		/**
		 * Sets the warmth
		 * @param warmth
		 */
		public void setWarmth(int warmth) {
			this.warmth = warmth;
		}
		
		public void menu() {
			toString();

		
		

		} 
}
