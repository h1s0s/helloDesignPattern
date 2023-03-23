package designpattern.decorator;

class Whip extends CoffeeDecorator {
	public Whip(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.7;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", whip";
	}
}