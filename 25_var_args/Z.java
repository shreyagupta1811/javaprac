//syntax code
class Z{
	//case 1---OK
	/*void abc(int[][] i){

	}*/

	//case 2---NOT OK
	/*void abc(int...... j){

	}*/

	//case 3----OK
	/*void abc(int[]...x){

	}*/

	//case 4-----NOT OK
	/*void abc(int...[] y){

	}*/
}