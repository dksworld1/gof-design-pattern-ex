package desing.pattern.creational.builder;

public class Player {
	public int hp;
	public int mp;
	public String name;
	public String classType;
	
	@Override
	public String toString() {
		return String.format("Player@%d [name=%s, classType=%s, hp=%d, mp=%d]", this.hashCode(), name, classType, hp, mp);
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public static class Builder {
		public int hp=100;
		public int mp=100;
		public String name;
		public String classType;
		
		public Builder() {
			
		}
		
		public Builder(String name, String classType) {
			this.name = name;
			this.classType = classType;
		}
		
		public Player build() {
			Player player = new Player();
			player.setClassType(this.classType);
			player.setName(this.name);
			player.setHp(this.hp);
			player.setMp(this.mp);
			return player;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setclassType(String classType) {
			this.classType = classType;
			return this;
		}
		
		public Builder setHp(int hp) {
			this.hp = hp;
			return this;
		}
		
		public Builder setMp(int mp) {
			this.mp = mp;
			return this;
		}
		
		
	}
}
