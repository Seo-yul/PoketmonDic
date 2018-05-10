package poketmon.vo;

public class Poketmon {
	private String ko_name = null; //한국이름
	private String jp_name = null; //일본이름
	private String number = null; //번호
	private String type = null; //타입
	private String sort = null; //분류
	private String spec = null; //특성
	private String hspec = null; //숨겨진 특성
	private String exp = null; //경험치
	private String tall = null; //키
	private String weight = null; //몸무게
	private String crate = null; //포획률
	private String grate = null; //몸무게
	
	public Poketmon() {
		super();
	}
	
	public Poketmon(String ko_name, String jp_name, String number, String type, String sort, String spec, String hspec,
			String exp, String tall, String weight, String crate, String grate) {
		super();
		this.ko_name = ko_name;
		this.jp_name = jp_name;
		this.number = number;
		this.type = type;
		this.sort = sort;
		this.spec = spec;
		this.hspec = hspec;
		this.exp = exp;
		this.tall = tall;
		this.weight = weight;
		this.crate = crate;
		this.grate = grate;
	}

	public String getKo_name() {
		return ko_name;
	}
	public void setKo_name(String ko_name) {
		this.ko_name = ko_name;
	}
	public String getJp_name() {
		return jp_name;
	}
	public void setJp_name(String jp_name) {
		this.jp_name = jp_name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getHspec() {
		return hspec;
	}
	public void setHspec(String hspec) {
		this.hspec = hspec;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getTall() {
		return tall;
	}
	public void setTall(String tall) {
		this.tall = tall;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCrate() {
		return crate;
	}
	public void setCrate(String crate) {
		this.crate = crate;
	}
	public String getGrate() {
		return grate;
	}
	public void setGrate(String grate) {
		this.grate = grate;
	}
	@Override
	public String toString() {
		return "Poketmon [ko_name=" + ko_name + ", jp_name=" + jp_name + ", number=" + number + ", type=" + type
				+ ", sort=" + sort + ", spec=" + spec + ", hspec=" + hspec + ", exp=" + exp + ", tall=" + tall
				+ ", weight=" + weight + ", crate=" + crate + ", grate=" + grate + "]";
	}
}
