
class Gunman extends Character{

//名前、HP、攻撃力、MP（Characterクラスから継承）
	public Gunman(String name, int hp, int power, int mp) {
		super(name, hp, power, mp);
	}
	//自己紹介
	public void introduce() {
		System.out.println("『おれは銃使いの"+name+"だ！魔王を倒すため旅をしている！！』");
		System.out.println("HP "+this.hp+" / POWER "+this.power+" / MP "+this.mp);
	}
	//攻撃
	public void gunman(String name) {
		System.out.println(this.name+"は銃を放った。");
	}
	//相手にダメージを与える
	public void attack(Character taget) {
		gunman(taget.name);
		taget.damage(this.power);
	}
}
