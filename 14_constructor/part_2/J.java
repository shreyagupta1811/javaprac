//case 1
/*class X{
     private X(){

	 }
}
class J extends X{

}*/

//case 2
/*final class X{

}
class J extends X{

}*/
//to prohibit to call child class constructor in parent class there are following two methods-
//either you can mark the const of parent class as private
//or make the class as final.