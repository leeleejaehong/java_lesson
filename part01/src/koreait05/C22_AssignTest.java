package koreait05;

public class C22_AssignTest {

	public static void main(String[] args) {
		
    //참고 : 증가(감소)연산자, 축챡연산자(+=,-=,*=,/=...)
	int i=10, sum=0;
	i=i+1; // i=11
	i+=1; // i=12
	i++; // i=13 (후치:postfix)
	++i; // i=14 (전치:prefix?)
	//전치, 후치는 다른 명령어들과 같이 쓰일때에는 차이가 있습니다.
	System.out.println("i++ ? " + i++);
	System.out.println("++i ? " + ++i);
	sum=sum+i;
	sum+=i;
	System.out.println("sum ? " + sum);
	
	//
	i--;
	--i;
	sum = sum - 10;
	sum -= 10;

	}

}
