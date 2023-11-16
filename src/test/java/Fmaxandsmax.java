import org.testng.annotations.Test;

public class Fmaxandsmax {
	@Test
	public void fmaxandsmax() {
		int[] a= {5,7,6,2,1,3};
		int fmax=0;
		int smax=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=fmax) {
				if(a[i]!=fmax) {
					smax=fmax;
				}
				fmax=a[i];
			}
			else if(smax==fmax||smax<a[i]) {
				smax=a[i];
				
			}
			
		}
		System.out.println(fmax);
		System.out.println(smax);

	}

}
