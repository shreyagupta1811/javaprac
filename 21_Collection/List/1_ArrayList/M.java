import java.util.ArrayList;
class M{
	public static void main(String[] args){
           ArrayList a=new ArrayList();
		   a.add("mohan");
		   a.add("sohan");
           a.add("rohan");
			a.add("gohan");
		   a.add("tohan");
		   //case 1
			for(Object obj:a){
                       System.out.println(obj);
			}
			//case 2
			/*for(String str:a){
                       System.out.println(str);
			}*/
	}
}
/*object cannot be converted to string in case 2 we know that inside arraylist elemnets not directly stored but the obj ref var stored 
so object can not be converted to string*/
