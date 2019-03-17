
class Wicth extends Character{
//名前、HP、攻撃力、MP（Characterクラスから継承）
	public Wicth(String name, int hp, int power, int mp) {
		super(name, hp, power, mp);
	}
//自己紹介
	public void introduce() {
		System.out.println("わたしは魔女の"+name+"よ！");
		System.out.println("HP "+this.hp+" / POWER "+this.power+" / MP "+this.mp);
		System.out.println("『ミッキーと一緒に旅をしているのよ！』");
	}
}