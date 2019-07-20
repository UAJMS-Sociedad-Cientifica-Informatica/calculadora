import java.util.ArrayList;

public class Resultado {
	public float resultado(ArrayList e) {
		float res = 0;
		for (int i = 0; i < e.size(); i++) {
			if (e.get(i).toString().equals("/")) {
				res = Float.valueOf(e.get(i - 1).toString()) / Float.valueOf(e.get(i + 1).toString());
				e.add(i + 2, res);// posible casteo
				e.remove(i + 1);
				e.remove(i);
				e.remove(i - 1);
				i = -1;
				continue;
			}

			if (e.get(i).toString().equals("*")) {

				res = Float.valueOf(e.get(i - 1).toString()) * Float.valueOf(e.get(i + 1).toString());
				e.add(i + 2, res);// posible casteo
				e.remove(i + 1);
				e.remove(i);
				e.remove(i - 1);

				i = -1;
				continue;

			}
		}
		// }
		for (int i = 0; i < e.size(); i++) {
			if (e.get(i).toString().equals("+")) {
				res = Float.valueOf(e.get(i - 1).toString()) + Float.valueOf(e.get(i + 1).toString());
				e.add(i + 2, res);// posible casteo
				e.remove(i + 1);
				e.remove(i);
				e.remove(i - 1);
				i = -1;
				continue;
			}

			if (e.get(i).toString().equals("-")) {

				res = Float.valueOf(e.get(i - 1).toString()) - Float.valueOf(e.get(i + 1).toString());
				e.add(i + 2, res);// posible casteo
				e.remove(i + 1);
				e.remove(i);
				e.remove(i - 1);

				i = -1;
				continue;

			}

		}
		return res;
	}

	
	/*public static void main(String[] args) {
		ArrayList l = new ArrayList<String>();
		l.add("5");
		l.add("+");
		l.add("4");
		l.add("*");
		l.add("5");
		l.add("-");
		l.add("-4");
		l.add("/");
		l.add("3");
		System.out.println(l.toString());
		System.out.println(resultado(l));
	}*/
}
