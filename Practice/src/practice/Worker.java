package practice;

public class Worker {
	public String Name;
	public int money;
	public int age;
	public int price;
	
	public Worker(String Name, int money) {
		this.Name = Name;
		this.money = money;
	}
	
	public void takeStarCafe(StarCafe cafe) {
		cafe.takeCoffee(price);
		money -= price;
	}
	public void takeBeanCafe(BeanCafe cafe) {
		cafe.takeCoffee(price);
		money -= price;
	}
		public void showInfo() {
			System.out.println(Name +" 의 남은 돈은 "+ money +"원 입니다.");
		}
	}

