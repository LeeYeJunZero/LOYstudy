
	class point{
		public int x, y;
		public void set(int x, int y) {
			this.x = x; this.y = y;
		}
		
		public void showpoint() {
			System.out.println("("+x+","+y+")");
		} // 메소드 구현
	}
class ColorPoint extends point{ // 컬러포인트를 확장
	public String color;
	public void setColor(String color) {
this.color = color;
}
	public void showColorPoint() { //메소드 구현
		System.out.print(color);
		showpoint();//호출
	}
	
	
public class other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p = new point();
		p.set(1, 2); //메소드 호출 후 대입
		p.showpoint();// 메소드 호출
		
		ColorPoint cp= new ColorPoint();
		
		cp.set(3, 4); //point 클래스의 set 호출 후 3.4 대입
		cp.setColor("red");//ColorPoint 메소드 안의 메소드 호출
		cp.showColorPoint();//메소드 호출
		
		
}
}
}
