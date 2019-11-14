class M{
	M(float...x){
             System.out.println(x.length);
	}
	public static void main(String... args){
              new M();
			  new M(12.34f);
	}

}
/*here if we are not parsing any  argument than also the array of 0 element is created*/