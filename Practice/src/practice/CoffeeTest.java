package practice;

public class CoffeeTest {

	public static void main(String[] args) {
		StarCafe sCafe = new StarCafe("서면점");
		BeanCafe bCafe = new BeanCafe("서면점");
		Worker kim = new Worker("김 씨", 10000);
		Worker lee = new Worker("이 씨", 10000);
		
		
		kim.takeStarCafe(sCafe, 4000);
		kim.showInfo();	
		sCafe.showInfo();
		
		lee.takeBeanCafe(bCafe, 4500);
		lee.showInfo();
		bCafe.showInfo();
	}

}
