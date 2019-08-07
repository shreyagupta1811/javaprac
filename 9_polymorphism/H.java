interface Radio{
      void powerController();
	  void soundController();
	  void bandSelector();
	  void  channelSelector();
}

class  LGRadio implements Radio{
	public void powerController(){
             System.out.println("powercontroller=LGRadio");
	}
	public  void soundController(){
		    System.out.println("soundcontroller=LGRadio");			    	    
	}
	public  void bandSelector(){
		    System.out.println("bandselector=LGRadio");			    	    
	}
    public  void channelSelector(){
		    System.out.println("channelselector=LGRadio");			    	    
	}
}

class  SamsungRadio implements Radio{
	public void powerController(){
             System.out.println("powercontroller=SamsungRadio");
	}
	public  void soundController(){
		    System.out.println("soundcontroller=SamsungRadio");			    	    
	}
	public  void bandSelector(){
		    System.out.println("bandselector=SamsungRadio");			    	    
	}
	public  void channelSelector(){
		    System.out.println("channelselector=SamsungRadio");			    	    
	}
}

class  PanasonicRadio implements Radio{
	public void powerController(){
             System.out.println("powercontroller=panasonicRadio");
	}
	public  void soundController(){
		    System.out.println("soundcontroller=panasonicRadio");			    	    
	}
	public  void bandSelector(){
		    System.out.println("bandselector=PanasonicRadio");			    	    
	}
	public  void channelSelector(){
		    System.out.println("channelselector=panasonicRadio");			    	    
	}
}
class H{
	public static void main(String[] args){
      LGRadio lr = new LGRadio();
	  operatorRadio(lr);
	  System.out.println("#######################");
	  SamsungRadio sr = new SamsungRadio();
	  operatorRadio(sr);
	  System.out.println("#######################");
	  PanasonicRadio pr = new PanasonicRadio();
	  operatorRadio(pr);
	  System.out.println("#######################");
	}
	static void operatorRadio(Radio r){
          r.powerController();
		  r.soundController();
		  r.bandSelector();
		  r.channelSelector();
	}

	/*static void operatorRadio(SamsungRadio r){
          r.powerController();
		  r.soundController();
		  r.bandSelector();
		  r.channelSelector();
	}

	static void operatorRadio(LGRadio r){
          r.powerController();
		  r.soundController();
		  r.bandSelector();
		  r.channelSelector();
	}

	static void operatorRadio(PanasonicRadio r){
          r.powerController();
		  r.soundController();
		  r.bandSelector();
		  r.channelSelector();
	}*/
}