
public class RPG {

	public static void main(String [] args) {
		Character [] mouse=new Character [2];
		Character [] duck=new Character [2];

		//キャラクター＝名前、体力、攻撃力、魔力
		mouse [0]=new Brave("ミッキー",100,30,90);
		mouse [1]=new Witch("ミニー",80,20,50);
		duck [0]=new Gunman("ドナルド",90,40,80);
		duck [1]=new Fairy("デイジー",50,30,80);

		//自己紹介・バトル
		for(int i=0; i<mouse.length; i++) {
			for(int j=0; j<duck.length; j++){
				System.out.println("【TEAM mouse】");
				mouse [i].introduce();
				mouse[i].attack(duck[j]);
				System.out.println("【TEAM duck】");
				duck [j].introduce();
				duck[j].attack(mouse[i]);
			}
		}
	}
}