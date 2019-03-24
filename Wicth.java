
class Witch extends Character{
	
//名前、HP、攻撃力、MP（Characterクラスから継承）
	public Witch(String name, int hp, int power, int mp) {
		super(name, hp, power, mp);
	}
//自己紹介
	public void introduce() {
		System.out.println("『わたしは魔女の"+name+"よ！ミッキーと一緒に旅をしているのよ！！』");
		System.out.println("HP "+this.hp+" / POWER "+this.power+" / MP "+this.mp);
	}
	//攻撃
	public void brave(String name) {
		System.out.println(this.name+"は炎を放つ。");
	}
	//相手にダメージを与える
	public void attack(Character taget) {
		brave(taget.name);
		taget.damage(this.power);
	}
}