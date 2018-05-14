package poketmon.vo;

public class Poketmon {
	private String No = null; //번호
	private String kor_name = null; //한국이름
	private String jap_name = null; //일본이름
	private String height = null; //키
	private String weight = null; //몸무게
	private int c_rate = 0; //포획률
	private String g_rate = null; //성비율
	private String type = null; //타입
	private String sort = null; //분류
	private String character = null; //특성
	private String h_character = null; //숨겨진 특성
	private String e_point = null; //경험치
	
	public Poketmon() {
		super();
	}

	public Poketmon(String no, String kor_name, String jap_name, String height, String weight, int c_rate,
			String g_rate, String type, String sort, String character, String h_character, String e_point) {
		super();
		this.No = no;
		this.kor_name = kor_name;
		this.jap_name = jap_name;
		this.height = height;
		this.weight = weight;
		this.c_rate = c_rate;
		this.g_rate = g_rate;
		this.type = type;
		this.sort = sort;
		this.character = character;
		this.h_character = h_character;
		this.e_point = e_point;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public String getKor_name() {
		return kor_name;
	}

	public void setKor_name(String kor_name) {
		this.kor_name = kor_name;
	}

	public String getJap_name() {
		return jap_name;
	}

	public void setJap_name(String jap_name) {
		this.jap_name = jap_name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getC_rate() {
		return c_rate;
	}

	public void setC_rate(int c_rate) {
		this.c_rate = c_rate;
	}

	public String getG_rate() {
		return g_rate;
	}

	public void setG_rate(String g_rate) {
		this.g_rate = g_rate;
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

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getH_character() {
		return h_character;
	}

	public void setH_character(String h_character) {
		this.h_character = h_character;
	}

	public String getE_point() {
		return e_point;
	}

	public void setE_point(String e_point) {
		this.e_point = e_point;
	}

	@Override
	public String toString() {
		return "Poketmon [No=" + No + ", kor_name=" + kor_name + ", jap_name=" + jap_name + ", height=" + height
				+ ", weight=" + weight + ", c_rate=" + c_rate + ", g_rate=" + g_rate + ", type=" + type + ", sort="
				+ sort + ", character=" + character + ", h_character=" + h_character + ", e_point=" + e_point + "]";
	}
	
}
