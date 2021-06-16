
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Mappractice {
	public static void main(String[] args) throws Exception {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "抹茶クリームフラペチーノ");
		map.put(2, "アメリカーノ");
		map.put(3, "バニララテ");
		map.put(4, "コーヒーフラペチーノ");
		map.put(5, "キャラメルマキアート");
		map.put(6, "ドピオコンパナ");
		
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		System.out.println(map.get(5));
		
		List<String> list = new ArrayList<>(map.values());
		System.out.println(list);
		
		
	}

}
