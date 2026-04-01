package jump2java;

public class simple05_04 {
	class Updater {
		void update(Counter myCounter) {
			int count;
			count++;
	}
}

class Counter {
	int count = 0;
}

public class Sample {
	public static void main(String[] args) {
		Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
	}
}





