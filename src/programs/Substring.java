package programs;

public class Substring {

	public static void main(String[] args) {

		String str = "Sarang is a tester ID 123";

//extracting the ID

		String withID = str.substring(str.indexOf("ID") + 3).trim();

		int id = Integer.parseInt(withID);// to get data in int format
		System.out.println(id);

		String idstring = String.valueOf(id);
		System.out.println(idstring.toString());

		System.out.println(withID);

	}

}
