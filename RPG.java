
public class RPG {
	public static void main(String [] args) {

		//キャラクター＝名前、体力、攻撃力、魔力
		Character c1=new Character("ミッキー",100,30,90);
		Character c2=new Character("ミニー",80,20,50);
		Character c3=new Character("ドナルド",90,40,80);
		Character c4=new Character("アリエル",50,30,80);

		//自己紹介
		c1.introduce();
		c2.introduce();
		c3.introduce();
		c4.introduce();

		System.out.println("ーーーーーーーバトル開始ーーーーーーーー");

		//c1がc3へ攻撃
		c1.attack(c3);
	}
}