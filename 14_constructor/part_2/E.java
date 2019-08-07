class F{
	private F(){

	}
}
class E /* extends F*/{

}
/*u can not mark parent class constructor as a private becoz when default cons of class E run its first statement super will call parent
class constructor which is private so it give compile time erroe*/
