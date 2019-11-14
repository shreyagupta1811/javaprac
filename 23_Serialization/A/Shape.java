import java.io.Serializable;

class Shape implements Serializable{
	int l;
	int b;
	int h;

	Shape(int l,int b,int h){
            this.l=l;
			this.b=b;
			this.h=h;
	}
}
//the class whose object has to be converted to txt file and then again converted to Object on other end.