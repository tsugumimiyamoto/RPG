
public class Character {
	private String name; //名前
	private int hp; //体力
	int power; //攻撃力
	private int mp; //魔力

public Character(String name, int hp, int power, int mp) {
	this.name=name;
	this.hp=hp;
	this.power=power;
	this.mp=mp;
}
	public void introduce() {
		System.out.println("わたしの名前は"+this.name+"！");
		System.out.println("HP "+this.hp+" / POWER "+this.power+" / MP "+this.mp+"だよ！！");
	}
	public void attack() {
		System.out.println(this.name+"の攻撃！");
	}
	public void damage(int power) {
		System.out.println(this.name+"は"+power+"のダメージを受けた！！");
		this.hp=hp - power;
		System.out.println(this.name+"のHPは"+this.hp+"になった。");
	}
}