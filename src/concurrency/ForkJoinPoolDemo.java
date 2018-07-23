package concurrency;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolDemo {

	public static void main(String[] args) {

		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		commonPool.invoke(new CustomRecursiveAction("testing forkjoin pool test test test"));
		
	}

}
