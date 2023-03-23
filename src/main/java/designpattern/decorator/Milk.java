package designpattern.decorator;

class Milk extends CoffeeDecorator {
	public Milk(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", milk";
	}
}