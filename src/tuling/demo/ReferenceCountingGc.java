package tuling.demo;

/**
 * 引用计数器  循环引用
 */
public class ReferenceCountingGc {
	Object instance = null;

	public static void main(String[] args) {
		ReferenceCountingGc objA = new ReferenceCountingGc();
		ReferenceCountingGc objB = new ReferenceCountingGc();
		objA.instance = objB;
		objB.instance = objA;
		objA = null;
		objB = null;
	}
}
