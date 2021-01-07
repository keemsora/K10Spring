package di;

public class AvengersVO {
	//멤버변수
	private String name;
	private String heroName;
	private String ability;
	private String age;
	
	//생성자
	public AvengersVO(String name, String heroName, String ability, String age) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.ability = ability;
		this.age = age;
	}

	//setter: 여기서는 생성자가 setter의 역할을 대신함
	//getter
	public String getName() {
		return name;
	}

	public String getHeroName() {
		return heroName;
	}

	public String getAbility() {
		return ability;
	}

	public String getAge() {
		return age;
	}
	
	
	
}
