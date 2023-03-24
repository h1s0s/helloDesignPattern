package designpattern.factorymethod.study2;

import designpattern.factorymethod.study2.car.Car;
import designpattern.factorymethod.study2.factory.CarFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Scanner scanner = new Scanner(System.in);
		List<Car> carList = new ArrayList<>();

		while(true) {
			System.out.println("===========================================");
			System.out.println("차종을 입력하세요(Bus, Taxi, Train)");
			System.out.println("멈추려면 end를 입력하세요");
			System.out.println("현재 생성된 차들을 조회하려면 show를 입력하세요.");
			System.out.println("===========================================");
			String type = scanner.nextLine();
			if("end".equalsIgnoreCase(type)){
				System.out.println("종료합니다.");
				break;
			}
			if("show".equalsIgnoreCase(type)){
				System.out.println(carList);
				System.out.println(carList.toString());
				continue;
			}

			try {
				Car car = factory.createCar(type);
				car.run();
				car.stop();
				carList.add(car);
			} catch (IllegalArgumentException e){
				System.out.println("생성할 수 없는 차종입니다. 다시 입력해주세요.");
			}

		}
	}
}
