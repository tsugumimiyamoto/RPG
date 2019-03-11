
public class Character {
	private String name; //名前
	private int hp; //体力
	private int power; //攻撃力
	private int mp; //魔力
	
	public Character(String name, int hp, int power, int mp) {
		this.name=name;
		this.hp=hp;
		this.power=power;
		this.mp=mp;
	}
	//自己紹介メソッド
	public void introduce() {
		System.out.println("わたしの名前は"+this.name+"！");
		System.out.println("HP "+this.hp+" / POWER "+this.power+" / MP "+this.mp+"だよ！！");
	}
	//攻撃メソッド
	//キャラクタークラスからターゲットを設定。攻撃するキャラクターとダメージを表示。ターゲットメソッドより攻撃を与える。（mainには入れない。）
	public void attack(Character target) {
		System.out.println(this.name+"の攻撃！");
		System.out.println(this.name+"は"+this.power+"のダメージを与えた！！");
		target.damage(this.power);
	}
	//ダメージメソッド
	//キャラクターにダメージを受けさせる。ダメージを受けたキャラクターのHPを減らす。
	public void damage(int power) {
		System.out.println(this.name+"は"+power+"のダメージを受けた！！");
		this.hp=hp - power;
		System.out.println(this.name+"のHPは"+this.hp+"になった。");
	}
}