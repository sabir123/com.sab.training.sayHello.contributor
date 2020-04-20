import com.sabir.training.rcp.extension.provider.ISayHello;

public class SayHelloAgain implements ISayHello {

	public SayHelloAgain() {
	}

	@Override
	public void sayHello() {
		System.out.println("SayHelloAgain.sayHello()");
	}
}
