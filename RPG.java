
public class RPG {
	public static void main(String [] args) {
		//キャラクター＝名前、体力、攻撃力、魔力
		Character c1=new Brave("ミッキー",100,30,90);
		Character c2=new Wicth("ミニー",80,20,50);
		Character c3=new Gunman("ドナルド",90,40,80);
		Character c4=new Fairy("アリエル",50,30,80);
		//自己紹介
		c1.introduce();
		c2.introduce();
		c3.introduce();
		c4.introduce();
		//バトル
		System.out.println("ーーーーーーバトル開始ーーーーーーー");
		c3.attack(c1);
		System.out.println();
		c1.attack(c3);
	}
}