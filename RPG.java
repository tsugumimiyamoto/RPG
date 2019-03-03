
public class RPG {
	public static void main(String [] args) {

		Character c;
		c=new Character();
		c.hp=100;
		c.mp=90;
		c.name="ミッキー";

		Character c2;
		c2=new Character();
		c2.hp=80;
		c2.mp=50;
		c2.name="ミニー";

		Character c3;
		c3=new Character();
		c3.hp=90;
		c3.mp=80;
		c3.name="ドナルド";

		Character c4;
		c4=new Character();
		c4.hp=50;
		c4.mp=80;
		c4.name="アリエル";

		c.introduce();
		c2.introduce();
		c3.introduce();
		c4.introduce();

		System.out.println("さあ、だれと冒険する？");
		System.out.println("この中からひとり選択しよう！");
	}
}