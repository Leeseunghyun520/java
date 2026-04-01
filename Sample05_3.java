package jump2java;

public class Sample05_3 {
	int a;
	
	void varTest(Sample05_3 sample) {
		sample.a++;
	}
    public static void main(String[] args) {
    	Sample05_3 sample = new Sample05_3();
    	sample.a = 1;
    	sample.varTest(sample);
    	System.out.println(sample.a);
    }
}
