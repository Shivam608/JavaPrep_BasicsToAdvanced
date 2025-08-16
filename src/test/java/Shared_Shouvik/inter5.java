import java.util.*;
public class inter5 {
	
	int a =10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//apple,apple,apple,orange,orange,mango
		
		String[] str = {"apple","apple","apple","orange","orange","mango"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String s:str) {
			
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s,1);
			}
		}
		
		System.out.println(map);
		
		String max = null;
		int count = -1;
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > count) {
				max = entry.getKey();
				count = entry.getValue();
			}
		}
		
		System.out.println("Most repeated element is: "+max+" and the occurance is: "+count);

	}

}


// class A extends B
// B b = new A();
// A a = new A();
// B obj = new B();

//RestAssured.baseURI = "www.google.com";
//
//String body = "hkdsh";
//
//String response = RestAssured.given().queryParam().header("Content-Type", "application/json").body(body)
//.when().post("/image")
//.then().statusCode(201).extract().response().asString();

//ObjectMapper

